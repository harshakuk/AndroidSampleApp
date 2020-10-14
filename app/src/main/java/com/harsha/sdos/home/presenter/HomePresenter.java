package com.harsha.sdos.home.presenter;

import android.content.Context;

import com.harsha.sdos.home.interfaces.IHomeView;
import com.harsha.sdos.models.User;
import com.harsha.sdos.utils.UserSession;

/**
 * Created by ruano on 09/02/2018.
 */

public class HomePresenter {

    Context context;
    IHomeView view;

    public HomePresenter(Context context, IHomeView view){
        this.context = context;
        this.view = view;
    }

    public void getUserLogedInInfo(){

        User user = UserSession.getInstance().getUserInfo();

        if (user!=null){
            view.userInfoOK(user);
        }else {
            view.userInfoKO();
        }

    }
}
