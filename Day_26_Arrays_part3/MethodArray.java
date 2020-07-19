package Day_26_Arrays_part3;

import java.util.*;

public class MethodArray {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
 //     System.out.print("Enter the number : ");
 //		printArray(scan.nextInt());
		printArray(4);   // 1- burda value girdiğimiz zaman compiler aşağıya printArray methoduna gidiyor
		
		
		
	}
	
	public static int[] createArray(int arraySize) {
		Random rn=new Random();
		
		int[] myArray=new int[arraySize];
		for( int i=0;i<myArray.length;i++) {
			myArray[i]=rn.nextInt(100);
			
		}
		return myArray;
		
	}
	
	public static void printArray(int number) {
		
		// 2- yukarıda girilen value burdak, number yerine işleme geçiyOR bu yüzden createArray 
		for(int value:createArray(number)) { // methoduna gidiyor.arraysize a number geldği için işlemi 
			System.out.println(value);       // yani for döngüsünü orda yapıyor...
		}
		
		
	}

}
