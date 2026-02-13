import java.util.*;
class TravelDetails {
  public static void main(String a[]) {
      // Create a Scanner object to take input from the user
      Scanner in = new Scanner(System.in);
      // Taking user inputs for journey details
      System.out.print("Enter your name: ");
      String name = in.nextLine();
      System.out.print("Enter the starting city: ");
      String fromCity = in.nextLine();
      System.out.print("Enter the city you're traveling via: ");
      String viaCity = in.nextLine();
      System.out.print("Enter the destination city: ");
      String toCity = in.nextLine();
      // Taking user inputs for distances
      System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in km): ");
      double fromToVia = in.nextDouble();
      System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in km): ");
      double viaToFinalCity = in.nextDouble();
      // Taking user inputs for time taken (in hours and minutes)
      System.out.println("Enter the time taken from " + fromCity + " to " + viaCity + ":");
      System.out.print("Hours: ");
      int timeFromToViaHours = in.nextInt();
      System.out.print("Minutes: ");
      int timeFromToViaMinutes = in.nextInt();
      System.out.println("Enter the time taken from " + viaCity + " to " + toCity + ":");
      System.out.print("Hours: ");
      int timeViaToFinalCityHours = in.nextInt();
      System.out.print("Minutes: ");
      int timeViaToFinalCityMinutes = in.nextInt();
      // Convert time to total hours
      double timeFromToViaTotal = timeFromToViaHours + (timeFromToViaMinutes / 60.0);
      double timeViaToFinalCityTotal = timeViaToFinalCityHours + (timeViaToFinalCityMinutes / 60.0);
      // Calculating total distance and total time
      double totalDistance = fromToVia + viaToFinalCity;
      double totalTime = timeFromToViaTotal + timeViaToFinalCityTotal;
      // Printing the results
      System.out.println("\nJourney Details:");
      System.out.println("Name: " + name);
      System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
      System.out.println("Total Distance: " + totalDistance + " km");
      System.out.printf("Total Time: %.2f hours\n", totalTime);
      // Demonstrating operator precedence
      System.out.print("\nEnter the fee: ");
      double fee = in.nextDouble();
      System.out.print("Enter the discount percentage: ");
      double discountPercent = in.nextDouble();
      // Calculating final fee after discount
      double finalFee = fee - (fee * discountPercent / 100);
      System.out.println("\nDemonstrating Operator Precedence:");
      System.out.println("The results of Int Operations are " + fee + ", " + discountPercent + ", and " + finalFee + ".");
      // Close the Scanner object to avoid resource leak
      in.close();
    }
}