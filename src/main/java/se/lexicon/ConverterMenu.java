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
                operationChoices(choice);

            }
            catch (InputMismatchException e) {
                System.out.println("invalid input, enter number again");
                scanner.nextInt();
            }
        }
    }

    private static void operationChoices(int choice) {
            double sekCurrency, usdCurrency, euroCurrency;
            Scanner scanner = new Scanner(System.in);

            switch (choice) {
                case 1:
                    System.out.println("Enter Sek");
                    sekCurrency = scanner.nextDouble();
                    usdCurrency = ConverterOperations.convertsekToUsd(sekCurrency);
                    System.out.println(sekCurrency + "SEK is" + usdCurrency + "USD");
                    break;

                case 2:
                    System.out.println("Enter Usd");
                    usdCurrency = scanner.nextDouble();
                    sekCurrency = ConverterOperations.convertusdToSek(usdCurrency);
                    System.out.println(usdCurrency + "USD is" + sekCurrency + "SEK");
                    break;

                case 3:
                    System.out.println("Enter Sek");
                    sekCurrency = scanner.nextDouble();
                    euroCurrency = ConverterOperations.convertsekToEuro(sekCurrency);
                    System.out.println(sekCurrency + "SEK is" + euroCurrency + "EURO");
                    break;

                case 4:
                    System.out.println("Enter Euro");
                    euroCurrency = scanner.nextDouble();
                    sekCurrency = ConverterOperations.converteuroToSek(euroCurrency);
                    System.out.println(euroCurrency + "Euro is" + sekCurrency + "SEK");
                    break;

                case 0:
                    System.out.println("Exit the converter.\n Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input, please choice valid options");
                    break;
            }



    }



}


