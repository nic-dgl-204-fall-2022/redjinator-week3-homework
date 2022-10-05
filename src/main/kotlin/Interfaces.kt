/*
Course: DGL 204 - Programming for mobile app development
Author: Ashley Blacquiere

Week 3 content, including interfaces
*/


abstract class ServiceStation(
    val priceOfGasPerLitre: Double = 2.3
) {

}

interface Pumpable {
    fun pumpGas(fundsProvided: Double)
}

interface Payable {
    fun acceptPayment(fundsProvided: Double)
}

class ShellStation(
    val name: String = "Shell Station"
) : ServiceStation(), Pumpable, Payable {
    override fun pumpGas(fundsProvided: Double) {
        val litersOfGas = fundsProvided / priceOfGasPerLitre
        println("Filling the tank to $litersOfGas litres")
    }

    override fun acceptPayment(fundsProvided: Double) {
        TODO("Not yet implemented")
    }
}

open class Vehicle(
    val cashAvailable: Double = 10.0
) {
    fun fillTank(station: ShellStation) {
        station.pumpGas(cashAvailable)
    }
}

class Car(

) : Vehicle(

) {

}


fun main() {

    val s = ShellStation()
    val c = Car()

    c.fillTank(s)

}