package com.appsbyfatah.photos.data.repository

import com.appsbyfatah.common.util.utils.ResultWrapper
import com.appsbyfatah.common.util.utils.safeApiCall
import com.appsbyfatah.photos.data.remote.PhotosAPI
import com.appsbyfatah.photos.domain.model.PhotoWrapperDomain
import com.appsbyfatah.photos.domain.repository.PhotosRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow

class PhotosRepositoryImpl(
    private val photosAPI: PhotosAPI,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
): PhotosRepository {
    override suspend fun getPhotos(): Flow<ResultWrapper<List<PhotoWrapperDomain>>> =
        safeApiCall(ioDispatcher){
        photosAPI.getPhotos().map {
            it.toPhotoWrapperDomain()
        }
    }
}