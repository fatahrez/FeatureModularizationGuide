package com.appsbyfatah.photos.data.remote

import com.appsbyfatah.photos.data.remote.dto.PhotoWrapperDTO
import retrofit2.http.GET

interface PhotosAPI {

    @GET("photos")
    suspend fun getPhotos(): List<PhotoWrapperDTO>

}