package com.example.homie.di.module

import com.example.homie.data.api.ApiHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApiHelperModule {

    @Singleton
    @Provides
    fun providesApiHelper(): ApiHelper {
        return ApiHelper()
    }
}