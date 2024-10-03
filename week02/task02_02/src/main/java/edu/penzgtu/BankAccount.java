package edu.penzgtu;

public class BankAccount {
    private String accountNumber;
    private float balance;
    
    public void deposit(float amount) {
        this.balance += amount;
    }

    public void withdraw(float amount) {
        if (balance >= amount) {
            this.balance -= amount;
        }
    }

    public String getBalance() {
        return String.format("Balance: %f\n", balance);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
