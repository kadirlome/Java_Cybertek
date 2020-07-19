package Day_26_Arrays_part3;

public class Task_93 {

	public static void main(String[] args) {
		
		String str="With this tool, you can split text into pieces. "
				+ "You can do it in three ways. The first is to write"
				+ " a character (or several characters) that will be "
				+ "used for separating the text into chunks. The second "
				+ "way is to use a regular expression. The third way is "
				+ "to specify the width of output fragments. In this case"
				+ " ext is split into parts of constant length. For all "
				+ "cases, you can also set the character that will be placed"
				+ " between output chunks. Textabulous!";
		
		String [] arr=str.split(" ");
		
		System.out.println(arr.length);
	
		System.out.println(arr[45]);
		System.out.println(arr[50]);
		
	System.out.println("-------------------------------------");
	for(String value:arr) {
		System.out.println(value);
	}
	
	
	}

}
