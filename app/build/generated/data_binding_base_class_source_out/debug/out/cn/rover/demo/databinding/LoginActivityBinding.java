// Generated by data binding compiler. Do not edit!
package cn.rover.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import cn.rover.demo.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LoginActivityBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout container;

  @NonNull
  public final ImageView delete1;

  @NonNull
  public final ImageView delete2;

  @NonNull
  public final ImageView image;

  @NonNull
  public final ImageView img1;

  @NonNull
  public final ImageView img2;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final EditText nameEdit;

  @NonNull
  public final EditText passEdit;

  @NonNull
  public final RelativeLayout relay1;

  @NonNull
  public final RelativeLayout relay2;

  @NonNull
  public final View view1;

  @NonNull
  public final View view2;

  protected LoginActivityBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout container, ImageView delete1, ImageView delete2, ImageView image, ImageView img1,
      ImageView img2, Button loginButton, EditText nameEdit, EditText passEdit,
      RelativeLayout relay1, RelativeLayout relay2, View view1, View view2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.container = container;
    this.delete1 = delete1;
    this.delete2 = delete2;
    this.image = image;
    this.img1 = img1;
    this.img2 = img2;
    this.loginButton = loginButton;
    this.nameEdit = nameEdit;
    this.passEdit = passEdit;
    this.relay1 = relay1;
    this.relay2 = relay2;
    this.view1 = view1;
    this.view2 = view2;
  }

  @NonNull
  public static LoginActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.login_activity, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LoginActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LoginActivityBinding>inflateInternal(inflater, R.layout.login_activity, root, attachToRoot, component);
  }

  @NonNull
  public static LoginActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.login_activity, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LoginActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LoginActivityBinding>inflateInternal(inflater, R.layout.login_activity, null, false, component);
  }

  public static LoginActivityBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LoginActivityBinding bind(@NonNull View view, @Nullable Object component) {
    return (LoginActivityBinding)bind(component, view, R.layout.login_activity);
  }
}