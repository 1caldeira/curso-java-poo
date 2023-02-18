package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Operations;

public class BankAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();
        System.out.print("Enter the account holder's name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n) ");
        char answer = sc.next().charAt(0);
        System.out.println();
        double deposit;
        double withdraw;
        Operations operations = new Operations(accNumber, name);
        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            deposit = sc.nextDouble();
            operations.setDeposit(deposit);
            System.out.println();
            System.out.println("Updated account data:");
        }

            System.out.println("Account: " + operations);
            System.out.println();
            System.out.print("Enter deposit value: ");
            deposit = sc.nextDouble();
            operations.setDeposit(deposit);
            System.out.println("Updated account data:");
            System.out.println("Account: " + operations);
            System.out.println();
            System.out.print("Enter a withdraw value: ");
            withdraw = sc.nextDouble();
            operations.setWithdraw(withdraw);
            System.out.println("Updated account data:");
            System.out.println("Account number: " + operations);

        }
}