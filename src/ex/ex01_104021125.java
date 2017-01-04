package ex;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/12
 * Author: 1040210XX 周永振老師
 */

import java.util.*;
public class ex01_104021125 {
/**
* @param args
*/
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int A=scn.nextInt();
    int sum=0;
    while(A>0){
   
    sum+=A%10;
    A=A/10;
    }
System.out.println(sum);
}
}
