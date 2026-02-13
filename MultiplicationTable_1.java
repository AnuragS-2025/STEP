import java.util.*;
class MultiplicationTable_1 {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = in.nextInt();        
      int[] multiplicationResult = new int[4];   
      System.out.println("Multiplication Table for " + number + " from 6 to 9:");
      for (int i = 6, index = 0; i <= 9; i++, index++) {
          multiplicationResult[index] = number * i;
          System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
      }
   }
}