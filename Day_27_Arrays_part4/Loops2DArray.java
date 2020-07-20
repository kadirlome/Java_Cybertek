package Day_27_Arrays_part4;

public class Loops2DArray {

	public static void main(String[] args) {
		
		int[][] numbers= {{1,2,4},{8,9,6},{5,2,1}};
		
		for(int row=0;row<numbers.length;row++) {
			for(int columns=0;columns<numbers[row].length;columns++) {
				System.out.println("numbers "+row+" : "+numbers[row][columns]);
			}
		}

		
	}

}
