import java.util.Scanner;

public class Ex2EstruturaSequencial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio = sc.nextDouble();
        sc.close();

        System.out.printf("A=%.4f",pi*(Math.pow(raio,2)));
    }
}
