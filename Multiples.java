import java.util.*;
class Multiples {
  public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = in.nextInt();
      // Print multiples of the number below 100
      System.out.println("Multiples of " + number + " below 100 are:");
      for (int i = 100; i >= 1; i--) {
          if (i % number == 0) {
              System.out.println(i);
          }
      }
  }
}