/* Name: Matthew Blackert
 * CSE 174 Fall 2018 
 * Dr. Vijayalakshmi Ramasamy
 * Program13.java
 * This program uses another file named bankaccount.java and together the program simulates a real bank account.
 */
import java.util.ArrayList; // Needed for ArrayList class
import java.util.Scanner;

/**          
 This program demonstrates how to store BankAccount
 objects in an ArrayList and manage banking transactions.
 */

public class Program13 {
  static    Scanner in = new Scanner(System.in);    
  public static void main(String[] args) {
    int choice;
    
    // Create an ArrayList to hold BankAccount objects.
    ArrayList<BankAccount> list = new ArrayList<BankAccount>();    

    do {   
      System.out.println("***  Menu  ***\n1. Create Account \n2. Display \n3. Display All\n4. Deposit \n5. Withdraw \n6. Remove Account \n7. Exit");
      System.out.print("Enter your choice: ");
      choice = in.nextInt();
      switch(choice) {
        case 1: 
          System.out.println("**Create New Account**");
          createAccount(list);
          break;
        case 2: 
          display(list);   
          break;
       case 3:
          displayAll(list); 
          break;
        case 4:
          deposit(list);
          break;
        case 5:
          withdraw(list);
          break;
        case 6:
          removeAccount(list);
          break;
        
        default:
          System.out.println("Thanks for banking with us!!");        
      }
    } while (choice < 7 && choice > 0);
  }
  
  /**
   The createAccount method creates
   a new BankAccount object given a name and initial balance
   specified by the user, then appends to the ArrayList list.
   @param list The list of bank accounts
   */
  
  public static void createAccount(ArrayList<BankAccount> list) {
    System.out.print("Enter name: ");
    String name = in.next();
    System.out.print("Starting balance: ");
    double startBalance = in.nextDouble();
    BankAccount userAcc = new BankAccount(name, startBalance);
    list.add(userAcc);
    System.out.println("Account Created!!");
  }
  
  /**
   The display method displays
   the specified BankAccount object in the ArrayList list
   given the name of the account specified by the user
   @param list The list of bank accounts
   */
  
  public static void display(ArrayList<BankAccount> list) {
    if (list.size() != 0) {
      System.out.print("Enter your name: ");
      String name = in.next();
      for (BankAccount o: list) {
        String comparison = o.getName();
        if (comparison.equals(name)) {
          System.out.println("**Account Details**");
          System.out.println("Name: " + o.getName() + " Balance: " + o.getBalance());
        }
      }
    } else { System.out.println("No Accounts Created Yet!!");}
  }
    
  /**
   The displayAll method displays 
   all the BankAccount objects in the ArrayList list.
   @param list The list of bank accounts
   */
  public static void displayAll(ArrayList<BankAccount> list){
    for(BankAccount o: list)
         System.out.println("Name: " + o.getName() + " Balance: " + o.getBalance());
  }
  
  /**
   The withdraw method updates 
   the balance of specified BankAccount object in the ArrayList list
   using the amount specified by the user.
   @param list The list of bank accounts
   */
  public static void withdraw(ArrayList<BankAccount> list) {
    if (list.size() != 0) {
      System.out.println("**Transaction - Withdraw**");
      System.out.print("Enter your name: ");
      String name = in.next();
      for (BankAccount o: list) {
        String comparison = o.getName();
        if (comparison.equals(name)) {
          System.out.print("Enter amount to withdraw: ");
          double balanceWithdrawn = in.nextDouble();
          o.withdraw(balanceWithdrawn);
        } else {
          System.out.println("Name not found.");
        }
      }
    } else { System.out.println("No Accounts Created Yet!!");}
  }
  
  /**
   The deposit method updates 
   the balance of specified BankAccount object in the ArrayList list
   using the amount specified by the user.      
   @param list The list of bank accounts
   */
  public static void deposit(ArrayList<BankAccount> list) {
    if (list.size() != 0) {
      System.out.println("**Transaction - Deposit**");
      System.out.print("Enter your name: ");
      String name = in.next();
      for (BankAccount o: list) {
        String comparison = o.getName();
        if (comparison.equals(name)) {
          System.out.print("Enter amount to deposit: ");
          double balanceDeposited = in.nextDouble();
          o.deposit(balanceDeposited);
        } else {
          System.out.println("Name not found.");
        }
      }
    } else { System.out.println("No Accounts Created Yet!!");}
  }

   /**
   The removeAccount method removes 
   the specified BankAccount object from the ArrayList list.      
   @param list The list of bank accounts
   */
  public static void removeAccount(ArrayList<BankAccount> list) {
    System.out.print("Enter your name: ");
    String name = in.next();
    for (BankAccount o: list) {
        String comparison = o.getName();
        if (comparison.equals(name)) {
          list.remove(o);
          System.out.println("Account Removed!!");
        }
    }
  }

  
}