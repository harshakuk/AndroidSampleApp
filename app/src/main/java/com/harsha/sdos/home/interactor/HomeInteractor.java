package com.harsha.sdos.home.interactor;

import android.content.Context;

import com.harsha.sdos.home.interfaces.IHomeTechnicalView;

/**
 * Created by ruano on 09/02/2018.
 */

public class HomeInteractor {

    Context context;
    IHomeTechnicalView presenter;

    public HomeInteractor(Context context, IHomeTechnicalView presenter){
        this.context = context;
        this.presenter = presenter;
    }
}
