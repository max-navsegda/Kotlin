package main

import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS

/**
 * Created by Maxim on 12/25/2017.
 */
fun main (args: Array<String>){

    val  person: Person = Person("Max")
    val m1 = Car()
    m1.move()
    println(person.name)
    println(person.age)
    println(person.info)
    person.sayCool()

    var age: Int = 10
    val name = "Bird"
    val nick = "Duck"
    val stroke = "$name $nick $age"

    println(stroke)

    for(i in 1..9){
        for(j in 1..9){
            print("${i * j} \t")
        }
        println()
    }

    val phones: Array<String> = arrayOf("Galaxy S8", "iPhone X", "Motorola C350")
    for(phone in phones){
        println(phone)
    }
}