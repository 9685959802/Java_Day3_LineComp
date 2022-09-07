package Brigdelabz.java.linecomp;

import java.util.Scanner;

public class LineCmp {
	 //Master Branch
	public static void main(String []args, String length1, String length2) {
	System.out.println("Welcome to Line Comparison Computation Program");
	//UC1-model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system, So that I can calculate its length.
    int x1, x2, y1, y2;
    double length;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the end points of line ");
    
    //Enter end points of line 1

	System.out.println("Enter x1 : ");
	x1 = sc.nextInt();
	System.out.println("Enter y1 : ");
	y1 = sc.nextInt();
	
	//Enter end points of line 2
	
	System.out.println("Enter x2 : ");
	x2 = sc.nextInt();
	System.out.println("Enter y2 : ");
	y2 = sc.nextInt();
	length = Math.sqrt((Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)));
	System.out.println("Length of the Line is : " + length);
	
	//UC2-check equality of two lines based on the end points, whether two lines are the equal or not
	Double line1 = new Double(length1);
	Double line2 = new Double(length2);
	if (line1.equals(line2))
        System.out.println("Line 1 and line 2 have Equal lengths.");
    else
        System.out.println("Line 1 and Line 2 do not have Equal lengths.");
	}
}

    

	