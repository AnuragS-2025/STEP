import java.util.Scanner;
class DivisibleByFive {
  public static void main(String a[]) {
      // Create a Scanner object to read input
      Scanner in = new Scanner(System.in);
      // Input: Get the number from the user
      System.out.print("Enter a number: ");
      int number = in.nextInt();
      // Check if the number is divisible by 5
      String result = (number % 5 == 0) ? "Yes" : "No";
      // Output the result
      System.out.println("Is the number " + number + " divisible by 5? " + result);
    }
}