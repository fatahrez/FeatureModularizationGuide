package com.appsbyfatah.common.util.utils

sealed class ResultWrapper<out T> {
    data class Success<out T>(val value: T): ResultWrapper<T>()
    data class GenericError(
        val code: Int? = null,
        val error: ErrorResponse? = null
    ): ResultWrapper<Nothing>()
    object NetworkError: ResultWrapper<Nothing>()
    object Loading: ResultWrapper<Nothing>()
}