import java.util.*;
class Friends {
  public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner in = new Scanner(System.in);
      // Input ages and heights of friends
      System.out.print("Enter Amar's age: ");
      int amarAge = in.nextInt();
      System.out.print("Enter Amar's height: ");
      double amarHeight = in.nextDouble();
      System.out.print("Enter Akbar's age: ");
      int akbarAge = in.nextInt();
      System.out.print("Enter Akbar's height: ");
      double akbarHeight = in.nextDouble();
      System.out.print("Enter Anthony's age: ");
      int anthonyAge = in.nextInt();
      System.out.print("Enter Anthony's height: ");
      double anthonyHeight = in.nextDouble();
      // Find the youngest friend
      int youngest = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
      System.out.println("Youngest friend is " + youngest + " years old.");
      // Find the tallest friend
      double tallest = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
      System.out.println("Tallest friend is " + tallest + " units tall.");
    }
}