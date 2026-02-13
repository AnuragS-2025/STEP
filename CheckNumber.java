import java.util.*;
class CheckNumber {
  public static void main(String[] args) {
      // Create a Scanner object to read input
      Scanner in = new Scanner(System.in);
      // Input: Get the number from the user
      System.out.print("Enter a number: ");
      int number = in.nextInt();
      // Check if the number is positive, negative, or zero
      if (number > 0) {
          System.out.println("Positive");
      } else if (number < 0) {
          System.out.println("Negative");
      } else {
          System.out.println("Zero");
      }
      // Close the scanner
      in.close();
    }
}