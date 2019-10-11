package com.shigen.wang.provider;

import com.shigen.wang.account.AccountUser;
import com.shigen.wang.account.UserServiceGrpc;
import com.shigen.wang.base.Base;
import com.shigen.wang.jooq.tables.pojos.User;
import com.shigen.wang.service.UserService;
import com.shigen.wang.util.GrpcResult;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by shigen.wang 2019/08/19
 *
 * @author shigen.wang
 */
@GrpcService
public class UserProvider extends UserServiceGrpc.UserServiceImplBase {

    private Logger logger = LoggerFactory.getLogger(UserProvider.class);

    @Autowired
    private UserService userService;

    @Override
    public void createUser(AccountUser.User request, StreamObserver<Base.Result> responseObserver) {
        User user = new User();
        BeanUtils.copyProperties(request, user);
        int result = userService.createUser(user);
        boolean flag = result > 0;
        Base.Result baseResult = Base.Result.newBuilder().setCode(200).setIsSuccess(flag).setMessage("result is " + flag).build();
        GrpcResult<Base.Result> grpcResult = GrpcResult.Observer(responseObserver);
        grpcResult.send(baseResult);
    }

    @Override
    public void deleteUserById(AccountUser.UserIdReq request, StreamObserver<Base.Result> responseObserver) {
        Integer id = request.getId();
        int num = userService.deleteUserById(id);
        boolean flag = num > 0;
        Base.Result baseResult = Base.Result.newBuilder().setCode(200).setIsSuccess(flag).setMessage("result is " + flag).build();
        GrpcResult<Base.Result> grpcResult = GrpcResult.Observer(responseObserver);
        grpcResult.send(baseResult);
    }

    @Override
    public void updateUser(AccountUser.User request, StreamObserver<Base.Result> responseObserver) {
        User user = new User();
        BeanUtils.copyProperties(request,user);
        int result = userService.updateUser(user);
        boolean flag = result > 0;
        Base.Result baseResult = Base.Result.newBuilder().setCode(200).setIsSuccess(flag).setMessage("result is " + flag).build();
        GrpcResult<Base.Result> grpcResult = GrpcResult.Observer(responseObserver);
        grpcResult.send(baseResult);
    }

    @Override
    public void findUserById(AccountUser.UserIdReq request, StreamObserver<AccountUser.FindUserByIdResp> responseObserver) {
        int id = request.getId();
        User user = userService.findUserById(id);
        boolean flag = user != null;
        AccountUser.User user1 = AccountUser.User.newBuilder().setGender(user.getGender()).setEmail(user.getEmail()).setId(user.getId()).setName(user.getName()).build();
        Base.Result baseResult = Base.Result.newBuilder().setCode(200).setIsSuccess(flag).setMessage("result is " + flag).build();
        GrpcResult<AccountUser.FindUserByIdResp> findUserByIdRespGrpcResult = GrpcResult.Observer(responseObserver);
        AccountUser.FindUserByIdResp resp = AccountUser.FindUserByIdResp.newBuilder().setResult(baseResult).setUser(user1).build();
        findUserByIdRespGrpcResult.send(resp);
    }

    @Override
    public void findUserAll(AccountUser.Null request, StreamObserver<AccountUser.FindUserResp> responseObserver) {
        List<User> users = userService.findUserAll();
        List<AccountUser.User> list = users.stream().map(u -> AccountUser.User.newBuilder().setId(u.getId()).setGender(u.getGender()).setEmail(u.getName()).setName(u.getName()).build()).collect(Collectors.toList());
        GrpcResult<AccountUser.FindUserResp> result = GrpcResult.Observer(responseObserver);
        AccountUser.FindUserResp findUserResp = AccountUser.FindUserResp.newBuilder().addAllUserList(list).build();
        result.send(findUserResp);
    }
}
