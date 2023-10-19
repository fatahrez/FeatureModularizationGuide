package com.appsbyfatah.photos.domain.repository

import com.appsbyfatah.common.util.ResultWrapper
import com.appsbyfatah.photos.domain.model.PhotoWrapperDomain
import kotlinx.coroutines.flow.Flow

interface PhotosRepository {
    suspend fun getPhotos(): Flow<ResultWrapper<List<PhotoWrapperDomain>>>
}