import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        Client client = new Client(clientName, email, birthDate);
        System.out.print("Enter order data: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("How many items for this order? ");
        int n = sc.nextInt();
        Instant moment = Instant.now();
        Date date = Date.from(moment);
        Order order = new Order(date, status, client);

        for(int i = 1; i<=n; i++){
            System.out.println("Enter item #"+i+" data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(productName, price);
            OrderItem item = new OrderItem(quantity, price, product);
            order.addItem(item);
        }

        System.out.println(order);

        sc.close();
    }
}