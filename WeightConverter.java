import java.util.*;
class WeightConverter {
  public static void main(String[] args) {
      // Create a Scanner object to take input from the user
      Scanner in = new Scanner(System.in);
      // Taking user input for weight in pounds
      System.out.print("Enter the weight in pounds: ");
      double weightInPounds = in.nextDouble();
      // Converting weight to kilograms
      double weightInKilograms = weightInPounds * 0.453592;
      // Displaying the result
      System.out.printf("The weight of the person in pounds is %.2f and in kilograms is %.2f.\n",
                        weightInPounds, weightInKilograms);
      // Close the Scanner object to avoid resource leak
      in.close();
  }
}