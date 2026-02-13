import java.util.*;
class NumberCheck {
  public static void main(String a[]) {
      Scanner in = new Scanner(System.in);
      int numbers[] = new int[5];
      System.out.println("Enter 5 numbers:");
      for (int i = 0; i < 5; i++) {
          System.out.print("Number " + (i + 1) + ": ");
          numbers[i] = in.nextInt();
      }
      for (int num : numbers) {
          if (num > 0) {
             if (num % 2 == 0) {
                 System.out.println(num + " is positive and even.");
            } else {
                 System.out.println(num + " is positive and odd.");
             }
         } else if (num < 0) {
             System.out.println(num + " is negative.");
         } else {
             System.out.println(num + " is zero.");
         }
     }
        int firstNum = numbers[0];
        int lastNum = numbers[4];
        if (firstNum > lastNum) {
          System.out.println("The first number (" + firstNum + ") is greater than the last number (" + lastNum + ").");
        } else if (firstNum < lastNum) {
            System.out.println("The first number (" + firstNum + ") is less than the last number (" + lastNum + ").");
        } else {
            System.out.println("The first number (" + firstNum + ") is equal to the last number (" + lastNum + ").");
        }
    }
}
