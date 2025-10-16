package se.lexicon;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*String greeting = "Hello";
        greeting = greeting.concat(" World");
        System.out.println(greeting);
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println(" \uD83E\uDD17 \uD83D\uDC4B ");
        System.out.println(" Which converter\n do you want to\n START?\uD83E\uDDD0");
        System.out.println("--------------------");
        System.out.println("1 -\uD83D\uDCB0 Standard converter");
        System.out.println("2 -\uD83D\uDE80 Quick Rates, MultiConverter");
        System.out.println("Choice 1 or 2:");
        System.out.println("\uD83D\uDC49");
        int choice = scanner.nextInt();

        if (choice == 1) {
            ConverterMenu converter1 = new ConverterMenu();
            converter1.start();
        } else if (choice == 2) {
            ConverterMenu2 converter2 = new ConverterMenu2();
            converter2.start();
        } else {
            System.out.println("Unknown choice, start over");

        }
    }
}