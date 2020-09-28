package projectileMotion;

import java.util.Scanner;

public class main {
	public static void parser(){
		double initVel = Integer.MAX_VALUE;
		double accel = Integer.MAX_VALUE;
		double deltaX = Integer.MAX_VALUE;
		double time = Integer.MAX_VALUE;
		int counter = 0;
		String temp;
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("For unknown values, intput x."+'\n'+"Input initial Velocity.");//initial velocity
		temp = console.nextLine();
		if(!temp.equals("x")) {
			initVel = Double.parseDouble(temp);
		}
		else {
			counter++;
		}
		System.out.print(initVel);
		System.out.println("Input acceleration.");//acceleration
		temp = console.nextLine();
		if(!temp.equals("x")) {
			accel = Double.parseDouble(temp);
		}
		else {
			counter++;
		}
		System.out.println("Input displacement.");//displacement
		temp = console.nextLine();
		if(!temp.equals("x")) {
			deltaX = Double.parseDouble(temp);
		}
		else {
			counter++;
		}
		System.out.println("Input time.");//time
		temp = console.nextLine();
		if(!temp.equals("x")) {
			time = Double.parseDouble(temp);
		}
		else {
			counter++;
		}
		
		if(counter >= 2) {
			System.out.println("Cannot solve, too many missing variables.");//error case
		}
		else {
			
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
		parser();
		
	}
}


