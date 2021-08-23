package com.example.homie.data.repo


import io.reactivex.Single
import com.example.homie.data.model.PixabayData

interface OutputRepository {
    fun getData(searchWord: String, page: Int): Single<PixabayData>
}