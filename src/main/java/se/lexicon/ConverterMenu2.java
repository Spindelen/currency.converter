package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConverterMenu2 {
    public void start() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd\n HH:mm:ss");

        Scanner scanner = new Scanner(System.in);
        String input = "";


        while (true){


            System.out.println(" +---------------------+ ");
            System.out.println(" | ⚡⚡⚡ Quick Rates ⚡⚡⚡ |");
            System.out.println(" +---------------------+ ");
            System.out.println("1. Convert :- SEK");
            System.out.println("2. Convert $ USD");
            System.out.println("3. Convert € EURO");
            System.out.println("0. Exit ");
            System.out.println(" Enter your choice:");
            System.out.print("\uD83D\uDC49");

            try {
                int choice = scanner.nextInt();
                operationChoices(choice);

            }
            catch (InputMismatchException e) {
                System.out.println("invalid input, enter number again");
                scanner.next();
                scanner.nextLine();
            }
        }



    }

    private static void operationChoices(int choice) {
        double sekCurrency, usdCurrency, euroCurrency, euroDollar, usdDollar = 0;
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd\n HH:mm:ss");
        String formattedDateTime = LocalDateTime.now().format(formatter);


        switch (choice) {


            case 1:
                System.out.println("Enter Sek");
                System.out.print("\uD83D\uDC49");
                sekCurrency = scanner.nextDouble();
                usdCurrency = ConverterOperations.convertsekToUsd(sekCurrency);
                euroCurrency = ConverterOperations.convertsekToEuro(sekCurrency);
                System.out.println("__________________");
                System.out.println(sekCurrency + " :- SEK is: \n" + usdCurrency + " $ USD\n" + euroCurrency +" € Euro\n" +formattedDateTime);
                System.out.println("__________________");
                break;

            case 2:
                System.out.println("Enter Usd");
                System.out.print("\uD83D\uDC49");
                usdCurrency = scanner.nextDouble();
                sekCurrency = ConverterOperations.convertusdToSek(usdCurrency);
                euroDollar = ConverterOperations.convertUsdToEuro(usdCurrency);
                System.out.println("__________________");
                System.out.println(usdCurrency + " $ USD is \n" + sekCurrency + " :- SEK\n" + euroDollar +" € Euro\n" +formattedDateTime);
                System.out.println("__________________");
                break;

            /*case 31:
                System.out.println("Enter Sek");
                System.out.print(">");
                sekCurrency = scanner.nextDouble();
                euroCurrency = ConverterOperations.convertsekToEuro(sekCurrency);
                System.out.println("__________________");
                System.out.println(sekCurrency + " SEK is \n" + euroCurrency + " EURO\n" +formattedDateTime);
                System.out.println("__________________");

                break;*/

            case 3:
                System.out.println("Enter Euro");
                System.out.print("\uD83D\uDC49");
                euroCurrency = scanner.nextDouble();
                sekCurrency = ConverterOperations.converteuroToSek(euroCurrency);
                usdDollar = ConverterOperations.convertEuroToUsd(euroCurrency);
                System.out.println("__________________");
                System.out.println(euroCurrency + " € Euro is \n" + sekCurrency + " :- SEK\n" + usdDollar +" $ USD\n" +formattedDateTime);
                System.out.println("__________________");
                break;

            case 0:
                System.out.println("__________________");
                System.out.println(">>>>>>>Exit<<<<<<<<<\n ZzzzGood night!Zzzz\n Zzzzzzzzzzzzzzz");
                System.out.println("__________________");
                System.out.println("       \uD83D\uDEAA     ");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input, please choice valid options");
                break;
        }
    }
}





