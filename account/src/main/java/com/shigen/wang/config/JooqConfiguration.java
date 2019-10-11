package com.shigen.wang.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;


/**
 * Created by shigen.wang 2019/08/19
 *
 * @author shigen.wang
 */
@Configuration
public class JooqConfiguration {

    private static final Logger log = LoggerFactory.getLogger(JooqConfiguration.class);
    @Value("${mysql.maxActive:100}")
    private int maxActive;
    @Value("${mysql.minIdle:1}")
    private int minIdle;
    @Value("${mysql.maxWait:2000}")
    private int maxWait;
    @Value("${mysql.timeBetweenEvictionRunsMillis:60000}")
    private int timeBetweenEvictionRunsMillis;
    @Value("${mysql.minEvictableIdleTimeMillis:300000}")
    private int minEvictableIdleTimeMillis;
    @Value("${spring.datasource.user.url}")
    private String url;
    @Value("${spring.datasource.user.username}")
    private String username;
    @Value("${spring.datasource.user.password}")
    private String password;

    public JooqConfiguration() {
    }

    @Bean
    public DSLContext createDSLContext() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxActive(this.maxActive);
        dataSource.setMinIdle(this.minIdle);
        dataSource.setMaxWait((long)this.maxWait);
        dataSource.setTimeBetweenEvictionRunsMillis((long)this.timeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis((long)this.minEvictableIdleTimeMillis);
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);
        dataSource.setValidationQuery("SELECT 'x'");
        return this.generateDslContext(dataSource);
    }

    protected DSLContext generateDslContext(DataSource shardDataSource) {
        TransactionAwareDataSourceProxy transactionAwareDataSource = new TransactionAwareDataSourceProxy(shardDataSource);
        DataSourceConnectionProvider connectionProvider = new DataSourceConnectionProvider(transactionAwareDataSource);
        DefaultConfiguration config = new DefaultConfiguration();
        config.setSQLDialect(SQLDialect.MYSQL);
        config.setConnectionProvider(connectionProvider);
        return new DefaultDSLContext(config);
    }
}
