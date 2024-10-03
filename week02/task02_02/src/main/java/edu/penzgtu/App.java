package edu.penzgtu;

public class App 
{
    public static void main( String[] args )
    {
        BankAccount userAccount1 = new BankAccount();
        userAccount1.setAccountNumber("1234 5678 9012 3456");
        System.out.println(userAccount1.getAccountNumber());

    
        // Deposit
        userAccount1.deposit(100);
        
        System.out.print(userAccount1.getBalance());

        // Withdraw
        userAccount1.withdraw(99);
        System.out.printf(userAccount1.getBalance());
        userAccount1.withdraw(10);
        System.out.printf(userAccount1.getBalance());
    }
}
