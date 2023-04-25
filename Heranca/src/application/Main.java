package application;
import entities.Account;
import entities.BusinessAccount;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Type in the account holder name, the old account ID and an initial deposit amount in order to create your new bank account: ");
        System.out.print("Name: ");
        String holder = sc.nextLine();
        System.out.print("Account ID: ");
        int number = sc.nextInt();
        System.out.print("First deposit amount: $");
        double amount = sc.nextDouble();
        Account account = new Account(number, holder, amount);
        BusinessAccount bAccount = new BusinessAccount();
        System.out.print("Is your new account a business account? Y/N: ");
        String IsBusinessAccount = sc.next();
        if(IsBusinessAccount.equals("Y")){
            System.out.print("Type in your loan limit value: $");
            double loanLimit = sc.nextDouble();
            bAccount = new BusinessAccount(number, holder, amount, loanLimit);
        }

        System.out.println("Type 1 if you want to check your data, 2 if you want to make a deposit, 3 if you want to withdraw " +
                "and 4 if you want to request a loan (Business ACC only), 5 to close operations");
        int option = sc.nextInt();
        while (option != 5) {
            switch (option) {
                case 1 -> {
                    System.out.println("Account Information: ");
                    System.out.println("Account holder: " + account.getHolder());
                    System.out.println("Account ID: " + account.getNumber());
                    System.out.println("Account balance: " + account.getBalance());
                    if (IsBusinessAccount.equals("Y")) {
                        System.out.println("Loan limit: " + bAccount.getLoanLimit());
                    }
                }
                case 2 -> {
                    System.out.print("Enter the amount you wish to deposit: $");
                    amount = sc.nextDouble();
                    account.deposit(amount);
                    System.out.println("New balance: $" + String.format("%.2f", account.getBalance()));
                }
                case 3 -> {
                    System.out.print("Enter the amount you wish to withdraw: $");
                    amount = sc.nextDouble();
                    account.withdraw(amount);
                    System.out.println("New balance: $" + String.format("%.2f", account.getBalance()));
                }
                case 4 -> {
                    if (!IsBusinessAccount.equals("Y")) {
                        System.out.println("This option is only available to business accounts, please select another option.");
                    } else {
                        System.out.print("Enter the amount you wish to request: $");
                        amount = sc.nextDouble();
                        bAccount.loan(amount);
                        System.out.println("New balance: $" + String.format("%.2f", bAccount.getBalance()));
                        account.setBalance(bAccount.getBalance());
                    }
                }
            }
            System.out.println();
            System.out.println("Type 1 if you want to check your data, 2 if you want to make a deposit, 3 if you want to withdraw " +
                    "and 4 if you want to request a loan (Business ACC only), 5 to close operations");
            option = sc.nextInt();
        }
        System.out.println("End of operations.");
    }
}