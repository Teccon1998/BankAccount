package myAccounts;
import java.util.Scanner;
public class Interest {
    
    public void calculate()
    {

    }
    public void interestAmt(Scanner keyboard)
    {
        System.out.print("What is the principal investment?: ");
        startPrinc = keyboard.nextDouble();
        keyboard.nextLine();

        
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
