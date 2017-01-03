package hw;
import java.util.*;
public class hw03_104021125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入年分: ");
		Scanner scn = new Scanner(System.in);
		int year = scn.nextInt();
		boolean flag = false;
		if(year%4==0){
			flag = true;
			if (year%100==0){
				flag = false;
				if(year%400==0)
					flag = true;
			}
		}
		
		if(flag)
			System.out.println("閏年");
		else
			System.out.println("非閏年");

	}

}
