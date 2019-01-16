//The students may use many different ways to solve the problems. 


import java.util.Scanner;
public class MethodTestLab {
  public static void main(String[] args) {
    
    int userChoice;
    String str;
    Scanner input = new Scanner(System.in);
    
    //Display menu
    System.out.println("Menu\n 1.sameFirstLast\n 2.twoDigitNumber\n 3.big2Digits\n 4.reverseString\n 5.max3\n");
    
    //Read user's choice
    System.out.print("Enter your choice");
    userChoice = input.nextInt();
    
    //Invoke methods
    switch(userChoice) { 
      case 1:
        // This is written for you as an example
        System.out.println("\n\"Displays true if the first and last characters in a string are same else false\"\n");
        System.out.print("Enter a String: ");
        str = input.next();
        
          
        
        //sameFirstLast method is invoked. 
        System.out.println(sameFirstLast(str));
        
        break;
        
      case 2:
        System.out.println("\n\"Displays the sum of a twoDigitNumber\"\n");
        System.out.print("Enter an two ints: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(twoDigitNumber(num1, num2));
        break;
      case 3:
        System.out.println("\n\"Determines whether the first of last digit is bigger.\"\n");
        System.out.print("Enter a three number digit");
        int threeNum = input.nextInt();
        System.out.println(big2Digits(threeNum));
        break;
      case 4:
        System.out.println("\n\"Reverses a word\"\n");
        System.out.println("\n\"Enter a string\"\n");
        String reverse = input.next();
        System.out.println(reverseString(reverse));
        break;
      case 5: 
        int big1, big2, big3;
        System.out.println("\n\"Given three numbers, returns the largest\"\n");
        System.out.println("\n\"Enter three digits\"\n");
        big1 = input.nextInt();
        big2 = input.nextInt();
        big3 = input.nextInt();
        System.out.println(max3(big1, big2, big3));
        break;    
      default: 
        System.out.println("Invalid Choice");
    }   
    System.out.println("End");
    
  }//end of main()
  
  //----- Complete the method stubs here....
  
  /**
   This method takes a string as argument and returns true if the first and the last characters are same else false
   @param s The string to be tested
   @return The boolean result
   */
  public static boolean sameFirstLast(String s) {
    // Figure out the answer
    if (s.charAt(0) == (s.charAt(s.length() - 1))) {
      return true;
    } else {
      return false;
    }
  }
  
  
  /**
   This method accepts two one-digit integer numbers passed in as arguments and returns a one-digit sum 
   @param num1 One-digit positive integer 
   @param num2 One-digit positive integer
   @return The one-digit sum
   */
  public static int twoDigitNumber(int num1, int num2) {
    int firstAnswer = num1 + num2;
    if(firstAnswer < 10) {
      return firstAnswer;
    } else {
      return (firstAnswer % 10) + 1;
    }
  }
  
  /**
   This method accepts a three-digit integer passed in as argument and returns true if the first digit is greater
   than the last digit otherwise false 
   @param num Three-digit positive integer 
   @return The boolean answer
   */
  public static boolean big2Digits(int num) {
    if ((num / 100) > (num % 10)) {
      return true;
    } else {
      return false;
    }
  }
  
  /**
   This method accepts a three-lettered string as argument and returns the reversed one
   @param str Three-lettered string 
   @return The reversed string
   */
  public static String reverseString(String str) {
    String reverse = "";
    for(int i = str.length() - 1; i >= 0; i--)
    {
      reverse = reverse + str.charAt(i);
    }
    return reverse;
  }
  
  /**
   This method accepts three integer numbers passed in as arguments and returns the largest number
   @param num1 The integer number
   @param num2 The integer number
   @param num3 The integer number
   @return The largest number
   */
  public static int max3(int num1, int num2, int num3) {
    int max = num1;
    if(max < num2){ max = num2; }
    if(max < num3){ max = num3; }
    return max;
  }
}