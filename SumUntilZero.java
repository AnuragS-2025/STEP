import java.util.*;
class SumUntilZero {
  public static void main(String a[]) {
      // Create a Scanner object to read input
      Scanner in = new Scanner(System.in);
      // Initialize the total sum to 0.0
      double total = 0.0;
      // Prompt the user to enter a number
      System.out.print("Enter a number (enter 0 to stop): ");
      double number = in.nextDouble();
      // Use a while loop to keep adding numbers until the user enters 0
      while (number != 0) {
          total += number; // Add the entered number to the total
          System.out.print("Enter another number (enter 0 to stop): ");
          number = in.nextDouble(); // Ask the user to input again
      }
      // Display the total sum
      System.out.println("The total sum is: " + total);
      // Close the scanner
      in.close();
    }
}