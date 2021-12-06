package functionalproblems;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		double T = sc.nextInt();  // temp in c
		double t = (T * (9/5)) + 32;   //converting to fahrenheit
		
		if(t < 50 && v > 3 && v < 120) {
			WindChill windchill = new WindChill();
			windchill.windspeed(t, v);
			
		} else {
			System.out.println("not a valid");
		}
	}
		public void windspeed(double b, double c) {
			c = Math.pow(c, 0.16);
			double wc = 35.74 + (0.6215*b) + (((0.4275*b) - 35.75)* c);
			System.out.println(wc);
	}
}
