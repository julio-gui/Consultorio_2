package br.unasp.consultorio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro)

        val btnVoltar = findViewById<Button>(R.id.button_voltar)
        btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val btnConcluir = findViewById<Button>(R.id.button_concluir)
        btnConcluir.setOnClickListener {

        }
    }
}