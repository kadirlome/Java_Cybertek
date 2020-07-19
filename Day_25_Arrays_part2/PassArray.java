package Day_25_Arrays_part2;

import java.util.*;

public class PassArray {

	public static void main(String[] args) {
		
		// create an array
		int[] numbers=new int[4];
		
		//pass the array to the get values methods
		getValues(numbers);
		
		System.out.println("Here are the numbers that yıu entered");
		
		// pass the aray to showArray method
		
		showArray(numbers);
		//main methodda diğer methodları çağırıyoruz.
		
		
	}
	
	

	public static void getValues(int[] array) {   // Mthodda sayıların girişi için fp kullanıyoruz.
		Scanner scan=new Scanner(System.in);      // 
		
		System.out.println("Enter a series of "+array.length+" numbers");
		
		for(int i=0;i<array.length;i++) {
			System.out.print("Enter number "+(i+1)+" :" );
			array[i]=scan.nextInt();
		}
	}

	
	public static void showArray(int [] array) {
		
		for(int value:array) {         // diğer mehtodda girilen sayıları burda yazdııryoruz........
			System.out.println(value);
		}
		
	}
}
