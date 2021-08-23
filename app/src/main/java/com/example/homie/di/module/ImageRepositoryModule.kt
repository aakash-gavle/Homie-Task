package com.example.homie.di.module

import dagger.Module
import dagger.Provides
import com.example.homie.data.repo.ImageRepository
import com.example.homie.data.repo.OutputRepository
import javax.inject.Singleton

@Module
class ImageRepositoryModule {

    @Singleton
    @Provides
    fun providesImageRepository(): OutputRepository {
        return ImageRepository()
    }
}