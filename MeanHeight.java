import java.util.*;
class MeanHeight {
  public static void main(String a[]) {
      Scanner in = new Scanner(System.in);
      double heights[] = new double[11];
      System.out.println("Enter heights of 11 players:");
      double sum = 0;    
      for (int i = 0; i < 11; i++) {
          System.out.print("Player " + (i+1) + " height: ");
          heights[i] = in.nextDouble();
          sum += heights[i];
      }        
      double mean = sum / 11;
      System.out.println("Mean height of the team: " + mean);
   }
}