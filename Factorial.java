import java.util.*;
class Factorial {
  public static void main(String a[]) {
      // Create a Scanner object to read input
      Scanner in = new Scanner(System.in);
      // Input: Get the integer from the user
      System.out.print("Enter a positive integer: ");
      int number = in.nextInt();
      // Check if the number is a positive integer
      if (number < 0) {
          System.out.println("Please enter a positive integer.");
      } else {
          // Initialize the factorial variable to 1
          long factorial = 1;
          // Compute the factorial using a while loop
          int i = 1;
          while (i <= number) {
              factorial *= i; // Multiply factorial by the current value of i
              i++; // Increment i
          }
          // Print the factorial
          System.out.println("The factorial of " + number + " is: " + factorial);
      }
      // Close the scanner
      in.close();
    }
}