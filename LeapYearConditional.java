import java.util.*;
class LeapYearSingleIf {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a year (>= 1582): ");
      int year = in.nextInt();
      if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
          System.out.println(year + " is a Leap Year.");
      } else {
          System.out.println(year + " is not a Leap Year.");
      }
   }
}