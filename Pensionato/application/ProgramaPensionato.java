package application;
import entities.Registros;

import java.util.Scanner;


public class ProgramaPensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int nRents = sc.nextInt();
        Registros[] vet = new Registros[10];

        for(int i = 0; i<nRents; i++){

            System.out.println("Rent #"+(i+1));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vet[room] = new Registros(name, email);

        }
        System.out.println("Busy Rooms:");
        for(int i = 0; i<vet.length; i++) {
            if (vet[i] != null){
                System.out.println(i+": "+vet[i].getName()+", "+vet[i].getEmail());
            }

        }
    }
}
