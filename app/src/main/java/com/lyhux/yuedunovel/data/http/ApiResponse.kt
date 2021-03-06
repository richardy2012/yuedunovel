package com.lyhux.yuedunovel.data.http

data class ApiResponse<T> (
        var code: Int = 0,
        var message: String = "",
        var data: T? = null


) {
    var isSuccess : Boolean = false
        get() = code == 1

    fun doSuccess(r: (T) -> Unit): ApiResponse<T> {
        return apply {
            if (code == 1) {
                r(data!!)
            }
        }
    }

    fun doError(e: (ApiResponse<T>) -> Unit): ApiResponse<T> {
        return apply {
            if (code != 1) {
                e(this)
            }
        }
    }
}