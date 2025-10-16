package se.lexicon;

public class ConverterOperations {

                    //SEK TO USD
    public static double convertsekToUsd(double sekCurrency){
        double usdCurrency = sekCurrency * ConverterRate.sekToUsd;
        return usdCurrency;
        }
                    //USD TO SEK
    public static double convertusdToSek(double usdCurrency){
        double sekCurrency = usdCurrency * ConverterRate.usdToSek;
        return sekCurrency;
        }
                    //SEK TO EURO
    public static double convertsekToEuro(double sekCurrency){
        double euroCurrency = sekCurrency * ConverterRate.sekToEuro;
        return euroCurrency;
        }
                    //EURO TO SEK
    public static double converteuroToSek(double euroCurrency){
        double sekCurrency = euroCurrency * ConverterRate.euroToSek;
        return sekCurrency;
    }
    public static double convertUsdToEuro(double usdCurrency){
        double sekdollar = usdCurrency * ConverterRate.usdToSek;
        double euroDollar = sekdollar * ConverterRate.sekToEuro;
        return euroDollar;
    }

   public static double convertEuroToUsd(double euroCurrency){
        double sekDollar = euroCurrency * ConverterRate.euroToSek;
        double usdDollar = sekDollar * ConverterRate.sekToUsd;
        return usdDollar;
    }
}
