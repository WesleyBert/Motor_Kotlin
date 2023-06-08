package com.example.poo

fun main() {
    val motorCombustao = MotorAcombustao()
    val motorEletrico = MotoEletrico()

    val fuca = Carro(motorCombustao)
    fuca.ligado()
    fuca.andar()
    fuca.andar()

//    val tesla = Carro(motorEletrico)
//    tesla.ligar()
//    tesla.andar()
//    tesla.andar()


}