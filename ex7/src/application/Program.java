package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        // PART 1 - READING DATA:

        System.out.print("How many employess will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("ID already taken. Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
            System.out.println();
        }

        // PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

        System.out.print("Enter the employee ID that will have salary increase: ");
        int idIncreased = sc.nextInt();

        /*
        OU ASSIM:

        for (Employee person : list){
            if (person.getId() == idIncreased){
                System.out.print("Enter the percentage: ");
                double percentage = sc.nextDouble();
                person.increaseSalary(percentage);
            }
            else{
                System.out.println("This ID does not exist!");
                break;
            }
        }

         */

        Employee employee = list.stream().filter(x -> x.getId() == idIncreased).findFirst().orElse(null);
        if (employee == null) {
            System.out.println("This ID does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            employee.increaseSalary(sc.nextDouble());
        }

        // PART 3 - LISTING EMPLOYEES:

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee person : list) {
            System.out.println(person);
        }

        sc.close();

    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }

}
