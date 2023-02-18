package application;
import entities.Employee;

import java.util.Scanner;
import java.util.Locale;


public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();

        System.out.print("Enter the employee's name: ");
        employee.name = sc.nextLine();

        System.out.print("Enter Mr./Ms. "+employee.name+"'s gross salary: ");
        employee.GrossSalary = sc.nextDouble();

        System.out.print("Enter the value that will be paid in taxes: ");
        employee.Tax = sc.nextDouble();

        System.out.println("Employee: "+employee);
        System.out.print("Enter the percentage increase that will be applied to the gross salary: ");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.println("Updated data: "+employee);
    }
}
