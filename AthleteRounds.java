import java.util.Scanner;
class AthleteRounds {
  public static void main(String[] args) {
      // Create a Scanner object to take input from the user
      Scanner in = new Scanner(System.in);
      // Taking user inputs for the sides of the triangular park
      System.out.print("Enter the length of side 1 (in meters): ");
      double side1 = in.nextDouble();
      System.out.print("Enter the length of side 2 (in meters): ");
      double side2 = in.nextDouble();
      System.out.print("Enter the length of side 3 (in meters): ");
      double side3 = in.nextDouble();
      // Calculating the perimeter of the triangle
      double perimeter = side1 + side2 + side3;
      // Total distance to run (5 km converted to meters)
      double totalDistance = 5000; // 5 km = 5000 meters
      // Calculating the number of rounds required
      double rounds = totalDistance / perimeter;
      // Printing the result
      System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.\n", rounds);
      // Close the Scanner object to avoid resource leak
      in.close();
    }
}