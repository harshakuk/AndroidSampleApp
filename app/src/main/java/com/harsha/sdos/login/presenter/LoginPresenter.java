package com.harsha.sdos.login.presenter;

import android.content.Context;
import android.util.Log;

import com.harsha.sdos.login.interactor.LoginInteractor;
import com.harsha.sdos.login.interfaces.ILoginPresenter;
import com.harsha.sdos.login.interfaces.ILoginView;
import com.harsha.sdos.models.User;
import com.harsha.sdos.utils.Intents;
import com.harsha.sdos.utils.UserSession;

/**
 * Created by ruano on 09/02/2018.
 */

public class LoginPresenter implements ILoginPresenter{

    Context context;
    ILoginView view;
    String pass;

    public LoginPresenter(Context context, ILoginView view){
        this.context = context;
        this.view = view;
    }

    private LoginInteractor interactor = new LoginInteractor(context, this);

    public void login(String userName, String pass){

        view.showWait();

        this.pass = pass;
        interactor.checkUserNameInDB(userName);

    }

    @Override
    public void userFoundOK(User user) {

        view.removeWait();

        if (user.getPassword().equals(pass)){
            Log.e("error", "Login success!");

            UserSession.getInstance().setUserInfo(user);

            view.loginOK(user.isAdministrator());
            Intents.goToHome(context, user.isAdministrator());
            view.finishActivity();

        }else {
            Log.e("error", "Password incorrect");
            view.loginKO();
        }

    }

    @Override
    public void userFoundKO() {

        view.removeWait();

        view.loginKO();
    }
}
