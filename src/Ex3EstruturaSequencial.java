import java.util.Scanner;

public class Ex3EstruturaSequencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();
        sc.close();

        System.out.println("NUMBER = "+numFuncionario);
        System.out.printf("SALARY = U$ %.2f", horasTrabalhadas*valorHora);
    }
}
