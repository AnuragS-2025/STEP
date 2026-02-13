import java.util.*;
class VotingEligibility {
  public static void main(String a[]) {
      // Create a Scanner object to read input
      Scanner in = new Scanner(System.in);
      // Input: Get the age from the user
      System.out.print("Enter the person's age: ");
      int age = in.nextInt();
      // Check if the person is eligible to vote
      if (age >= 18) {
          System.out.println("The person's age is " + age + " and can vote.");
      } else {
          System.out.println("The person's age is " + age + " and cannot vote.");
      }
       // Close the scanner
        in.close();
    }
}