package com.github.mrbean355.android.daggermultibindings

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    RepoModule::class,
    StringProviderModule::class
])
interface AppComponent : AndroidInjector<DemoApplication>
