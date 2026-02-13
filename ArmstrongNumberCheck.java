import java.util.*;
class ArmstrongNumberChecker {
  public static void main(String a[]) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = in.nextInt();
      int oNumber = number;
      int sum = 0;
      while (oNumber != 0) {
          int remainder = oNumber % 10;
          sum += Math.pow(remainder, 3);
          oNumber /= 10;
      }
      if (sum == number) {
          System.out.println(number + " is an Armstrong number.");
      } else {
          System.out.println(number + " is not an Armstrong number.");
      }
   }
}