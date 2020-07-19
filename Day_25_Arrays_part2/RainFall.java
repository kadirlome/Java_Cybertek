package Day_25_Arrays_part2;

import java.util.Scanner;

public class RainFall {

	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);
	        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	        double[] rainFall=new double[12];
	        
	        System.out.println("Please enter in the following rainfall for the months ahead:");
	        System.out.println("Month    Rainfall (In inches)");
	        
	        for(int i=0;i<months.length;i++) {
	            System.out.print(months[i] + " : ");
	            rainFall[i]=scan.nextDouble();
	            
	        }
	        System.out.println("The sum of all the rain is : " +totalRainfall(rainFall)+ " inches");
	        
	        System.out.println("The average rainfall was : " +averageRainfall(rainFall)+ " inches");
	        
	        System.out.println("The max rain is : " +mostRain(rainFall)+ " inches");
	        
	        System.out.println("The min rain is : " +leastRain(rainFall)+ " inches");
	    }
	    
	    public static double totalRainfall(double[] userInput) {
	        double sum=0;
	        for(int i=0;i<userInput.length;i++) {
	            sum=sum + userInput[i];
	        }
	        return sum;
	        
	    }
	    
	    public static double averageRainfall(double[] userInput) {
	        
	        return totalRainfall(userInput)/12;
	    }
	    public static double mostRain(double[] userInput) {
	        double max=0;
	        for(int i=0;i<userInput.length;i++) {
	            if(userInput[i]>max) {
	                max=userInput[i];
	            }
	        }
	        return max;
	    }
	    public static double leastRain(double[] userInput) {
	        double min=averageRainfall(userInput);
	        for(int i=0;i<userInput.length;i++) {
	            if(userInput[i]<=min) {
	                min=userInput[i];
	            }
	        }
	        return min;


	 	
	}

}
