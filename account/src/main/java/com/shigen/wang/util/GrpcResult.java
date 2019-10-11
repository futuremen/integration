package com.shigen.wang.util;

import io.grpc.stub.StreamObserver;

/**
 * Created by shigen.wang 2019/08/20
 *
 * @author shigen.wang
 */
public class GrpcResult<T> {

    private StreamObserver<T> observer;

    private GrpcResult(StreamObserver<T> observer) {
        this.observer = observer;
    }

    public void send(T t) {
        observer.onNext(t);
        observer.onCompleted();
    }

    public static<T> GrpcResult<T> Observer(StreamObserver<T> observer) {
        return new GrpcResult<>(observer);
    }
}
