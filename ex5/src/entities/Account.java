package entities;

public class Account {

    private final int accNumber;
    private String name;
    private double initialDeposit;
    private double balance;

    public Account(int accNumber, String name, double initialDeposit){
        this.accNumber = accNumber;
        this.name = name;
        this.initialDeposit = initialDeposit;
    }

    public Account(int accNumber, String name){
        this.accNumber = accNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public double getBalance() {
        return initialDeposit + balance;
    }

    public void addToBalance(double value){
        balance += value;
    }

    public void removeFromBalance(double value){
        balance -= (value + 5);
    }

    public String toString(){
        return String.format("%s%d%s%s%s%.2f", "Account ", accNumber, ", Holder: ", name, ", Balance: $ ", getBalance());
    }
}
