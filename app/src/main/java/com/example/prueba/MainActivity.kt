package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        aTrabajar()
//        sentencialIf()
        sentencialWhen()
    }
//    private fun aTrabajar(){
//        println("Holo")
//        println("wtf")
//    }
//    private fun sentencialIf(){
//        val myNumber = 3
//        if (myNumber <= 10 && myNumber > 5){
//            println("$myNumber es menor o igual que 10 y mayor que 5")
//        } else {
//            println("$myNumber es mayor que 10 o menor que 5")
//        }
//    }
    private fun sentencialWhen(){
        val pais = "Japon"

        when(pais){
            "Guatemala" -> {
                println("El idioma es Spanish")
            } "Nicaragua" -> {
                println("El idioma tambien es Spanish")
            } "USA" -> {
                println("El idioma es English")
            } else -> {
                println("No se que idioma se habla")
            }//hola
        }
    }
}
