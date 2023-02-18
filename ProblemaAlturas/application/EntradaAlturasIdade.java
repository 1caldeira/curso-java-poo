package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Pessoas;
import java.lang.String;

public class EntradaAlturasIdade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce deseja registrar? ");
        int n = sc.nextInt();
        Pessoas[] vet = new Pessoas[n];

        for (int i = 0; i < vet.length; i++) {

            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vet[i] = new Pessoas(nome, idade, altura);
        }

        double somaAltura=0;
        int j = 0;
        String[] underage = new String[n];

        for (int i = 0; i < vet.length; i++) {
            somaAltura += vet[i].getAltura();
            if(vet[i].getIdade() < 16){
                underage[j] = vet[i].getNome();
                j++;
            }
        }

        double alturaMedia = somaAltura/n;
        double porcentagemUnderage = (double)j/n*100;

        System.out.printf("Altura Media: %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemUnderage);

            for(int i = 0; i<j; i++){
            System.out.println(underage[i]);
            }
        }
}