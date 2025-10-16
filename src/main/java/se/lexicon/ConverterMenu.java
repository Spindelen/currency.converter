package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConverterMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true){

            System.out.println("Currency Converter");
            System.out.println("1. Convert SEK to USD");
            System.out.println("2. Convert USD to SEK");
            System.out.println("3. Convert SEK to EURO");
            System.out.println("4. Convert Euro to SEK");
            System.out.println("0. Exit ");
            System.out.println(" Enter your choice:");

            try {
                int choice = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("invalid input, enter number again");
                scanner.nextInt();
            }



        }



    }

}


