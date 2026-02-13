import java.util.*;

class EmployeeBonus1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double salaries[] = new double[10];
        int yearsOfService[] = new int[10];
        double bonuses[] = new double[10];
        double newSalaries[] = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.printf("Enter salary and years of service for employee %d: ", i + 1);
                double salary = in.nextDouble();
                int years = in.nextInt();
                if (salary > 0 && years >= 0) {
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    valid = true;
                } else {
                    System.out.println("Invalid input! Salary must be positive and years non-negative.");
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("Results:");
        System.out.printf("Total Bonus Payout: ", totalBonus);
        System.out.printf("Total Old Salary: ", totalOldSalary);
        System.out.printf("Total New Salary: ", totalNewSalary);
        in.close();
    }
}