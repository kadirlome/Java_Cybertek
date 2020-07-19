package Day_26_Arrays_part3;

import java.util.*;

public class MethodArray2 {

	public static void main(String[] args) {
		
		
		System.out.println(findCar(4,"Honda"));
		
	}
	
	public static String[] createArray(int arraySize) {
		Scanner scan=new Scanner(System.in);
		
		String[] carArray=new String[arraySize];
		
		for(int i=0;i<carArray.length;i++) {
			System.out.println("Enter your car #"+ (i+1)+":");
			carArray[i]=scan.next();
		
		}
		return carArray;	
	}
	public static boolean findCar(int value,String toFindCar) {
		
		for(String car :createArray(value)) {
			
			if(car.equalsIgnoreCase(toFindCar)) {
				return true;
			}		
		}
		return false;
	}
}
