package Day_27_Arrays_part4;

import java.util.*;

public class ArrayClass {

	public static void main(String[] args) {

		
		// toString()
		int[] nums= {43,12,4,1,3,5};
		System.out.println(Arrays.toString(nums));
		
		
		// equals()
		int[] num1= {4,5,6,10,100};
		int[] num2= {4,5,6,10,100};
		System.out.println(Arrays.equals(num1,num2));
		
		//sort() : sorts array in ascending order
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages= {"Zulu","Italiam","spanish","Arabic","1Turkis","@russian"};
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));  // İLK BAŞTA BÜYÜK HARF ve alfabetik sırayı takip ediyor
		
		
		//binarySearch()  : verdğimiz arrays in içinde aradığımız şeyin indexini verir... 
		int[] numX= {4,6,10,7,55};
		System.out.println(Arrays.binarySearch(numX,10));
		System.out.println(Arrays.binarySearch(numX,7));
		System.out.println(Arrays.binarySearch(numX,5)); //-2 verir.(-(insertionPoint)-1).
		                                                 // önce rakamları sırya göre çıkarıp ( 4,6,7 ) gibi
		                                                 // yazdığımız rakam nereye kadar geleibir onu hesaplayıp
	                                                     // oraya kadar - olarak sayıyor..
		
		
		//copyOf()
		double[] d1= {2.3,4.5,12.4};
		double[] d2=d1;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0]=100.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2[1]=400.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		
		double[] d3=Arrays.copyOf(d2, 5);  // beş yaparsak 3 ten fazla olduğu için kendisi oluşturup içine 0 atayacak
		System.out.println(Arrays.toString(d3));
		
		d2[0]=5.2;
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3));
		
		
		// iki önemli şey
		//String : == ve .equals
		//Array : reference equality and copyOf()
	}

}
