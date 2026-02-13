import java.util.*;
class TotalIncome {
  public static void main(String[] args) {
      // Create a Scanner object to take input from the user
      Scanner in = new Scanner(System.in);
      // Prompt the user to enter salary
      System.out.print("Enter the salary (INR): ");
      double salary = in.nextDouble();
      // Prompt the user to enter bonus
      System.out.print("Enter the bonus (INR): ");
      double bonus = in.nextDouble();
      // Calculate the total income
      double totalIncome = salary + bonus;
      // Display the result
      System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + totalIncome + ".");
      // Close the Scanner object to avoid resource leak
      in.close();
   }
}