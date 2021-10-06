package com.noone.chatdemo.ui.user.add

import androidx.lifecycle.viewModelScope
import com.noone.chatdemo.base.BaseViewModel
import com.noone.chatdemo.data.User
import com.noone.chatdemo.usecase.UserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddUserViewModel @Inject constructor(
    private val useCase: UserUseCase
) : BaseViewModel() {

    fun adduser(user: User) {
        viewModelScope.launch {
            useCase.addUser(user)
        }
    }

    fun validateData(fullName: String, age: String) =
        fullName.isNotEmpty() && age.isNotEmpty() && age.toInt() > 0
}