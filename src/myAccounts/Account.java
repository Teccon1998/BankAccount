package myAccounts;
import java.util.Scanner;
public class Account 
{
    public double checkBal() 
    {
        return balance;
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
    public void calcInterest(Scanner keyboard) 
    {
        Interest inter = new Interest();
	}

    public String exitMessage()
    {
        String exitmessage = "Thank you for banking with us.";
        return exitmessage;
    }
    public void accName(Scanner keyboard)
    {
        System.out.print("Name for the account:");
        accountName = keyboard.nextLine().toUpperCase();
    }
    public void accOwner(Scanner keyboard)
    {
        System.out.print("Owner of the account:");
        accountOwner = keyboard.nextLine().toUpperCase();
    }
    private 
    double balance = 0;
    String accountName = "NULL";
    String accountOwner ="NULL";

}
