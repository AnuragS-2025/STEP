import java.util.*;
class BasicCalculator {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter first number: ");
      double number1 = in.nextDouble();
      System.out.print("Enter second number: ");
      double number2 = in.nextDouble();
      double sum = number1 + number2;
      double difference = number1 - number2;
      double product = number1 * number2;
      double quotient = number2 != 0 ? number1 / number2 : 0;
      System.out.println("The addition, subtraction, multiplication, and division of " + number1 + " and " + number2 +
                " is " + sum + ", " + difference + ", " + product + ", and " + quotient);
    }
}
