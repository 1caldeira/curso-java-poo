import java.util.Scanner;

public class Ex1EstruturaSequencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();

        System.out.println("SOMA = "+(x+y));
    }
}
