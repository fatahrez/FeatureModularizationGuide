package com.appsbyfatah.photos.data.remote.dto

import com.appsbyfatah.photos.domain.model.LinksDomain

data class LinksDTO(
    val raw: String,
    val full: String,
    val regular: String,
    val small: String,
    val thumb: String
) {
    fun toLinksDomain(): LinksDomain {
        return LinksDomain(
            raw = raw,
            full = full,
            regular = regular,
            small = small,
            thumb = thumb
        )
    }
}
