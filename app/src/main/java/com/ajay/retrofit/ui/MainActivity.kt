package com.ajay.retrofit.ui

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ajay.retrofit.R
import com.ajay.retrofit.viewmodel.UserListViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var userListViewModel: UserListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        userListViewModel = ViewModelProviders.of(this).get(UserListViewModel::class.java)

        userListViewModel.fetchUserList()

    }
}
