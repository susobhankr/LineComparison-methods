package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonMethods {
	int x1,y1,x2,y2,a1,b1,a2,b2;
	static Double distance1,distance2;

	public void getLineCompare() {
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
		
		System.out.println("Enter X1 point : ");
		x1=sc.nextInt();
		System.out.println("Enter y1 point : ");
		y1=sc.nextInt();
		System.out.println("Enter x2 point : ");
		x2=sc.nextInt();
		System.out.println("Enter y2 point : ");
		y2=sc.nextInt();

		System.out.println("Enter a1 point : ");
		a1=sc.nextInt();
		System.out.println("Enter b1 point : ");
		b1=sc.nextInt();
		System.out.println("Enter a2 point : ");
		a2=sc.nextInt();
		System.out.println("Enter b2 point : ");
		b2=sc.nextInt();
	}

	public void findingLengthLine() {
		distance1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		distance2 = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));

		System.out.println("Enter the X and Y coordinates :" +distance1);
		System.out.println("Enter the A and B coordinates :" +distance2);

	}

	public static void main(String[] args) {

		LineComparisonMethods line=new LineComparisonMethods();
		line.getLineCompare();
		line.findingLengthLine();


		int length = distance1.compareTo(distance2);
		System.out.println(length);

		if (length > 0 )
			System.out.println("The length of x and y cordinates is greater than A and B coordinates");
		else if(length < 0)
			System.out.println("The length of x and y cordinates is smaller than A and B coordinates");
		else
			System.out.println("Both the coordinates lengths  are equal");


	}

}
