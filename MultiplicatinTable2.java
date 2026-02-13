import java.util.*;
class MultiplicationTable {
  public static void main(String a[]) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number to find its multiplication table: ");
      int number = in.nextInt();
        int multiplicationResult[] = new int[4];
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}
