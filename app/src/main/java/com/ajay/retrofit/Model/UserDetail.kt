package com.ajay.retrofit.Model

import com.google.gson.annotations.SerializedName


data class UserDetail(
    @SerializedName("userId")
    val userId: Int? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("completed")
    val completed: Boolean? = null)


data class UserList(val userDetail: ArrayList<UserDetail>)