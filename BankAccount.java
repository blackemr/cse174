/* Program 13 Help File 2
 * CSE 174 Fall 2018 
 *Dr. Vijayalakshmi Ramasamy
 */

/**
   The BankAccount class simulates a bank account.
*/

public class BankAccount
{
   private String name;         // Name
   private double balance;      // Account balance

   /**
      This constructor sets the starting balance at 0.0.      
   */
   public BankAccount() {
     name = " "; 
     balance = 0.0;
   }
   
   /**
      This constructor sets the starting balance
      to the value passed as an argument.
      @param name The name of the customer
      @param startBalance The starting balance.
   */
   public BankAccount(String name, double startBalance) {
     this.name = name;  
     balance = startBalance;
   }

   /**
      The deposit method makes a deposit into the account.
      @param amount The amount to add to the balance field.
   */
   public void deposit(double amount) {
      balance += amount;
   }

   /**
      The withdraw method withdraws an amount from the account.
      @param amount The amount to subtract from the balance field.
   */
   public void withdraw(double amount) {
      balance -= amount;
   }
   
   /**
      The setBalance method sets the account balance.
      @param b The value to store in the balance field.
   */
   public void setBalance(double b) {
      balance = b;
   }

   /**
      The getName method returns the name of the customer.
      @return The value in the name field.
   */
   public String getName() {
      return name;
   }
   
   /**
      The getBalance method returns the account balance.
      @return The value in the balance field.
   */
   public double getBalance() {
      return balance;
   }
}