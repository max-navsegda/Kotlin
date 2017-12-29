package main

/**
 * Created by Maxim on 12/29/2017.
 */
class Person {
    var name: String = "Max"
    var age: Int = 29

    val info: String get() = "Name:  $name  age: $age"

    constructor(name: String) {
        this.name = name
    }

    fun sayCool(){
        "Cool"
    }
}