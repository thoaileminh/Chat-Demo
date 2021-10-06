package com.noone.chatdemo.usecase

import com.noone.chatdemo.data.User
import com.noone.chatdemo.repository.UserRepository
import javax.inject.Inject

class UserUseCase @Inject constructor(
    private val repository: UserRepository
) {
    suspend fun addUser(user: User) = repository.addUser(user)
    suspend fun getAllUsers() = repository.getAllUsers()
}