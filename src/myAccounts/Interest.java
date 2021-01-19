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
    public double calcInflate(double preInflate)
    {
        double postInflate = 0;
        postInflate = preInflate - (preInflate * inflationRate);
        return postInflate;
    }
    public double anlCont(double contrib)
    {
        double finaladd;
        finaladd = amount + contrib;
        return finaladd;
    }
    public double monCont(double contrib)
    {
        double finaladd;
        finaladd = amount + contrib;
        return finaladd;
    }
    public double calcTax()
    {
        gains = startPrinc - amount;
        return gains;
    }
    public void compRate()
    {
        
    }
    public void compTerm()
    {
        
    }

    private
    double amount;
    double gains;
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
