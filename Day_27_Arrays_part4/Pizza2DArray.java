package Day_27_Arrays_part4;

import java.util.Arrays;

public class Pizza2DArray {

	public static void main(String[] args) {
		
		String[][] pizzas= {
				           {"pinneapple","pepperoni"},
				           {"anchovies","mushroom"},
				           {"4 cheese"},
				           {"Chicken","tomatoes","onioons"},
				           {"green pappers","zuccuni","brocoli","spinach","shrimp"}
				           };
		
		System.out.println(Arrays.toString(pizzas[0])); // string olarak yazdırmak için
		
		for(String[] pizza : pizzas) {
			System.out.print(pizza.length+"-");
			System.out.println(Arrays.toString(pizza));
		}
		
		System.out.println("--------------------------------------------\n");
		
		for(int i=0;i<pizzas.length;i++) {
			System.out.println(pizzas[i].length);
		}
		
		
		System.out.println("for each loop ----");
		
		
		
		
		for(String value:pizzas[3]) {
			System.out.println(value  );
		}
		System.out.println("-----------------------------/***************************\n");
		
		int [][] students= {{6,5,4},  // each row is array int[] inside 2d array int[][]
				           {12,5,7},
				           {23,56,12,55,3}};
		
		for(int[] group:students) {
			for(int studentID : group) {
				System.out.println(studentID);
			}
		}
	}

}
