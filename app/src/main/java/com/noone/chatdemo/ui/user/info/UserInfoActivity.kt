package com.noone.chatdemo.ui.user.info

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.noone.chatdemo.base.BaseActivity
import com.noone.chatdemo.databinding.ActivityUserListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserInfoActivity : BaseActivity() {

    private lateinit var viewBinding: ActivityUserListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityUserListBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        addUser()
    }

    private fun addUser() {
        viewBinding.btnAddUser.setOnClickListener {

        }
    }
}