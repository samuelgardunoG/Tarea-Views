package com.example.practica_android11


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var btnAccept: Button
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var editText3: EditText
    private lateinit var editText4: EditText
    private lateinit var Imagen: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAccept = findViewById(R.id.btnAccept)
        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        editText3 = findViewById(R.id.editText3)
        editText4 = findViewById(R.id.editText4)
        Imagen = findViewById(R.id.Imagen)
        Imagen.visibility = View.INVISIBLE

        btnAccept.setOnClickListener {
            btnAccept.isEnabled = false
            if (editText1.text.isNotEmpty() && editText2.text.isNotEmpty() &&
                editText3.text.isNotEmpty() && editText4.text.isNotEmpty()) {
                Imagen.setImageResource(R.drawable.flecha)
            }
            Imagen.visibility = View.VISIBLE


        }
    }
}