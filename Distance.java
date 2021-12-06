package functionalproblems;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		
	System.out.println("enter two number :");
	Scanner sc = new Scanner(System.in);
	double x = sc.nextInt();
	double y = sc.nextInt();
	
	Distance distance = new Distance();
	distance.euclideanDistance(x, y);
//	System.out.println(distance.euclideanDistance.distance);
	
}
	public  void euclideanDistance (double val1, double val2) {
	double distance = Math.sqrt((Math.pow(val1, val1) + Math.pow(val2, val2)));
	double x = Math.pow(val2, val2);
	System.out.println(distance);
	System.out.println(x);
	}
}
