package com.github.mrbean355.android.daggermultibindings

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var myRepo: MyRepo

    @Inject
    lateinit var stringProviders: Map<Class<*>, @JvmSuppressWildcards StringProvider>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(stringProviders)
    }
}
