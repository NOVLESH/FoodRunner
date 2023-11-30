package com.novlesh.foodrunner.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import com.novlesh.foodrunner.R
import com.novlesh.foodrunner.fragment.ForgotPasswordDetailsFragment

class ForgotPassword : AppCompatActivity() {

    lateinit var etMobileNumber: EditText
    lateinit var etEmail: EditText
    lateinit var btnNext: Button

    lateinit var frameLayout: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        frameLayout = findViewById(R.id.frame)
        supportFragmentManager.beginTransaction()
            .replace(
                R.id.frame,
                ForgotPasswordDetailsFragment()
            )
            .commit()

    }

    private fun validateFields() =
        etMobileNumber.text.toString().length == 10 && etEmail.text.toString().isNotEmpty()


}
