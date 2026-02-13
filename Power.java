import java.util.*;
class Power {
  public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the base number: ");
      int number = in.nextInt();
      System.out.print("Enter the power: ");
      int power = in.nextInt();
      int result = 1;
      // Calculate the power of the number
      for (int i = 1; i <= power; i++) {
          result *= number;
      }
      // Print the result
      System.out.println(number + " raised to the power of " + power + " is: " + result);
   }
}