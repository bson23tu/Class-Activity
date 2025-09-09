package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.editTextText)
        val output = findViewById<TextView>(R.id.main)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val name = input.text.toString()

            if (name.isBlank()) {
                output.text = "Please enter a name."
            } else {
                output.text = "Hello $name!"
                input.text.clear()
            }
        }
    }
}
