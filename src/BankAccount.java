import myAccounts.Account;
import java.util.Scanner;
import java.util.LinkedList;
public class BankAccount
{
    public static void main(String[] args) throws Exception 
    {
        Scanner keyboard = new Scanner(System.in);
        LinkedList<Account> AccList = new LinkedList<Account>();
        int choice = displayMenu(keyboard);
        Account acc = new Account();

        System.out.println("Do you have an account(Y/N)?");
        if((keyboard.next().toUpperCase().charAt(0)) == 'Y')
        {
            while(choice != 7)
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
                       // acc.viewPrevTrans();
                        break;
                    case 5:
                        acc.calcInterest(keyboard);
                        break;
                    case 6:
                       // createNewAccount();
                        break;
                    case 7:
                        acc.exitMessage();
                        break;
                }
            }
        }
        else if((keyboard.next().toUpperCase().charAt(0)) == 'N')
        {
           // createNewAccount(AccList);
        }
        else 
        {

        }
        AccList.add(acc);

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
   // public static LinkedList<Account> createNewAccount(LinkedList<Account> AccList)
    {
      //  Account acc = new Account();
        //acc.
        //return AccList;
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
