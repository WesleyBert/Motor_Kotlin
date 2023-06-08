package com.example.poo

class MotoEletrico : MotorImpl(){

    private var nivelEnergia:Int = 1

    override fun temAutonomia(): Boolean {
        return nivelEnergia > 0
    }

    override fun gastando() {
        println("Gastando energia, nivel e de $nivelEnergia")
        nivelEnergia--
    }


}