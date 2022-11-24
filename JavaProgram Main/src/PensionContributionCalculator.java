import java.util.*;

import java.text.*;

public class PensionContributionCalculator {

	public static void main(String[] args) {
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		DecimalFormat frm = new DecimalFormat("#.00");
		Scanner scan = new Scanner(System.in);
		int salary, age;
		int contributableSalary;
		double employeeContribution, employerContribution, totalContribution;
		System.out.print("Enter the montly salary: $");
		salary = scan.nextInt();
		System.out.print("Enter the age: ");
		age = scan.nextInt();
		//contributableSalary = SALARY_CEILING;
		 if (salary >= 6000) {
		 contributableSalary = SALARY_CEILING;
		 } else {
			 contributableSalary=salary;
		 }
			 
		if (age <= 55) {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
			totalContribution = employeeContribution + employerContribution;
			System.out.println("The employee's contribution is: $" + frm.format(employeeContribution));
			System.out.println("The employer's contribution is: $" + frm.format(employerContribution));
			System.out.print("The total contribution is: $" + frm.format(totalContribution));
		} else if (age <= 60) {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
			employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
			totalContribution = employeeContribution + employerContribution;
			System.out.println("The employee's contribution is: $" + frm.format(employeeContribution));
			System.out.println("The employer's contribution is: $" + frm.format(employerContribution));
			System.out.print("The total contribution is: $" + frm.format(totalContribution));
		} else if (age <= 65) {
			employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
			employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
			totalContribution = employeeContribution + employerContribution;
			System.out.println("The employee's contribution is: $" + frm.format(employeeContribution));
			System.out.println("The employer's contribution is: $" + frm.format(employerContribution));
			System.out.print("The total contribution is: $" + frm.format(totalContribution));
		} else {
			employeeContribution = salary * EMPLOYEE_RATE_65_ABOVE;
			employerContribution = salary * EMPLOYER_RATE_65_ABOVE;
			totalContribution = employeeContribution + employerContribution;
			System.out.println("The employee's contribution is: $" + frm.format(employeeContribution));
			System.out.println("The employer's contribution is: $" + frm.format(employerContribution));
			System.out.print("The total contribution is: $" + frm.format(totalContribution));
		}
	}

}
