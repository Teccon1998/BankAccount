package myAccounts;
import java.util.Scanner;
public class Interest 
{
    
    public void calculate()
    {

    }
    public double interestAmt(Scanner keyboard)
    {
        // System.out.print("What is the principal investment?: ");
        // startPrinc = keyboard.nextDouble();
        // keyboard.nextLine();

        double endBal = startPrinc* (1 + (interest));
        return endBal;
    }


    private
    double startPrinc;
    double annualContrib;
    double monthlyContrib;
    boolean contribBeginning;
    boolean contribEnd;
    double interest;
    double taxRate;
    double inflationRate;
    int term;
}
