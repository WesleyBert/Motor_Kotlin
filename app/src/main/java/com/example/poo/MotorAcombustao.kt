package com.example.poo

 class MotorAcombustao: MotorImpl() {

    private var nivelCombustivel:Int = 2

     override fun gastando(){
         println("Gastando combustivel, nivel agora e :$nivelCombustivel")
         nivelCombustivel --
     }

    override fun temAutonomia(): Boolean {
        return nivelCombustivel > 0
    }
}