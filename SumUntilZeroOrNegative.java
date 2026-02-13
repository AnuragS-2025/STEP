import java.util.*;
class SumUntilZeroOrNegative {
  public static void main(String[] args) {
      // Create a Scanner object to read input
      Scanner in = new Scanner(System.in);
      // Initialize the total sum to 0.0
      double total = 0.0;
      // Use an infinite while loop
      while (true) {
          // Prompt the user to enter a number
          System.out.print("Enter a number (enter 0 or a negative number to stop): ");
          double number = in.nextDouble();
          // Check if the user entered 0 or a negative number
          if (number <= 0) {
              break; // Exit the loop
          }
          // Add the entered number to the total
          total += number;
      }
      // Display the total sum
      System.out.println("The total sum is: " + total);
      // Close the scanner
      in.close();
    }
}