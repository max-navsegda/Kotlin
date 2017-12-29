package main

/**
 * Created by Maxim on 12/29/2017.
 */
interface Move {
    fun move()
    fun stop() {
        println("Stop")
    }
}