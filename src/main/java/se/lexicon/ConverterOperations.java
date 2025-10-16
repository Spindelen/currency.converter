package se.lexicon;

public class ConverterOperations {

    public static double convertsekToUsd(double sekCurrency){
        double usdCurrency = sekCurrency * ConverterRate.sekToUsd;
        return usdCurrency;
        }

    public static double convertusdToSek(double usdCurrency){
        double sekCurrency = usdCurrency * ConverterRate.usdToSek;
        return sekCurrency;
        }

    public static double convertsekToEuro(double sekCurrency){
        double euroCurrency = sekCurrency * ConverterRate.sekToEuro;
        return euroCurrency;
        }

    public static double converteuroToSek(double euroCurrency){
        double sekCurrency = euroCurrency * ConverterRate.euroToSek;
        return sekCurrency;
    }
}
