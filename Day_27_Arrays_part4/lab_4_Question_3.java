package Day_27_Arrays_part4;

public class lab_4_Question_3 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3};
		int[] y= {7,3};
		
		int[] x1= {1,2,3};
		int[] y1= {7,3,2};
		
		int[] x2= {1,2,3};
		int[] y2= {1,3};
		
		int[] x3= {1};
		int[] y3= {7,3};
		
		int[] x4= {1,2,3};
		int[] y4= {1};
		
		System.out.println(returntrue(x,y));
		System.out.println(returntrue(x1,y1));
		System.out.println(returntrue(x2,y2));
		System.out.println(returntrue(x3,y3));
		System.out.println(returntrue(x4,y4));
		
		
		
	}
	
	public static String returntrue(int[] arr, int[] arr2) {
		
		if(!(arr.length>1)){
			
		return "Array1 is not valid";	
			
		}
		if(!(arr2.length>1)){
			return "Array2 is not valid";
		}
			
		if(arr[0]==arr2[0] || arr[arr.length-1]==arr2[arr2.length-1]) {
			
			return "true";
		}
		
		
		
		return "false";
		
	}

}
