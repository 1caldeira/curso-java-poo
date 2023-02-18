package application;

import entities.Produto;

import java.util.Scanner;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many products do you wish to register?");
        int n = sc.nextInt();
        Produto[] vet = new Produto[n];
        String name;

        for(int i = 0; i < vet.length; i++){
            sc.nextLine();
            name = sc.nextLine();
            double price = sc.nextDouble();
            vet[i] = new Produto(name, price);
        }

        double sum = 0;

        for(int i = 0; i < vet.length; i++){
            sum += vet[i].getPrice();
        }
        double average = sum/n;
        System.out.printf("AVERAGE PRICE = %.2f\n", average);
    }
}
