package com.noone.chatdemo.entity

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.noone.chatdemo.data.User
import com.noone.chatdemo.local.UserDAO

@Database(
    entities = [User::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDAO

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        private fun buildDatabase(appContext: Context) =
            Room.databaseBuilder(
                appContext,
                AppDatabase::class.java,
                "chatdemo.db" // database's name
            ).build()

        fun getDatabase(context: Context): AppDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also {
                    INSTANCE = it
                }
            }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}