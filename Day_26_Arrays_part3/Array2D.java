package Day_26_Arrays_part3;

public class Array2D {

	public static void main(String[] args) {
		
		int[] []scores = new int[3][4];  // row soldan sağa collum yukarıdan aşağıya 
		
		System.out.println(scores);
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		
		
		
		//Print first row
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println(scores[0][3]);
		
		System.out.println("------------------------------------------");
		
		//Print second row
		System.out.println(scores[1][0]);
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
		System.out.println(scores[1][3]);
		
		
		
		System.out.println("------------------------------------------");
		
		//Print third row
		System.out.println(scores[2][0]);
		System.out.println(scores[2][1]);
		System.out.println(scores[2][2]);
		System.out.println(scores[2][3]);
		
		
		
		System.out.println("****************************************************************************");
		
		
		scores[0][0]=10;
		scores[0][1]=25;
		scores[0][2]=50;
		scores[0][3]=30;
		
	System.out.println("------------------------------------------------\n");	
	
		scores[1][0]=80;
		scores[1][1]=100;
		scores[1][2]=60;
		scores[1][3]=40;
		
		//Print first row
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println(scores[0][3]);
		
		System.out.println("------------------------------------------");
		
		//Print second row
		System.out.println(scores[1][0]);
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
		System.out.println(scores[1][3]);
		
		
		
		
	}

}
