package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        One way to handle button click
//        createBirthdayCardButton.setOnClickListener {
//
//        }
    }

//    Button click logic goes here
    fun createBirthdayCard(view: View) {
//        to get input text from input field
        val editText = findViewById<EditText>(R.id.inputName) // get the element
        val name = editText.text // get the text from the element
////      Toast(pop up that comes and fades)
        Toast.makeText(this, "Creating card for $name", Toast.LENGTH_LONG).show()

        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, "$name")
        startActivity(intent)
    }
}