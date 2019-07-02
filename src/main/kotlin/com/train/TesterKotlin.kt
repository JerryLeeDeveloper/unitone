package com.train

import java.util.*

fun main() {
    Ticket(Scanner(System.`in`)).continuous()
}

class Ticket(private val scan: Scanner){
    private val singleTrip = 1000
    private val roundTrip = 2000*0.9
    private val exit = -1
    private var total = 0
    private var round = 0

    fun continuous() {
        while (total != exit) {
            if (total == exit) print("Exit")
            print("Please enter number of tickets: ")
            total = scan.nextInt()
            if (total != exit) {
                print("How many round-trip tickets: ")
                round = scan.nextInt()
                val totalPrice = (((total - round) * singleTrip) + ( round * roundTrip)).toInt()
                println("Total tickets:$total\nRound-trip:$round\nTotal:$totalPrice")
            }
        }
    }

}

