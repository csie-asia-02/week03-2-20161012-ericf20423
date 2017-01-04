import java.util.Scanner;
package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)
 * Date: 2016/10/12
 * Author: 1040210XX 周永振老師
 */

public class ex03_103021125 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("X點:");
		int x  =scn.nextInt();
		System.out.print("Y點:");
		int y  =scn.nextInt();
		if(x<=200&&y<=200)
			System.out.println("在園內");
		else
			System.out.println("在園外");
	}

}
