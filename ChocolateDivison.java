import java.util.*;
class ChocolateDivision {
  public static void main(String[] args) {
      // Create a Scanner object to take input from the user
      Scanner in = new Scanner(System.in);
      // Taking user inputs for the number of chocolates and children
      System.out.print("Enter the number of chocolates: ");
      int numberOfChocolates = in.nextInt();
      System.out.print("Enter the number of children: ");
      int numberOfChildren = in.nextInt();
      // Calculating the number of chocolates each child gets
      int chocolatesPerChild = numberOfChocolates / numberOfChildren;
      // Calculating the remaining chocolates
      int remainingChocolates = numberOfChocolates % numberOfChildren;
      // Displaying the results
      System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                         " and the number of remaining chocolates are " + remainingChocolates + ".");
      // Close the Scanner object to avoid resource leak
      in.close();
  }
}