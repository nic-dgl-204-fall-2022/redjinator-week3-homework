import java.lang.reflect.Type

/*
Course: DGL 204 - Programming for mobile app development
Author: Ashley Blacquiere

Week 3 content, including inheritance and related keywords
*/

open class FinalClass() {
    open val name = "Final"
}
class NextFinalClass(): FinalClass() {
    override val name = "NextFinalClass"
}

open class Parent() {
    open fun printName() {
        println("I'm a parent!")
    }
}

class Child(): Parent() {
    override fun printName() {
        println("I'm a child!")
    }
}


//Abstract classes declare abstract properties and methods that a subclass must implement
abstract class GrandParent() {
    val name: String = "GrandParent"
    abstract val age: Int //abstract properties do not have data
    abstract fun printName() //abstract methods do not have implementations
}

// An inheritor of an abstract class must implement all abstract methods and properties
class GrandChild(override val age: Int): GrandParent() {
    override fun printName() {
        println("I'm a $age year old child - not a $name!")
    }
}

fun main() {

    val fc = FinalClass()
    fc.name
    val nfc = NextFinalClass()
    nfc.name

    val c = Child()
    c.printName()


//    val g = GrandParent() // Cannot create instance of abstract class
    val gc = GrandChild(5)
    gc.printName()

}