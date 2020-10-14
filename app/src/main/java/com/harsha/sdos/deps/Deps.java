package com.harsha.sdos.deps;



import com.harsha.sdos.home.HomeActivity;
import com.harsha.sdos.home.HomeFruitFragment;
import com.harsha.sdos.networking.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class,})
public interface Deps {
    void inject(HomeActivity listActivity);
    void inject(HomeFruitFragment homeFruitFragment);
}