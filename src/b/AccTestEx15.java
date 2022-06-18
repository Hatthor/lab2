//ex3.15
package b;


import java.util.Scanner;

public class AccTestEx15 {
    public static void displayAccount(AccountEx15 accountToDisplay){
        System.out.printf("Account name: %s%nBalance: %f%n%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AccountEx15 a1 = new AccountEx15("Stephen King", 40.00);
        AccountEx15 a2 = new AccountEx15("Mark Hamill", -8.79);

        displayAccount(a1); displayAccount(a2);
        System.out.println("Enter deposit for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.3f to account balance%n%n",
                depositAmount);
        a1.deposit(depositAmount);

        System.out.println("Enter the amount to withdraw for the account1:");
        double withdrawamount = input.nextDouble();
        if(withdrawamount <= a1.getBalance())
        {
            a1.withdraw(withdrawamount);
            System.out.println("\n The process was completed with success");
        }
        else
            System.out.println("The withdrawal amount exceeded the account balance");
        System.out.println("Enter deposit for account2: ");
        //double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.3f to account balance%n%n",
                depositAmount);
        a2.deposit(depositAmount);
        System.out.println("Enter amount for withdraw for account2:");
        withdrawamount = input.nextDouble();
        if(withdrawamount <= a2.getBalance())
        {
            a2.withdraw(withdrawamount);
            System.out.println("\nThe process was completed with success");
        }
        else
            System.out.println("The withdrawal amount exceeded the account balance");

        displayAccount(a1);
        displayAccount(a2);
    }
}
