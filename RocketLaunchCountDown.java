import java.util.*;
class RocketLaunchCountDown {
  public static void main(String a[]) {
      // Create a Scanner object to read input
      Scanner in = new Scanner(System.in);
      // Input: Get the countdown starting number from the user
      System.out.print("Enter the countdown starting number: ");
      int counter = in.nextInt();
      // Validate that the input is a positive number
      if (counter < 1) {
          System.out.println("Please enter a positive number greater than or equal to 1.");
      } else {
          // Perform the countdown using a while loop
          System.out.println("Rocket launch countdown starts now!");
          while (counter >= 1) {
              System.out.println(counter); // Print the current countdown value
              counter--; // Decrement the counter
          }
          System.out.println("Liftoff!");
      }
      // Close the scanner
      in.close();
    }
}