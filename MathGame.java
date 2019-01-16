/* Name: Matthew Blackert
 * Date: October 25th, 2018
 * Filename: MathGame.java
 * Description: This program allows the user to pick two numbers and it gives the count and the max.
 */
import java.util.Scanner; // reads input
public class MathGame {
  // gives the steps and max
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("starting number to test?");
    int testNum = sc.nextInt();
    System.out.print("ending number to test?");
    int endNum = sc.nextInt();
    int j = testNum;
    // tests the values
    for (int i = testNum - 1; i < endNum; i++) { 
      int count = 0;
      testNum = j++;
      int tempStorage = testNum;
      int max = Integer.MIN_VALUE;
      while (testNum != 1) {
        if(testNum % 2 == 0) { 
          testNum = testNum / 2;
          count++;
          if (max < testNum) {max = testNum;}
        } else { 
          testNum = (testNum * 3) + 1;
          count++;
          if (max < testNum) {max = testNum;}
        }
      }
      System.out.println("\n" + tempStorage + ": " + count + " steps, the max was " + max);
    }
  }
}