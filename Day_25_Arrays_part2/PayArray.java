package Day_25_Arrays_part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {


		final int employees=5;
		double payRate;
		double grossPay;
		
		//create a scanner object for input
		Scanner scan=new Scanner(System.in);
		
		
		//Create any array to hold employee hours
		int[] hours=new int[employees];
		
		//Get the hours worked by each employee
		
		System.out.println("Enter the hours worked by "+employees+"employees who all earn the same hourly wage");
		for(int i=0;i<employees;i++) {
			hours[i]=scan.nextInt();
		}
		
		//Get the hourly paye rate
		System.out.print("Enter the hourly rate for each employee: ");
		payRate=scan.nextDouble();
		
		
		//Display each employee's gross pay
		for(int i=0;i<employees;i++) {
			grossPay=hours[i]*payRate;
			System.out.println("Employee #"+(i+1)+": $ "+grossPay);;
		}
	}

}
