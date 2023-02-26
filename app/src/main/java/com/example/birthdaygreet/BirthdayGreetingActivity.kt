package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        //finding birthdayText
        val birthdayText = findViewById<TextView>(R.id.birthdayText)

        val name = this.intent.getStringExtra(NAME_EXTRA)
        birthdayText.text = "Happy Birthday\n $name !"

    }

//    companion object {
//        val NAME_EXTRA: String?
//    }
}