package com.example.homie.di.component

import dagger.Component
import com.example.homie.data.repo.ImageRepository
import com.example.homie.di.module.ApiHelperModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiHelperModule::class])
interface ApiHelperComponent {
    fun inject(mainRepository: ImageRepository)
}
