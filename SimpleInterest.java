import java.util.*;
class SimpleInterest {
  public static void main(String a[]) {
      // Create a Scanner object to take input from the user
      Scanner in = new Scanner(System.in);
      // Taking user inputs for Principal, Rate, and Time
      System.out.print("Enter the Principal amount: ");
      double principal = in.nextDouble();
      System.out.print("Enter the Rate of Interest (in %): ");
      double rate = in.nextDouble();
      System.out.print("Enter the Time (in years): ");
      double time = in.nextDouble();
      // Calculating Simple Interest
      double simpleInterest = (principal * rate * time) / 100;
      // Displaying the result
      System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%%, and Time %.2f years.\n",
                        simpleInterest, principal, rate, time);
      // Close the Scanner object to avoid resource leak
      in.close();
  }
}