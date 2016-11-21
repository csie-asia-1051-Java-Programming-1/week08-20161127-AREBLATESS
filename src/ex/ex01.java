package ex;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.print(fun(n));}
	public static int fun(int a){

		int sum = 0;
		int sum2 = 0;
		int x = 1;
		
		while(a>0){
		sum=a%2;
		a=a/2;
		sum2 = sum2+(sum*x);
		x = x*10;
		
		}
		return sum2;
	}
	
	}


