package projectileMotion;

import java.util.Scanner;
import java.util.Arrays;

public class main {
	public static boolean isANumber(String input) {//check if input is numeric
	    if (input == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(input);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	public static void parser() {
		double[] values = new double[4];
		values[0] = Integer.MAX_VALUE;//initial velocity
		values[1] = Integer.MAX_VALUE;//acceleration
		values[2] = Integer.MAX_VALUE;//displacement
		values[3] = Integer.MAX_VALUE;//time
		
		int counter = 0;
		String temp;
		
		String[] inputMessages = new String[4];
		inputMessages[0] = "Input initial Velocity.";
		inputMessages[1] = "Input acceleration.";
		inputMessages[2] = "Input displacement.";
		inputMessages[3] = "Input time.";
		
		Scanner console = new Scanner(System.in);//stores user input
		
		System.out.println("For unknown values, intput x.");
		for(int i = 0; i < 4; i++) {//parse values into arrays
			System.out.println(inputMessages[i]);//input message displayed
			temp = console.nextLine();
			if(temp.equals("q")) {
				System.exit(0);
			}
			else if(isANumber(temp)) {//store valid inputs
				values[i] = Double.parseDouble(temp);
			}
			else if(temp.equals("x") && counter<2){
				counter++;
			}
			else {
				System.out.println("User input cannot be computed.");
				break;
			}
		}
	
	}
	
	public static double missing_initVel(double accel, double deltaX, double time) {
		return 0;
	}
	public static double missing_accel(double accel, double deltaX, double time) {
		return 0;
	}
	public static double missing_deltaX(double accel, double deltaX, double time) {
		return 0;
	}
	public static double missing_time(double accel, double deltaX, double time) {
		return 0;
	}
	
	public static void main(String[] args) {
		while(true) {
			parser();
		}
	}
}


