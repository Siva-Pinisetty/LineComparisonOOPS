package com.bridzlab.linecomparisonoops;
import java.util.*;

public class LineComparison {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		LineComparison lineComparisonObj = new LineComparison();
		lineComparisonObj.welcomeDisplay();
		LineComparison Line1Obj = new LineComparison();
		float length1= lineComparisonObj.lengthOfLine("Line1",3,4,2,6);
		LineComparison Line2Obj = new LineComparison();
		float length2= lineComparisonObj.lengthOfLine("Line2",9,5,3,7);
		lineComparisonObj.lineComparison(length1, length2);
	}
	
	/**
	 * Displaying Welcome Message.
	 */
	public void welcomeDisplay() {
		System.out.println("Welcome to Line Comparison Computation Program\n");
	}
	
	/**
	 * Calculating length of two lines using the Cartesian formula and comparing
	 * @return 
	 */
	public float lengthOfLine(String LINE, int x1, int x2, int y1, int y2) {
		float length=(float) Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
		System.out.println("Length of "+LINE+" b/n points "+"("+x1+","+y1+") & "+"("+x2+","+y2+") "+"is "+length);
		return length;
	}
	
	
	public void lineComparison(float length1, float length2) {
		int val = Float.compare(length1, length2);
	    //System.out.println(val);
		if(val == 0)
	    {
	    	System.out.println("Both Line1 and Line2 are equal");
	    }
	    else if(val > 0)
	    {
	    	System.out.println("Length of Line1 is greater then Line2");
	    }
	    else
	    {
	    	System.out.println("Length of Line1 is lesser then Line2");
	    }
	}
}
