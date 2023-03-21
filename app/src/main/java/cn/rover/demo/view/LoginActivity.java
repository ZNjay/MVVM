package cn.rover.demo.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import cn.rover.demo.R;
import cn.rover.demo.databinding.LoginActivityBinding;
import cn.rover.demo.viewmodel.LoginViewModel;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    LoginActivityBinding binding;
    LoginViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.login_activity);
        viewModel = new LoginViewModel();

        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }

    private void login() {

        if (TextUtils.isEmpty(binding.nameEdit.getEditableText().toString())) {
            Toast.makeText(getApplication(), "请输入账号！", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(binding.passEdit.getEditableText().toString())) {
            Toast.makeText(getApplication(), "请输入密码！", Toast.LENGTH_SHORT).show();
            return;
        }

        viewModel.login(binding.nameEdit.getEditableText().toString(),binding.passEdit.getEditableText().toString());
    }
}