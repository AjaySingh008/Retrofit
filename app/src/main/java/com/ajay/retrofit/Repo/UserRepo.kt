package com.ajay.retrofit.Repo

import com.ajay.retrofit.Model.UserDetail
import com.ajay.retrofit.api.BaseRepository
import com.ajay.retrofit.api.Services

class UserRepo(private val api: Services) : BaseRepository() {

    suspend fun getUserList() : MutableList<UserDetail>? {
        val userResponse = safeApiCall(
            call = { api.getUserList().await() },
            errorMessage = "Error Fetching User List"
        )

        return userResponse?.userDetail?.toMutableList()
    }

}