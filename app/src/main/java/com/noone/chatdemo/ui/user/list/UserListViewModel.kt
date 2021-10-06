package com.noone.chatdemo.ui.user.list

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.noone.chatdemo.base.BaseViewModel
import com.noone.chatdemo.usecase.UserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserListViewModel @Inject constructor(
    private val useCase: UserUseCase
) : BaseViewModel() {

    fun getAllUsers() {
        viewModelScope.launch {
            useCase.getAllUsers()

            Log.e("NoOne", "getAllUsers: " +  useCase.getAllUsers().toString())

        }
    }
}