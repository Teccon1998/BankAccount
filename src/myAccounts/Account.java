package myAccounts;

import java.util.Scanner;

public class Account 
{
    public void checkBal() 
    {
        System.out.println(balance);
    }
    
    public static double setBal(double bal)
    {
        double newBalance = bal;
        return newBalance;
    }

    public double deposit(Scanner keyboard)
    {
        double depositAmount;
        System.out.print("Deposit Amount: ");
        depositAmount = keyboard.nextDouble();
        keyboard.nextLine();
        return balance += depositAmount;
    }

    public double withdraw(Scanner keyboard)
    {
        double withdrawAmount;
        System.out.print("Deposit Amount: ");
        withdrawAmount = keyboard.nextDouble();
        keyboard.nextLine();
        return balance -= withdrawAmount;
    }
    
    /*public double calcInterest(Scanner keyboard)
    {
        
            Starting principal
            Annual contriubution?
            Monthly contribution?
            Contribute at the beginning or the end of compounding period
            interest rate compound interval?
            Time range?
            Tax rate?
            Inflation rate?
        
    }*/
    
    public String exitMessage()
    {
        String exitmessage = "Thank you for banking with us.";
        return exitmessage;

    }
    
    private 
    double balance = 0;
    String accountName = "NULL";
    String accountOwner ="NULL";

}
