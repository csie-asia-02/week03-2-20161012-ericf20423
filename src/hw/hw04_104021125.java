package hw;
import java.util.Scanner;
public class hw04_104021125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Integer n:");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum =0;
		for(int i = 1;i<=n;i++)
			sum = i*(i+1)+sum;
		System.out.println("sum = "+sum);

	}

}
