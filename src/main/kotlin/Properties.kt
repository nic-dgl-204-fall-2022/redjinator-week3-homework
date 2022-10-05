/*
Course: DGL 204 - Programming for mobile app development
Author: Ashley Blacquiere

Week 3 content, including properties, getters and setters and lateinit
*/

class TestingProperties {

    var name = "Jack"
    var surname = "Candlestick"
    val left = true
    val right = false

    // A computed property - note that immutable vals cannot have a set()
    val fullname = "$name $surname" // The short form of the full get() specification

    // Note that if you don't want a property get() or set() to be accessible outside of a class you can declare it private
    var bothTrue: Boolean //= false
        get() = left && right
        set(value) {
            println("Printing from set(): $value")
           // field = value
        }

//    fun test() {
//        bothTrue = true
//    }
}

fun main() {
    val t = TestingProperties()

    t.name = "Peter"
    println("Full name: ${t.fullname}")
    println("Both true?: ${t.bothTrue}") // Calls get() because we're just trying to retrieve a value
    t.bothTrue = true // This calls set() because we are trying to assign a value
    println("Still both true? ${t.bothTrue}")

}