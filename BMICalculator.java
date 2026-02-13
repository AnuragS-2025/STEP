import java.util.*;
class BMICalculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of persons: ");
      int n = input.nextInt();
      double[][] personData = new double[n][3];
      String[] weightStatus = new String[n];
      for (int i = 0; i < n; i++) {
         System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
         double weight = input.nextDouble();
         System.out.print("Enter height (m) for person " + (i+1) + ": ");
         double height = input.nextDouble();         
         if (weight <= 0 || height <= 0) {
            System.out.println("Invalid input. Please enter again.");
            i--;
            continue;
         }         
         personData[i][0] = weight;
         personData[i][1] = height;
         personData[i][2] = weight / (height * height);         
         if (personData[i][2] < 18.5) {
            weightStatus[i] = "Underweight";
         } else if (personData[i][2] < 25) {
            weightStatus[i] = "Normal";
         } else if (personData[i][2] < 30) {
            weightStatus[i] = "Overweight";
         } else {
            weightStatus[i] = "Obese";
         }
      }      
      System.out.println("\nResults:");
      for (int i = 0; i < n; i++) {
         System.out.printf("Person %d - Height: %.2fm, Weight: %.2fkg, BMI: %.2f, Status: %s\n",
               i+1, personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
      }
   }
}