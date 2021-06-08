package com.bridzlab.linecomparisonoops;
import java.util.*;

public class LineComparison {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		LineComparison lineComparisonObj = new LineComparison();
		lineComparisonObj.welcomeDisplay();
		lineComparisonObj.lengthOfLine();
	}
	
	/**
	 * Displaying Welcome Message.
	 */
	public void welcomeDisplay() {
		System.out.println("Welcome to Line Comparison Computation Program\n");
	}
	
	/**
	 * Calculating length of an line using the Cartesian formula.
	 */
	private void lengthOfLine()
	{
		
		System.out.println("enter the x1 value for Line1:");
		int x1=scanner.nextInt();
		System.out.println("enter the y1 value for Line1:");
		int y1=scanner.nextInt();
		System.out.println("enter the x2 value for Line1:");
		int x2=scanner.nextInt();
		System.out.println("enter the y2 value for Line1:");
		int y2=scanner.nextInt();
		float length=(float) Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
		System.out.println("Length of LINE1 b/n points "+"("+x1+","+y1+") & "+"("+x2+","+y2+") "+"is "+length);
	}
}
