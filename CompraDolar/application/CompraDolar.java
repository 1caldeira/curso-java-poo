package application;

import util.CurrencyConverter;

import java.util.Scanner;



public class CompraDolar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current USD price in BRL: ");
        double usdPrice = sc.nextDouble();
        System.out.println("How many dollars do you intend to buy? ");
        double usdAmount = sc.nextDouble();
        double result = CurrencyConverter.convert(usdPrice, usdAmount);
        System.out.println("Final price in BRL: "+result);



    }
}
