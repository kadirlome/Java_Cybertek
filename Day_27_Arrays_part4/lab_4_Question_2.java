package Day_27_Arrays_part4;

public class lab_4_Question_2 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3};
		int[] y= {1,2,3,1};
		int[] z= {1,2,1};
		int[] k= {1};
		System.out.println(returntrue(x));
		System.out.println(returntrue(y));
		System.out.println(returntrue(z));
		System.out.println(returntrue(k));
		
	}
	
	public static String returntrue(int[] arr) {
		
		if(arr.length>1) {
			
			if(arr[0]==arr[arr.length-1]) {
				return "true";
			}
			return "false";
		}
	
		return "not valid ana Array";
	}

}
