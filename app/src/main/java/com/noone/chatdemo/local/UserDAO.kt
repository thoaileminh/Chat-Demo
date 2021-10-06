package com.noone.chatdemo.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.noone.chatdemo.data.User

@Dao
interface UserDAO {
    @Query("SELECT * FROM User")
    suspend fun getAllUsers(): List<User>

    @Insert
    suspend fun addUser(user: User)
}