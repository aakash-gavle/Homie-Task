package com.example.homie.di.component

import com.example.homie.di.module.ImageRepositoryModule
import com.example.homie.viewmodel.MainViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ImageRepositoryModule::class])
interface ImageRepositoryComponent {
    fun inject(imagesViewModel: MainViewModel)
}
