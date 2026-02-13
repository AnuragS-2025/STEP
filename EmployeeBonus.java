import java.util.*;
class EmployeeBonus {
  public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner in = new Scanner(System.in);
      System.out.print("Enter your salary: ");
      double salary = in.nextDouble();
      System.out.print("Enter years of service: ");
      int years = in.nextInt();
      // Check if the employee is eligible for a bonus
      if (years > 5) {
          double bonus = salary * 0.05; // Calculate 5% bonus
          System.out.println("Your bonus is: " + bonus);
      } else {
          System.out.println("No bonus, years of service is less than or equal to 5.");
      }
   }
}