package Day_27_Arrays_part4;

public class Task_95 {

	public static void main(String[] args) {
		int sum=0;
		
		int [][] scores= {{68,75,54,80},{100,64,20,50},{10,35,40,90}};
		
		for(int column=0;column<scores[0].length;column++) { 
			                                   // sadece birinci columndaki dataların toplamını yazdırmak için
			sum+=scores[0][column];
	
		}
		System.out.println(sum/scores[0].length);
		
		
		
		int total=0;
		for(int row=0;row<scores.length;row++) {  // sadece birinci rowdaki data ların toplamını yazdırmak için
			
			total+=scores[row][0];
		}
		System.out.println(total);
	}

}
