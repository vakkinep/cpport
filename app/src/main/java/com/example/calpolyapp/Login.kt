package com.example.calpolyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_loginButton.setOnClickListener {
            val status = if ((login_username.text.toString().equals("venkat@calpoly.edu") || login_username.text.toString().equals("v"))
                && (login_password.text.toString().equals("mustangs") || login_password.text.toString().equals("m"))) "Login Successful" else "Incorrect Username or Password"

            Toast.makeText(this, status, Toast.LENGTH_SHORT).show()

            if (status.equals("Login Successful")) {
                val intent = Intent(this, Tabs::class.java)
                startActivity(intent)
            }
        }
    }
}