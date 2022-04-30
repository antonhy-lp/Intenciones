package mx.edu.tecmm.moviles.intenciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ImagenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagen)

        val btn_regresar = findViewById<Button>(R.id.btn_regresar)
        btn_regresar.setOnClickListener {
            finish()
        }
    }
}