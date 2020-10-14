package com.harsha.sdos.home.interfaces;

import com.harsha.sdos.models.FruitListResponse;

import java.util.ArrayList;

/**
 * Created by ruano on 11/02/2018.
 */

public interface IHomeFruitPresenter {

    void FruitsDownloadedOK(ArrayList<FruitListResponse> arraylist);
    void FruitsDownloadedKO();
}
