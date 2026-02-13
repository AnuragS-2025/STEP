import java.util.*;
class TriangleArea {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter base of the triangle in inches: ");
      double base = in.nextDouble();
      System.out.print("Enter height of the triangle in inches: ");
      double height = in.nextDouble();
      double area1 = 0.5 * base * height;
      double area2 = area1 * 6.452;
      System.out.println("The area of the triangle in square inches is: " + area1);
      System.out.println("The area of the triangle in square centimeters is: " + area2);
    }
}
