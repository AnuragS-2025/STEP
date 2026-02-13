import java.util.*;
class GreatestFactor {
  public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = in.nextInt();
      int greatestFactor = 1;
      // Loop from the last but one number to 1
      for (int i = number - 1; i >= 1; i--) {
          // Check if the number is divisible by i
          if (number % i == 0) {
              greatestFactor = i;
              break;
          }
      }
      // Print the greatest factor
      System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);
   }
}