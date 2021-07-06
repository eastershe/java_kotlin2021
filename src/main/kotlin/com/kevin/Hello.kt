package com.kevin

import kotlin.random.Random

fun main() {
//    println("Hello")
    val h = Human()
    h.hello()
    var name : String = "kevin"
    var weight : Float = 67.5f
    var height : Double = 55.4
}

class Human(){
    fun hello(){
        print("Hello kotlin")
    }
}