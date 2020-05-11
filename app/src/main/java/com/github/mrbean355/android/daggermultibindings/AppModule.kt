package com.github.mrbean355.android.daggermultibindings

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface AppModule {

    @ContributesAndroidInjector
    fun contributeMainActivity(): MainActivity

}