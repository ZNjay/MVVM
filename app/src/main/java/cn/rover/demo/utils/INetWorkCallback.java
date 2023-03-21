package cn.rover.demo.utils;

/**
 * @author Bob
 */
public interface INetWorkCallback<T> {

    void onCallApiSuccess(T t);

    void onCallApiFailure(Throwable throwable);

    void onCompleted();
}
