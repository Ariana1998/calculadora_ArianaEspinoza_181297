package espinoza.ariana.calculadora_arianaespinoza_181297

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var num1:Double = 0.0
    var num2:Double = 0.0
    var operacion:String = "+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titulo:TextView = findViewById(R.id.titulo)
        val btn0: Button = findViewById(R.id.btn0)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btn5: Button = findViewById(R.id.btn5)
        val btn6: Button = findViewById(R.id.btn6)
        val btn7: Button = findViewById(R.id.btn7)
        val btn8: Button = findViewById(R.id.btn8)
        val btn9: Button = findViewById(R.id.btn9)
        val btnSuma: Button = findViewById(R.id.btnSuma)
        val btnResta: Button = findViewById(R.id.btnResta)
        val btnMul: Button = findViewById(R.id.btnMul)
        val btnDiv: Button = findViewById(R.id.btnDiv)
        val btnResultado: Button = findViewById(R.id.btnResultado)
        val btnBorrar: Button = findViewById(R.id.btnBorrar)
        val tvResultado: TextView = findViewById(R.id.tvResultado)

        btn0.setOnClickListener() {
            val texto = tvResultado.text.toString()
            tvResultado.setText("$texto" + "0")
        }

        btn1.setOnClickListener(){
            val texto = tvResultado.text.toString()
            tvResultado.setText("$texto"+"1")
        }

        btn2.setOnClickListener(){
            val texto = tvResultado.text.toString()
            tvResultado.setText("$texto"+"2")
        }

        btn3.setOnClickListener(){
            val texto = tvResultado.text.toString()
            tvResultado.setText("$texto"+"3")
        }

        btn4.setOnClickListener(){
            val texto = tvResultado.text.toString()
            tvResultado.setText("$texto"+"4")
        }

        btn5.setOnClickListener(){
            val texto = tvResultado.text.toString()
            tvResultado.setText("$texto"+"5")
        }

        btn6.setOnClickListener(){
            val texto = tvResultado.text.toString()
            tvResultado.setText("$texto"+"6")
        }

        btn7.setOnClickListener(){
            val texto = tvResultado.text.toString()
            tvResultado.setText("$texto"+"7")
        }

        btn8.setOnClickListener(){
            val texto = tvResultado.text.toString()
            tvResultado.setText("$texto"+"8")
        }

        btn9.setOnClickListener(){
            val texto = tvResultado.text.toString()
            tvResultado.setText("$texto"+"9")
        }

        btnSuma.setOnClickListener() {
            num1 = (Integer.parseInt(tvResultado.text.toString())).toDouble()
            tvResultado.setText("")
            operacion = "+"
        }

        btnResta.setOnClickListener() {
            num1 = (Integer.parseInt(tvResultado.text.toString())).toDouble()
            tvResultado.setText("")
            operacion = "-"
        }

        btnMul.setOnClickListener() {
            num1 = (Integer.parseInt(tvResultado.text.toString())).toDouble()
            tvResultado.setText("")
            operacion = "*"
        }

        btnDiv.setOnClickListener() {
            num1 = (Integer.parseInt(tvResultado.text.toString())).toDouble()
            tvResultado.setText("")
            operacion = "/"
        }

        btnResultado.setOnClickListener() {
            tvResultado.setText(realizarOperacion().toString())
        }

        btnBorrar.setOnClickListener() {
            tvResultado.setText("")
        }

    }

    fun realizarOperacion():Double {

        val tvResultado: TextView = findViewById(R.id.tvResultado)

        num2 = (Integer.parseInt(tvResultado.text.toString())).toDouble()

        if (operacion.equals("+")) {
            return num1 + num2
        } else if (operacion.equals("-")) {
            return num1 - num2
        } else if (operacion.equals("*")) {
            return num1 * num2
        } else if (operacion.equals("/")) {
            if (num2 != 0.0)
                return num1 / num2
            return num2 / num1
        }
        else {
            return 0.0
        }
    }
}