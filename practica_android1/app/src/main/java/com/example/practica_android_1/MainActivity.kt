package com.example.practica_android_1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var btnAccept: Button
    private lateinit var textview1: TextView
    private lateinit var editText: EditText
    private lateinit var editText2: EditText
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAccept = findViewById(R.id.btnAccept)
        textview1 = findViewById(R.id.text_view1)
        btnAccept.setOnClickListener {
            textview1.text = getString(R.string.button_clicked)
            btnAccept.isEnabled = false
            textView.visibility = View.INVISIBLE
        }
        textView = findViewById(R.id.textView)
        editText = findViewById(R.id.editText)
        editText2 = findViewById(R.id.editText2)
        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                textView.text = editText.text
            }
        })
    }
}