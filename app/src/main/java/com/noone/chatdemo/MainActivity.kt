package com.noone.chatdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.noone.chatdemo.databinding.ActivityMainBinding
import com.noone.chatdemo.ui.user.list.UserListActivity

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        goToListUser()
    }

    private fun goToListUser() {
        viewBinding.btnListUser.setOnClickListener {
            startActivity(Intent(this, UserListActivity::class.java))
        }
    }
}