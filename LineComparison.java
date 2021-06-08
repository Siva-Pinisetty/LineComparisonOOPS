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
	 * Calculating length of two lines using the Cartesian formula and comparing equality
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
		System.out.println("enter the a1 value for Line2:");
		int a1=scanner.nextInt();
		System.out.println("enter the b1 value for Line2:");
		int b1=scanner.nextInt();
		System.out.println("enter the a2 value for Line2:");
		int a2=scanner.nextInt();
		System.out.println("enter the b2 value for Line2:");
		int b2=scanner.nextInt();
		float length1=(float) Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
		System.out.println("Length of LINE1 b/n points "+"("+x1+","+y1+") & "+"("+x2+","+y2+") "+"is "+length1);
		float length2=(float) Math.sqrt(Math.pow(a2-a1,2)+ Math.pow(b2-b1,2));
		System.out.println("Length of LINE2 b/n points "+"("+a1+","+b1+") & "+"("+a2+","+b2+") "+"is "+length2);
		int val = Float.compare(length1, length2);
	    //System.out.println(val);
		if(val == 0)
	    {
	    	System.out.println("Both Line1 and Line2 are equal");
	    }
	    else
	    {
	    	System.out.println("Both Line1 and Line2 are not equal");
	    }
	}
}
