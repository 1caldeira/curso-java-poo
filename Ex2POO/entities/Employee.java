package entities;

public class Employee {
    public String name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        return GrossSalary - Tax;
    }

    public String toString(){
        return name+", $ "+String.format("%.2f",NetSalary());
    }

    public void IncreaseSalary(double percentage){
        this.GrossSalary = GrossSalary*(percentage/100) + GrossSalary;
    }
}
