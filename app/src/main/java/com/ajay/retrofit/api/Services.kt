package com.ajay.retrofit.api

import com.ajay.retrofit.Model.UserList
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface Services {

    @GET("todos/")
    fun getUserList(): Deferred<Response<UserList>>
}