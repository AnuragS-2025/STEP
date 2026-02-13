import java.util.Scanner;
class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();        
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];        
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");            
            System.out.print("Weight (kg): ");
            double weight = scanner.nextDouble();
            while (weight <= 0) {
                System.out.println("Weight must be positive. Please enter again.");
                System.out.print("Weight (kg): ");
                weight = scanner.nextDouble();
            }
            weights[i] = weight;            
            System.out.print("Height (m): ");
            double height = scanner.nextDouble();
            while (height <= 0) {
                System.out.println("Height must be positive. Please enter again.");
                System.out.print("Height (m): ");
                height = scanner.nextDouble();
            }
            heights[i] = height;
            
            bmis[i] = calculateBMI(weight, height);
            statuses[i] = determineStatus(bmis[i]);
        }        
        System.out.println("\nBMI Results:");
        System.out.println("--------------------------------------------------");
        System.out.println("Person\tWeight (kg)\tHeight (m)\tBMI\tStatus");
        System.out.println("--------------------------------------------------");        
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                i + 1, weights[i], heights[i], bmis[i], statuses[i]);
        }
    }    
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }    
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}