package ex;

import java.util.Scanner;
public class ex04_103021125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入x");
		int v1 = scn.nextInt();
		int y = 0;
		if (v1 < -1) {
			System.out.println("y=" + (3 * Math.pow(v1, 2)));
		} 
		else if (v1 >= -1 && v1 <= 1) {
			System.out.println("y=" + (Math.pow(v1, 3) + 3 * (v1 - 3)));
		} 
		else if (v1 > 1) {
			System.out.println("y=" + (2 * v1 + 3));
		}
	}
}
