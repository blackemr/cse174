/* Shopping Cart Application Template
 * Complete the missing code in the program
 * Name: Matthew Blackert
 * Date: November 29th, 2018
 */

import java.util.*;

public class Lab13ShoppingApp {
  
  public static void main(String[] args) {
    //create cart object 
    ShoppingCart cart = new ShoppingCart();
    Scanner input = new Scanner(System.in);
    boolean exit = false;
    
    while(!exit)
    {
      char op = menu();
      
      switch (op) {
        case 'A': 
          //Method call for adding a new order **use readOrderFromKeyboard()as argument
          cart.addOrder(readOrderFromKeyboard());
          break;
        case 'B': 
          //Method call for listing orders in the cart
          cart.listOrders();
          break;  
        case 'b': 
          //Method call for listing orders in the cart
          cart.listOrders();
          break;
        case 'C': 
          //Method call for listing orders in the cart
          cart.listOrders();
          //Method call for billing orders in the cart
          double price = cart.getBill();
          System.out.println("Total: $" + price);
          System.out.println("You are paying the bill \nAre you sure (Yes/No)");
          String choice = input.next();
          if (choice.equals("yes") || choice.equals("Yes")) {
            cart = new ShoppingCart();
            System.out.println("Done");
          }
          break;
        case 'X': 
          
          //Code for exit
          exit = true;
          break;
          
        default: System.out.println("Wrong Option");
        break; 
      }
    }
  }
  
  public static char menu() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("\t===============================");
    System.out.println("\tCSE174 ShoppingCart Application"); 
    System.out.println("\tDeveloped by: Matthew Blackert "); 
    System.out.println("\tDate: November 29th, 2018");
    System.out.println("\tMatt's Shop");
    System.out.println("\t===============================");
    System.out.println("\tA. Add an item to the Shopping Cart");
    System.out.println("\tB. List items in the Shopping Cart");
    System.out.println("\tC. Pay the bill");
    System.out.println("\tX. Exit");
    System.out.println();
    System.out.print("Option:"); 
    
    return keyboard.nextLine().toUpperCase().charAt(0);
    
  }
  
  // Reads the user code  
  public static Order readOrderFromKeyboard()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("***Enter the Details");
    System.out.print("  Bar Code: ");
    int barCode = sc.nextInt();
    System.out.print("      Name: ");
    String name = sc.next();
    System.out.print("     Units: ");
    int units = sc.nextInt();
    System.out.print("Unit Price: ");
    double unitPrice = sc.nextDouble();
    Order userOrder = new Order(barCode, name, units, unitPrice);
    System.out.println("Order is placed in the Cart");
    //return Order object;    
    return userOrder;
  }
}
