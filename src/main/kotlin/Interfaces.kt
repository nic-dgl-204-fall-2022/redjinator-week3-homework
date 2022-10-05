interface Pumpable {
    fun pumpGas(fundsProvided: Double)
}

interface Payable {
    fun acceptPayment(fundsProvided: Double)
}

interface Fillable {
    fun fillTank(station: ShellStation)
}

interface Drivable {
    val topSpeed: Double
    fun accelerate()
    fun brake()
}

interface TimeTravelable {
    var charged: Boolean
    fun chargeFluxCapacitor()
    fun timeTravel()
}

abstract class ServiceStation(
    val priceOfGasPerLitre: Double = 2.3
    ) {

    }


// Shell Station
class ShellStation(
    val name: String = "Shell Station"
) : ServiceStation(), Pumpable, Payable {
    override fun pumpGas(fundsProvided: Double) {
        val litersOfGas = fundsProvided / priceOfGasPerLitre
        println("Filling the tank to $litersOfGas litres")
    }

    override fun acceptPayment(fundsProvided: Double) {
        println("Accepted payment of $fundsProvided")
    }
}

// Vehicle
open class Vehicle(
    val cashAvailable: Double = 10.0
    ) { }



open class Car(

) : Vehicle(

), Fillable, Drivable {

    override val topSpeed: Double = 100.0

    override fun fillTank(station: ShellStation) {
        station.acceptPayment(cashAvailable)
        station.pumpGas(cashAvailable)
    }

    override fun accelerate() {
        println("Accelerating...")
    }

    override fun brake() {
        println("Braking...")
    }
}



class Dalorian(

): Car(), TimeTravelable {

    override var charged: Boolean = false

    override fun chargeFluxCapacitor() {
        if (charged == false) {
            charged = true
            println("You refill the Flux Capacitor with plutonium and set the meter to 1.21 gigawatts, a few moments later it is fully charged")
        } else {
            println("Flux Capacitor is already fully charged")
        }
    }

    override fun timeTravel() {
        if (charged == false) {
            println("You attempt to time travel but quickly realize the Flux Capacitor is not charged")
        } else {
            accelerate()
            println("You reach 88mph and travel back in time")
        }
    }
}

fun main() {
    val shellStation = ShellStation()
    val car = Car()
    car.fillTank(shellStation)

    // Create Dalorian inherits from Car
    val d = Dalorian()

    // Attempt to time travel without charging the Flux Capacitor
    d.timeTravel()

    // Charge the Flux Capacitor
    d.chargeFluxCapacitor()

    // Time travel
    d.timeTravel()
}

