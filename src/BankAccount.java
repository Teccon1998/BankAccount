import myAccounts.Account;
import java.util.Scanner;
public class BankAccount
{
    public static void main(String[] args) throws Exception 
    {
        Scanner keyboard = new Scanner(System.in);

        int choice = displayMenu(keyboard);
        Account acc = new Account();

        while(choice != 6)
        {
            switch(choice)
            {
                case 1:
                    acc.checkBal();
                    break;
                case 2:
                    acc.deposit(keyboard);
                    break;
                case 3:
                    acc.withdraw(keyboard);
                    break;
                case 4:
                   // viewPrevTrans();
                    break;
                case 5:
                    //calcInterest();
                    break;
                case 6:
                    //exitMessage();
                    break;
            }
        }
        keyboard.close();
    }
    public static int displayMenu(Scanner keyboard)
    {
        System.out.println("1. Check Balance");
        System.out.println("2. Make a Deposit");
        System.out.println("3. Make a Withdrawal");
        System.out.println("4. View the Previous transaction");
        System.out.println("5. Calculate interest");
        System.out.println("5. Exit");
            
        int choice = keyboard.nextInt();
        keyboard.nextLine();
        return choice;
    }

}/*
1.Check your balance
2.Make a deposit
3.Make a withdrawal
4.View the previous transaction
5.Calculate Interest
6.Exit the application

EXTRA: MULTIPLE ACCOUNTS
*/
