package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    val total = scanner.nextInt()
    print("How many round-trip tickets: ")
    val round = scanner.nextInt()
    val ticket = Ticket(total, round, scanner)
    ticket.calculate()
}

class Ticket(private var total: Int, private var round: Int, private val scan: Scanner){
    private val singleTrip = 1000
    private val roundTrip = 2000*0.9

    fun calculate() {
        if(total < round) {
            print("Please reset round-trip tickets: ")
            round = scan.nextInt()
        }
        val totalPrice = (((total - round) * singleTrip) + ( round * roundTrip)).toInt()
        println("Total tickets:$total\nRound-trip:$round\nTotal:$totalPrice")
    }

}

