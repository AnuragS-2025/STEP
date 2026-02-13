import java.util.*;
class SpringSeason {
  public static void main(String a[]) {
      // Create a Scanner object to read input
      Scanner in = new Scanner(System.in);
      // Input: Get the month and day from the user
      System.out.print("Enter the month (1-12): ");
      int month = in.nextInt();
      System.out.print("Enter the day (1-31): ");
      int day = in.nextInt();
      // Check if the date falls within the spring season
      if ((month == 3 && day >= 20) || // March 20 to March 31
         (month == 4) ||              // Entire April
         (month == 5) ||              // Entire May
         (month == 6 && day <= 20)) { // June 1 to June 20
         System.out.println("It's a Spring Season");
      } else {
          System.out.println("Not a Spring Season");
      }
      // Close the scanner
      in.close();
    }
}