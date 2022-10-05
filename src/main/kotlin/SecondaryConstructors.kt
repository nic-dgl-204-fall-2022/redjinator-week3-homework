/*
Course: DGL 204 - Programming for mobile app development
Author: Ashley Blacquiere

Week 3 content, including secondary constructors
*/

class Person(val name: String) { // Primary constructor
    var age = 0
    var occupation = "Unemployed"


    constructor(name: String, age: Int): this(name) {
        this.age = age
    }

    constructor(name: String, age: Int, occupation: String): this(name, age) {
        val address = "2300 Ryan Rd." //This is scoped locally only to this constructor
        this.occupation = occupation
    }

    constructor(name: String, address: String) : this(name, 80) {
    }
}

fun main() {
    val jack = Person("Jack")
    val peter = Person("Peter", 20)
    val missMuffet = Person("Miss Muffet", 40, occupation = "Programmer")

    println(jack.name)
    println(peter.age)
    println(missMuffet.occupation)

//    println(missMuffet.address) // Unresolved reference
}