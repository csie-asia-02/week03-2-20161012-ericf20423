package hw;
import java.util.Scanner;
public class hw02_1040210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入性別:");
		Scanner scn = new Scanner(System.in);
		char c = scn.nextLine().charAt(0);
		System.out.print("請輸入身高:");
		int i = scn.nextInt();
		double w;
		if(c=='男')
			w = (i-80)*0.7;
		else
			w = (i-70)*0.6;
		System.out.print("標準體重:"+w);

	}

}
