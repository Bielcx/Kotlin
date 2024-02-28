package bielcx.com.github.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // creating a text object
        val texto = TextView(this)
        texto.text = "Hello Kotlin"

        //definindo conteudo da tela
        setContentView(texto)
    }

}