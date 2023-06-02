package com.example.kotlinintermedio

open class Person(name:String, age: Int) {
    // Cualquier clase tiene una superclase comun "any"

    open fun work() {
        println("Esta persona esta trabajando")
    }

}