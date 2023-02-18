package application;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;


public class Stock {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        System.out.println("Product data: "+product+"\n");
        System.out.println("If you wish to add more " + product.getName() + "s to the stock press 1, if you wish to remove press 2, to end the program press 0");
        input = sc.nextInt();
        while(input != 0) {

            if(input==1) {

        System.out.print("Enter the "+ product.getName() +"s quantity that you wish to add in stock: ");
                int quantity = sc.nextInt();
                product.AddProducts(quantity);

                System.out.println("Updated data: "+product+"\n");
            } else {
                System.out.print("Enter the "+ product.getName() +"s quantity that you wish to remove from the stock: ");
                int quantity = sc.nextInt();
                product.RemoveProducts(quantity);
                System.out.println("Updated data: "+product+"\n");
            }
            System.out.println("If you wish to add more " + product.getName() + "s to the stock press 1, if you wish to remove press 2, to end the program press 0");
            input = sc.nextInt();
        }

        sc.close();
    }
}
