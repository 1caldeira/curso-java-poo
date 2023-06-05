import entities.CarRental;
import entities.Vehicle;
import service.entities.BrazilTaxService;
import service.entities.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.print("Enter the car model: ");
        String carModel = sc.nextLine();
        System.out.print("Enter the rental initial date and time: ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Enter the rental end date and time: ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter the price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter the price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("BILLING:");
        System.out.println("Basic Payment: "+String.format("%.2f",cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: "+String.format("%.2f",cr.getInvoice().getTax()));
        System.out.println("Total Payment: "+String.format("%.2f",cr.getInvoice().totalPayment()));
    }
}
