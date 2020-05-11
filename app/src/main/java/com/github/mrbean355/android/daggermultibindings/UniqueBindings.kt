package com.github.mrbean355.android.daggermultibindings

import dagger.Binds
import dagger.Module
import javax.inject.Inject

interface MyRepo {
    fun getData(): List<String>
}

class MyRepoImpl @Inject constructor() : MyRepo {

    override fun getData(): List<String> {
        return listOf("Hello", "World", "Foo", "Bar")
    }
}

@Module
interface RepoModule {

    @Binds
    fun bindMyRepo(impl: MyRepoImpl): MyRepo

}
