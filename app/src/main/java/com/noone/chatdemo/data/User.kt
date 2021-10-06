package com.noone.chatdemo.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @ColumnInfo(name = "full_name")
    val fullName: String,

    @ColumnInfo(name = "age")
    val age: Int
) {
    @PrimaryKey(autoGenerate = true)
    var userId: Int = 0
}