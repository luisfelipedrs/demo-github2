package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.p1 = sc.nextDouble();
        student.p2 = sc.nextDouble();
        student.p3 = sc.nextDouble();

        System.out.println(student.finalGrade());

        sc.close();

    }
}
