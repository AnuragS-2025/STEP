import java.util.*;
class Factors {
  public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = in.nextInt();
      // Print all factors of the number
      System.out.println("Factors of " + number + " are:");
      for (int i = 1; i <= number; i++) {
          if (number % i == 0) {
              System.out.println(i);
          }
       }
   }
}