package Day_25_Arrays_part2;
import java.util.*;
public class Task_91 {

	public static void main(String[] args) {
		Random rn=new Random();
		
		int[] num= new int[10];
		for(int i=0;i<num.length;i++) {
			num[i]=rn.nextInt(100);
			System.out.println(num[i]);
		}
	
	}

}
