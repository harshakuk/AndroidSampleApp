package com.harsha.sdos.home.interfaces;

import com.harsha.sdos.models.FruitListResponse;

import java.util.List;

/**
 * Created by ruano on 11/02/2018.
 */

public interface IHomeFruitView {

    void showWait();
    void removeWait();
    void getFruitListSuccess(List<FruitListResponse> fruits);
    void getFruitListKO();
}
