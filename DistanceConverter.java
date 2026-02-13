import java.util.*;

class DistanceConverter {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter distance in feet: ");
    double distFeet = in.nextDouble();
    double distYards = distFeet / 3;
    double distMiles = distYards / 1760;
    System.out.println("The distance in yards is: " + distYards);
    System.out.println("The distance in miles is: " + distMiles);
    in.close();
  }
}
