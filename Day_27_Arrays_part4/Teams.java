package Day_27_Arrays_part4;

public class Teams {

	public static void main(String[] args) {
		
		
		/*// birinci yol 
		String[][] teams=new String[2][4];
		
		
		teams[0][0]="Mike";
		teams[0][1]="Tonny";
		teams[0][2]="Smith";
		teams[0][3]="Evan";
		
		
		teams[1][0]="David";
		teams[1][1]="Ryan";
		teams[1][2]="Emmy";
		teams[1][3]="John";
		*/
		
		// ikinci yol
		String[][] teams= {{"Mike","Tonny","Smith","Evan"}, {"David","Ryan","Emmy","John"}};
		
		
		System.out.print("First player of the firs team :");
		System.out.println(teams[0][0]);
		System.out.print("First player of the second team :");
		System.out.println(teams[1][0]);
		
		System.out.println("Number of rows : "+teams.length);
		System.out.println("# people in first team : "+teams[0].length);
		System.out.println("# people in second team : "+teams[1].length);
		
		
	}

}
