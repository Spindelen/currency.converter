package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConverterMenu {
    public static void start() {

      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

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
            System.out.print(">");

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
            double sekCurrency, usdCurrency, euroCurrency = 0;
            Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime =LocalDateTime.now().format(formatter);



            switch (choice) {


                case 1:
                    System.out.println("Enter Sek");
                    System.out.print(">");
                    sekCurrency = scanner.nextDouble();
                    usdCurrency = ConverterOperations.convertsekToUsd(sekCurrency);
                    System.out.println("__________________");
                    System.out.println(sekCurrency + " SEK is: \n" + usdCurrency + " USD\n" +formattedDateTime);
                    System.out.println("__________________");
                    break;

                case 2:
                    System.out.println("Enter Usd");
                    System.out.print(">");
                    usdCurrency = scanner.nextDouble();
                    sekCurrency = ConverterOperations.convertusdToSek(usdCurrency);
                    System.out.println("__________________");
                    System.out.println(usdCurrency + " USD is \n" + sekCurrency + " SEK\n" +formattedDateTime);
                    System.out.println("__________________");
                    break;

                case 3:
                    System.out.println("Enter Sek");
                    System.out.print(">");
                    sekCurrency = scanner.nextDouble();
                    euroCurrency = ConverterOperations.convertsekToEuro(sekCurrency);
                    System.out.println("__________________");
                    System.out.println(sekCurrency + " SEK is \n" + euroCurrency + " EURO\n" +formattedDateTime);
                    System.out.println("__________________");

                    break;

                case 4:
                    System.out.println("Enter Euro");
                    System.out.print(">");
                    euroCurrency = scanner.nextDouble();
                    sekCurrency = ConverterOperations.converteuroToSek(euroCurrency);
                    System.out.println("__________________");
                    System.out.println(euroCurrency + " Euro is \n" + sekCurrency + " SEK\n" +formattedDateTime);
                    System.out.println("__________________");
                    break;

                case 0:
                    System.out.println("__________________");
                    System.out.println("Exit the converter.\n \nGoodbye!");
                    System.out.println("__________________");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input, please choice valid options");
                    break;
            }



    }



}


