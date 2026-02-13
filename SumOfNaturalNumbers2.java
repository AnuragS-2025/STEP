import java.util.*;
class SumOfNaturalNumbers2 {
  public static void main(String a[]) {
      // Create a Scanner object to read input
      Scanner in = new Scanner(System.in);
      // Input: Get the number from the user
      System.out.print("Enter a natural number (n): ");
      int n = in.nextInt();
      // Check if the number is a natural number (positive integer)
      if (n < 1) {
          System.out.println("Please enter a natural number (positive integer).");
      } else {
          // Compute the sum using the formula
          int sumFormula = n * (n + 1) / 2;
          // Compute the sum using a for loop
          int sumFor = 0;
          for (int i = 1; i <= n; i++) {
              sumFor += i; // Add the current value of i to the sum
          }
          // Compare the results and display them
          System.out.println("Sum using formula: " + sumFormula);
          System.out.println("Sum using for loop: " + sumFor);
          if (sumFormula == sumFor) {
              System.out.println("Both results are correct and match!");
          } else {
              System.out.println("Results do not match. There is an error in computation.");
          }
      }
      // Close the scanner
      in.close();
    }
}