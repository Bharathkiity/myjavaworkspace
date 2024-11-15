/*Develop a Salary Break up Application*/

import java.util.Scanner;          //import Scanner class

public class SalaryBreakUpApplication {

	public static void main(String[] args) {
		
		 // Scanner to take user input
        Scanner sc = new Scanner(System.in);//Take user input from console
 
       
        System.out.println("Enter Employee ID: ");	// Input: Employee details
        int empId = sc.nextInt();
        sc.nextLine(); // Consume the newline character
                                 
        System.out.println("Enter Employee Name: ");   
        String empName = sc.nextLine(); 	           // Consume the newline character
        
        System.out.println("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        
        
        // Calculations based on constraints
        double hra = 0.15 * basicSalary; // HRA is 15% of Basic
        double pf = 0.05 * basicSalary;  // PF is 5% of Basic
        double ta = 0.02 * basicSalary;  // TA is 2% of Basic
        double esi = 0.025 * basicSalary; // ESI is 2.5% of Basic
        double pt = 200d;                 // PT is a fixed amount of 200

        // Gross Pay calculation
        double grossPay = basicSalary + hra + pf + ta + esi + pt;

        // Net Pay calculation (Gross Pay minus PF and PT)
        double netPay = grossPay - pf - pt;
        
        // Output the salary breakup details
        System.out.println("\nSalary Breakup:");
         System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("TA: " + ta);
        System.out.println("ESI: " + esi);
        System.out.println("PT: " + pt);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Net Pay: " + netPay);
        
        // Close the scanner
        sc.close();

	}

}
