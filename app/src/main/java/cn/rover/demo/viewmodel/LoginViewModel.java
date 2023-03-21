package cn.rover.demo.viewmodel;

import androidx.lifecycle.ViewModel;
import cn.rover.demo.entity.LoginResult;
import cn.rover.demo.model.LoginModel;
import cn.rover.demo.utils.INetWorkCallback;


public class LoginViewModel extends ViewModel {

    private static final String TAG = "LoginViewModel";
    private LoginModel model;
    public LoginViewModel() {
        model = new LoginModel();
    }

    public void login(String name, String pass) {
        model.appLogin(name, pass, new INetWorkCallback<LoginResult>() {
            @Override
            public void onCallApiSuccess(LoginResult loginResult) {

                android.util.Log.e(TAG,"---onCallApiSuccess---");
            }

            @Override
            public void onCallApiFailure(Throwable throwable) {
                android.util.Log.e(TAG,"---onCallApiFailure---");
            }

            @Override
            public void onCompleted() {
                android.util.Log.e(TAG,"---onCompleted---");
            }
        });
    }
}