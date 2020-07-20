package Day_27_Arrays_part4;

public class Lenght {

	public static void main(String[] args) {
		int [] [] numbers= { {0,3,2,3,4},             //row 0
				             {7,5,6,8},               //row 1
				             {9,13,18,22,30,50,60}    //row 2
				           };  
		
		//display the number of rows
		System.out.println(numbers.length);  // burası kaç adet rows olduğunun bilgisini bize veriyor
		System.out.println(numbers[0].length); // burası arrays of arrays in  uzunluğuu veriyor
		
		
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println("The numbers of colums in row "+i+" is "+numbers[i].length);
		}
		
		/*
		int[] x= {1,2,3,4,5};
		for(int i=0;i<x.length;i++) {
			System.out.println("x: "+x[i]);
		} */
		
		
		for(int i=0;i<numbers.length;i++) {  
			for(int j=0;j<numbers[i].length;j++)      // row un 0 ıncı colums tan hepsinim teker teker yazdırma
			System.out.println("numbers "+i+" : "+numbers[i][j]);
		}
		
	}

}
