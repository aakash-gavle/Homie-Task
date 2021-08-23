package com.example.homie.data.repo

import com.example.homie.data.api.ApiHelper
import io.reactivex.Single
import com.example.homie.data.model.PixabayData
import com.example.homie.di.component.ApiHelperComponent
import com.example.homie.di.component.DaggerApiHelperComponent
import javax.inject.Inject


class ImageRepository : OutputRepository {

    @Inject
    lateinit var apiHelper: ApiHelper

    init {
        val apiHelperComponent: ApiHelperComponent = DaggerApiHelperComponent.create();
        apiHelperComponent.inject(this)
    }

    override fun getData(searchWord: String, page: Int): Single<PixabayData> {

        return apiHelper.getImages(searchWord, page)

    }
}