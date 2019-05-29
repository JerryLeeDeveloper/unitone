package com.train;

import java.util.Scanner;

public class TicketJava {

    private int total;
    private int round;
    private Scanner scanner;

    int singleTrip = 1000;
    int roundTrip = (int) (2000*0.9);

    public TicketJava(int total, int round, Scanner scan) {
        this.total = total;
        this.round = round;
        this.scanner = scan;
    }

    public void calculate() {
        if (total < round) {
            System.out.println("Please reset round-trip of tickets: ");
            round = scanner.nextInt();
        }
        int totalPrice = ((total - round) * singleTrip) + (round*roundTrip);
        System.out.println("Total tickets:"+total+"\n"+"Round-trip:"+round+"\n"+"Total:"+totalPrice);
    }
}
