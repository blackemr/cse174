/* Name: Matthew Blackert
 * Professor: Dr. Viji
 * Filename: Lab12.java
 * Description: User enters a key to search and program uses binary and linear algorithms.
 */
import java.util.Scanner;
public class Lab12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] searchArray = new int[11];
    System.out.print("Enter 11 elements");
    for (int i = 0; i < 11; i++) {
      searchArray[i] = sc.nextInt();
    }
    System.out.print("\nEnter the key:");
    int key = sc.nextInt();
    // Linear Search Algorithm
    System.out.print("\n***1. Linear Search");
    int keyFind = linearSearch(searchArray, key);
    if (keyFind != -1) {
      System.out.print("\n" + key + " is present in index " + keyFind);
    } else {
      System.out.print("\n" + key + " is not present");
    }
    // Binary Search Algorithm
    System.out.print("\n\n**2. Binary Search");
    int binaryFind = binarySearch(searchArray, key);
    if (keyFind != -1) {
      System.out.print("\n" + key + " is present in index " + binaryFind);
    } else {
      System.out.print("\n" + key + " is not present");
    }
  }
  // Uses a linear search
  public static int linearSearch(int[] searchArray, int key) {
    int counter = 0;
    for (int i = 0; i < searchArray.length; i++) {
      if (searchArray[i] == key) {
        System.out.print("\nnumber of peeks = " + counter);
        return i;
      }
      counter++;
    }
    return -1;
  }
  // binary search
  public static int binarySearch(int[] searchArray, int key) {
    int counter = 0;
    int low = 0;
    int high = searchArray.length-1;
    int mid;
    while (high >= low) {
      counter++;
      mid = ((low + high) / 2);
      if (searchArray[mid] == key) { System.out.print("\nnumber of peeks = " + counter);return mid;}
      if (key > searchArray[mid]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
}