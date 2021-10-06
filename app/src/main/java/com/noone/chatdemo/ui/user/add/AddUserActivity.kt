package com.noone.chatdemo.ui.user.add

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.noone.chatdemo.R
import com.noone.chatdemo.base.BaseActivity
import com.noone.chatdemo.data.User
import com.noone.chatdemo.databinding.ActivityAddUserBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddUserActivity : BaseActivity() {

    private lateinit var viewBinding: ActivityAddUserBinding
    private val mViewModel: AddUserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityAddUserBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        addUser()
    }

    private fun addUser() {
        viewBinding.btnAdd.setOnClickListener {
            saveUserToBD()
        }
    }

    private fun saveUserToBD() {
        val fullName = viewBinding.edFullName.text?.toString()?.trim() ?: ""
        val age = viewBinding.edAge.text?.toString()?.trim() ?: ""

        if (mViewModel.validateData(fullName, age)) {
            mViewModel.adduser(
                User(
                    fullName = fullName,
                    age = age.toInt()
                )
            )


            Toast.makeText(this, getString(R.string.app_add_user_success), Toast.LENGTH_SHORT)
                .show()
            finish()
        } else {
            Toast.makeText(this, getString(R.string.app_add_user_invalid_data), Toast.LENGTH_SHORT)
                .show()
        }
    }
}