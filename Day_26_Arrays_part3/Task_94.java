package Day_26_Arrays_part3;

import java.util.Arrays;

public class Task_94 {

	public static void main(String[] args) {
		
	String info1="This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
	String info2="This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		
	String[] pass1=info1.split("xxx");
	String[] pass2=info2.split("xxx");
	
	System.out.println(Arrays.toString(pass1));
	System.out.println(Arrays.toString(pass2));
	
	
	System.out.println("Please do not share with anyone : "+pass1[1].concat(pass2[1]));
	
	

	}

}
