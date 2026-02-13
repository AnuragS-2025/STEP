import java.util.*;
class TotalPriceCalculator {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter unit price: ");
      double unitPrice = in.nextDouble();
      System.out.print("Enter quantity: ");
      int quantity = in.nextInt();
      double totalPrice = unitPrice * quantity;
      System.out.println("The total purchase price is INR " + totalPrice +
              " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
