package hw;
import java.util.Scanner;
public class hw02_104021125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�ʧO:");
		Scanner scn = new Scanner(System.in);
		char c = scn.nextLine().charAt(0);
		System.out.print("����:");
		int i = scn.nextInt();
		double w;
		if(c=='�k')
			w = (i-80)*0.7;
		else
			w = (i-70)*0.6;
		System.out.print("�z�Q�魫:"+w);

	}

}
