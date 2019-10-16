package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO Continue your work here
        ///val =value,var=variable
        val buttonHelloWorld: Button = findViewById(R.id.buttonHelloWorld)
        buttonHelloWorld.setOnClickListener{ showMessage() }

        val buttonReset: Button=findViewById(R.id.buttonReset)
        buttonReset.setOnClickListener { resetMessage() }
    }

    private fun resetMessage() {
        val textViewMessage: TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.hello_world))

    }

    private fun showMessage() {
    val textViewMessage: TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText("Hello 123")
    }
}
