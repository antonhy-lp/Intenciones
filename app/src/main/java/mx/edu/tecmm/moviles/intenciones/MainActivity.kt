package mx.edu.tecmm.moviles.intenciones

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnV1 = findViewById<Button>(R.id.btnVentana1)
        val btnSitio = findViewById<Button>(R.id.btnSitioWeb)
        val btn_op = findViewById<Button>(R.id.btn_op)

        btn_op.setOnClickListener {
            Log.e("Intent Op","To Operate!")
            val aOperar = Intent(this, OperacionActivity::class.java)
            startActivity(aOperar)
        }

        btnSitio.setOnClickListener {
            Log.e("Intent Button", "Preciono Sitio")
            val aGoogle= Intent(android.content.Intent.ACTION_VIEW)
            aGoogle.data = Uri.parse("http://google.com.mx")
            startActivity(aGoogle)
        }
        btnV1.setOnClickListener {
            Log.e("Intent" ,"Presiono")
            val intent1 = Intent(this, ImagenActivity::class.java)
            startActivity(intent1)
        }
    }
}