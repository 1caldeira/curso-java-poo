package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double convert(double usdPrice, double usdAmount){
        return usdPrice * usdAmount + (usdPrice * usdAmount * IOF);
    }
}
