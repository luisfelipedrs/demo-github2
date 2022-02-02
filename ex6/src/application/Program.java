package application;

import entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        System.out.println();

        Students[] vect = new Students[10];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Rent #" + (i + 1) + ": ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Students(name, email, room);
            System.out.println();
        }

        System.out.println("Busy rooms: ");

        for (Students students : vect) {
            if (students != null) {
                System.out.println(students);
            }
        }

        sc.close();

    }
}
