package com.example.poo

class Carro constructor(
    private val motor: MotorImpl
): Motor by motor{
    var cor: String? = null

    fun andar() {
        when{
            !motor.estaLigado() -> println("Liga carro primeiro")
            !motor.temAutonomia() -> {
                when(motor){
                    is MotorAcombustao -> println("Coloca combustivel!")
                    is MotoEletrico -> println("Tem que recarregar a bateria!")
                }
            }
            else -> {
                motor.gastando()

                when(motor) {
                    is MotoEletrico -> println("carro andando silencioso!")
                    is MotorAcombustao -> println("Carro andando: vrunn vrun")
                }
            }
        }
    }
    fun freia(){
        println("Freando o carro")
    }


    fun buzina(){
        println("bibi")
    }


}