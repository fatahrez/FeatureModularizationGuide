package com.appsbyfatah.photos.data.remote.dto

import com.appsbyfatah.photos.domain.model.PhotoWrapperDomain

data class PhotoWrapperDTO(
    val id: String,
    val urls: LinksDTO
) {
   fun toPhotoWrapperDomain(): PhotoWrapperDomain {
       return PhotoWrapperDomain(
           id = id,
           urls = urls.toLinksDomain()
       )
   }
}