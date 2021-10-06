package com.noone.chatdemo.repository

import com.noone.chatdemo.data.User
import com.noone.chatdemo.local.UserDAO
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val localUserData: UserDAO
) {
    suspend fun addUser(user: User) = localUserData.addUser(user)
    suspend fun getAllUsers() = localUserData.getAllUsers()
}