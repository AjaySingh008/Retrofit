package com.ajay.retrofit.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.ajay.retrofit.Model.UserDetail
import com.ajay.retrofit.Repo.UserRepo
import com.ajay.retrofit.api.ApiClient
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class UserListViewModel: ViewModel(){

    private val parentJob = Job()

    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.IO

    private val scope = CoroutineScope(coroutineContext)

    private val userRepo = UserRepo(ApiClient.getApiClient())


    val userListLiveData = MutableLiveData<MutableList<UserDetail>>()

    fun fetchUserList(){
        scope.launch {
            val userList = userRepo.getUserList()
            userListLiveData.postValue(userList)
        }
    }


    fun cancelAllRequests() = coroutineContext.cancel()

}