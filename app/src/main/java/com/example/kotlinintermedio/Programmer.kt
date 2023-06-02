package com.example.kotlinintermedio

class Programmer (name:String, age: Int, val language:String): Person(name, age) {

    override fun work() {
        println("Esta persona esta programando")
    }

    fun sayLanguage(){
        println("Este programador usa el lenguage $language")
    }
}