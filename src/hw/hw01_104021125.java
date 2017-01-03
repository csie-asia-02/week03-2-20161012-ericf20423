package hw;
import java.util.Scanner;
public class hw01_104021125 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("talk time:");
		int min = scn.nextInt();
		double m = 0;
		if(min<600)
			m = min*0.5;
		else if(min>=600&&min<=1200)
			m = (min*0.5)*0.9;
		else if(min>1200)
			m = (min*0.5)*0.79;
		System.out.print("cost:"+m);

	}

}
