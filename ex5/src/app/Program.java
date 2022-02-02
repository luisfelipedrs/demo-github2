package app;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit? (y/n) ");
        String answer = sc.next();

        if(answer.startsWith("y")){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            System.out.println();
            Account account = new Account(accNumber, name, initialDeposit);
            System.out.println("Account data: ");
            System.out.println(account);
            System.out.println();
            System.out.print("Enter a deposit value: ");
            double deposit = sc.nextDouble();
            account.addToBalance(deposit);
            System.out.println("Updated account data: ");
            System.out.println(account);
            System.out.println();
            System.out.print("Enter a withdraw value: ");
            double withdraw = sc.nextDouble();
            account.removeFromBalance(withdraw);
            System.out.println("Updated account data: ");
            System.out.println(account);
        }

        else{
            System.out.println();
            Account account = new Account(accNumber, name);
            System.out.println("Account data: ");
            System.out.println(account);
            System.out.println();
            System.out.print("Enter a deposit value: ");
            double deposit = sc.nextDouble();
            account.addToBalance(deposit);
            System.out.println("Updated account data: ");
            System.out.println(account);
            System.out.println();
            System.out.print("Enter a withdraw value: ");
            double withdraw = sc.nextDouble();
            account.removeFromBalance(withdraw);
            System.out.println("Updated account data: ");
            System.out.println(account);

        }

        sc.close();
    }
}
