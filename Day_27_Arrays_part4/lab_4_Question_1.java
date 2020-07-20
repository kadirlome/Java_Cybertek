package Day_27_Arrays_part4;

public class lab_4_Question_1 {

	public static void main(String[] args) {
		
		
		int[] x= {1,2,6};
		int[] y= {6,1,2,4};
		int[] z= {13,6,1,4,5};
		
		returntrue(x);
		System.out.println(returntrue(x));
		System.out.println(returntrue(y));
		System.out.println(returntrue(z));
		
	}
	public static boolean returntrue(int[] value) {
		
		if(value.length<1) {
			return false;
		}
		if(value[0]==6|| value[value.length-1]==6) {
			
			return true;
		}
		return false;
	}

}
