package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets: ");
        int total = scanner.nextInt();
        System.out.println("How many round-trip tickets: ");
        int round = scanner.nextInt();
        Ticket ticket = new Ticket(total, round, scanner);
        ticket.calculate();
    }
}
