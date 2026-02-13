import java.util.*;
class SwapNumbers {
  public static void main(String[] args) {
      // Create a Scanner object to take input from the user
      Scanner in = new Scanner(System.in);
      // Prompt the user to enter the first number
      System.out.print("Enter the first number: ");
      int number1 = in.nextInt();
      // Prompt the user to enter the second number
      System.out.print("Enter the second number: ");
      int number2 = in.nextInt();
      // Swapping the numbers
      int temp = number1;
      number1 = number2;
      number2 = temp;
      // Displaying the swapped numbers
      System.out.println("The swapped numbers are " + number1 + " and " + number2 + ".");
      // Close the Scanner object to avoid resource leak
	  in.close();
  }
}