package functionalproblems;
import java.util.Scanner;

import com.sun.tools.javac.Main;

public class TwoDArray {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int m, n;
		
		m = sc.nextInt();
		n = sc.nextInt();

		TwoDArray twodarray = new TwoDArray();
		twodarray.setArrayVlaues(m, n);
	}
		public void setArrayVlaues(int row, int col) {
			int[][] twodarray = new int[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.println("enter the values for the array :["+i+"][" +j+"]");
					twodarray[i][j] = sc.nextInt();
				}
			}
		}
		
}
