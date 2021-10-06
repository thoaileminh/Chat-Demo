package com.noone.chatdemo.ui.user.list

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.noone.chatdemo.base.BaseActivity
import com.noone.chatdemo.databinding.ActivityUserListBinding
import com.noone.chatdemo.ui.user.add.AddUserActivity
import com.noone.chatdemo.ui.user.add.AddUserViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserListActivity : BaseActivity() {

    private lateinit var viewBinding: ActivityUserListBinding
    private val mViewModel: UserListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityUserListBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        getUserList()
        goToAddUser()
    }

    private fun goToAddUser() {
        viewBinding.btnAddUser.setOnClickListener {
            startActivity(Intent(this, AddUserActivity::class.java))
        }
    }

    private fun getUserList() {
        mViewModel.getAllUsers()
    }
}