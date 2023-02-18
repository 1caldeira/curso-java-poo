package Application;
import Entities.Student;

import java.util.Scanner;
import java.util.Locale;

public class PassOrFailed {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        student.p1 = sc.nextDouble();
        student.p2 = sc.nextDouble();
        student.p3 = sc.nextDouble();
        student.finalGrade = student.p1 + student.p2 + student.p3;

        System.out.println("FINAL GRADE = "+student);
        sc.close();

    }
}
