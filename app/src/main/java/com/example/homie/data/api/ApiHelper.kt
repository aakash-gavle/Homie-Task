package com.example.homie.data.api


import com.example.homie.di.component.ApiComponent
import com.example.homie.di.component.DaggerApiComponent
import javax.inject.Inject

class ApiHelper {

    @Inject
    lateinit var apiService: ApiService

    init {
        val apiComponent: ApiComponent = DaggerApiComponent.create()
        apiComponent.inject(this)
    }

    fun getImages(input: String, page: Int) = apiService.getImages(input, page)

}