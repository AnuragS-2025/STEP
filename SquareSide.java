import java.util.*;
class SquareSide {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter perimeter of the square: ");
      double perimeter = in.nextDouble();
      double side = perimeter / 4;
      System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
