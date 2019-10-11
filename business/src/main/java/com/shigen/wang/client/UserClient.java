package com.shigen.wang.client;

import com.shigen.wang.account.AccountUser;
import com.shigen.wang.account.UserServiceGrpc;
import com.shigen.wang.base.Base;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Component;

/**
 * Created by shigen.wang 2019/09/04
 *
 * @author shigen.wang
 */
@Component
public class UserClient {

    @GrpcClient("integration-account-service")
    private UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    public boolean createUser(){
        AccountUser.User u = AccountUser.User.newBuilder().setEmail("xxx@qq.com").setGender(1).setName("name").build();
        Base.Result result= userServiceBlockingStub.createUser(u);
        return result.getIsSuccess();
    }
}
