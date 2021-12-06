package functionalproblems;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		sc.close();
		
		Quadratic quadratic = new Quadratic();
		quadratic.roots(a, b, c);
		
	
	}
	
		public void roots (double a, double b, double c) {
			double delta = (b * b) - (4 * a * c);
			double root1 = (-b + Math.sqrt(delta))/(2*a);
			double root2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println(root1);
			System.out.println(root2);
			System.out.println(delta);
		}
	}
