package hw;
import java.util.Scanner;
public class hw01_1040210XX {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("通話時間(分):");
		int min = scn.nextInt();
		double m = 0;
		if(min<600)
			m = min*0.5;
		else if(min>=600&&min<=1200)
			m = (min*0.5)*0.9;
		else if(min>1200)
			m = (min*0.5)*0.79;
		System.out.print("通話費用:"+m);

	}

}
