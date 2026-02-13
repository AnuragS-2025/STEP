import java.util.*;
class OddEven {
  public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = in.nextInt();
      // Check if the number is a natural number
      if (number <= 0) {
          System.out.println("Please enter a natural number.");
      } else {
          // Loop from 1 to the entered number
          for (int i = 1; i <= number; i++) {
              // Check if the number is even or odd
              if (i % 2 == 0) {
                  System.out.println(i + " is even.");
              } else {
                  System.out.println(i + " is odd.");
              }
           }
       }
   }
}