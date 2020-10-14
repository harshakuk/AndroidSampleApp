package com.harsha.sdos.home.interactor;

import android.content.Context;

import com.harsha.sdos.dbwrapper.Wrapper;
import com.harsha.sdos.home.interfaces.IHomeFruitPresenter;
import com.harsha.sdos.models.FruitListResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruano on 11/02/2018.
 */

public class HomeFruitInteractor {

    Context context;
    IHomeFruitPresenter presenter;

    public HomeFruitInteractor(Context context, IHomeFruitPresenter presenter){
        this.context = context;
        this.presenter = presenter;
    }

    public void saveFruits(List<FruitListResponse> fruitListResponse){
        Wrapper.getInstance().saveFruits(fruitListResponse);
    }

    public void getAllFruits(){
        ArrayList<FruitListResponse> arraylist = Wrapper.getInstance().getAllFruits();

        if (arraylist.size()>0){
            presenter.FruitsDownloadedOK(arraylist);
        }else {
            presenter.FruitsDownloadedKO();
        }
    }
}
