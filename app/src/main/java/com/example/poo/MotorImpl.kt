package com.example.poo

abstract class MotorImpl : Motor {
    private var ligado : Boolean = false

    override fun ligado(){
        ligado = true
    }

    override fun desligar(){
        ligado = false
    }

    fun estaLigado():Boolean {
        return ligado
    }

   abstract fun temAutonomia(): Boolean

   abstract fun gastando()


}