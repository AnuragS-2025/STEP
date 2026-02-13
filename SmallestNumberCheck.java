import java.util.*;
class SmallestNumberCheck {
  public static void main(String a[]) {
      // Create a Scanner object to read input
      Scanner in = new Scanner(System.in);
      // Input: Get three numbers from the user
      System.out.print("Enter the first number: ");
      int number1 = in.nextInt();
      System.out.print("Enter the second number: ");
      int number2 = in.nextInt();
      System.out.print("Enter the third number: ");
      int number3 = in.nextInt();
      // Check if the first number is the smallest
      boolean isSmallest = (number1 < number2) && (number1 < number3);
      // Output the result
      System.out.println("Is the first number the smallest? " + isSmallest);
    }
}