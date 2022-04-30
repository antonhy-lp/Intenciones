package mx.edu.tecmm.moviles.intenciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class OperacionActivity : AppCompatActivity() {
    lateinit var txtSuma: EditText
    lateinit var txtSumar: EditText
    lateinit var txtResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operacion)

        txtSuma = findViewById(R.id.txtSuma)
        txtSumar = findViewById(R.id.txtSumar)
        txtResult = findViewById(R.id.txtResult)

        val btnRegreso = findViewById<Button>(R.id.btnRegreso)
        btnRegreso.setOnClickListener {
            finish()
        }



    }

    fun Hacer(view: View) {
        var sum: Int = 0
        val Num1 = txtSuma.text.toString().toInt()
        val Num2 = txtSumar.text.toString().toInt()

        sum = Num1 + Num2
        sum.toString()

        txtResult.text = "El Resultado De La Suma Es: $sum"

    }
}




