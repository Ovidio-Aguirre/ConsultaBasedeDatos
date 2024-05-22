package com.example.aguirremartinez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.aguirremartinez.databinding.ActivityGuardarBinding

class Guardar : AppCompatActivity() {

    private lateinit var binding: ActivityGuardarBinding
    private lateinit var db : BasedeDatos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuardarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        db = BasedeDatos(this)

        binding.btnGuardar.setOnClickListener{
            val mensaje = binding.txtData.text.toString()
            val resgistro =Registro(mensaje)
            db.insertarMensaje(resgistro)
            finish()
            Toast.makeText(this,"SE HA GUARDADO EL MENSAJE",Toast.LENGTH_LONG).show()
        }
    }
}