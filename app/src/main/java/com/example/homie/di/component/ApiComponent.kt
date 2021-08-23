package com.example.homie.di.component

import com.example.homie.data.api.ApiHelper
import com.example.homie.di.module.ApiModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class])
interface ApiComponent {
    fun inject(apiHelper: ApiHelper)
}
