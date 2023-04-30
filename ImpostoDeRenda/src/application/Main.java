package application;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuintes> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax Payer #"+i+" data:");
            System.out.print("Individual or company? (i/c) ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual Income: ");
            double yEarnings = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenses = sc.nextDouble();
                list.add(new PessoaFisica(name,yEarnings,healthExpenses));
            }else{
                System.out.print("Number of employees: ");
                int nEmployees = sc.nextInt();
                list.add(new PessoaJuridica(name, yEarnings, nEmployees));
            }
            }
            System.out.println("TAXES PAID:");
            double sum = 0;
            for (Contribuintes c: list) {
            System.out.println(c.getName()+": $ "+ String.format("%.2f", c.taxes()));
            sum += c.taxes();
            System.out.println("TOTAL TAXES: "+ String.format("%.2f", sum));
        }
    }
}
