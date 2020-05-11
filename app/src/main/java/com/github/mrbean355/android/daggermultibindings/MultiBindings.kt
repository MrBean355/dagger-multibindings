package com.github.mrbean355.android.daggermultibindings

import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.Multibinds
import javax.inject.Inject

interface StringProvider {
    fun provide(): String
}

class HelloWorldStringProvider @Inject constructor() : StringProvider {
    override fun provide() = "Hello world!"
}

class FooBarStringProvider @Inject constructor() : StringProvider {
    override fun provide() = "Foo bar"
}

@Module
interface StringProviderModule {

    @Multibinds
    fun multibindsStringProviders(): Map<Class<*>, StringProvider>

    @Binds
    @IntoMap
    @ClassKey(HelloWorldStringProvider::class)
    fun bindHelloWorld(impl: HelloWorldStringProvider): StringProvider

    @Binds
    @IntoMap
    @ClassKey(FooBarStringProvider::class)
    fun bindFooBar(impl: FooBarStringProvider): StringProvider

}
