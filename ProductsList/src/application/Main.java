package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println("Product #"+i+" data: ");
            System.out.print("Common, used or imported? (c/u/i): ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextInt();
            if(ch == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else if(ch == 'u'){
                System.out.print("Manufacture date (dd/mm/yyyy): ");
                sc.nextLine();
                String dateAux = sc.nextLine();
                Date date = sdf.parse(dateAux);
                list.add(new UsedProduct(name, price, date));
            } else {
                list.add(new Product(name, price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p: list) {
            System.out.println(p.priceTag());}
    }
}

