package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("輸入 數字,幾進制");
		int n=scn.nextInt();
		int m=scn.nextInt();
		System.out.print(fun(n,m));}
	public static int fun(int a,int m){

		int sum = 0;
		int sum2 = 0;
		int x = 1;
		
		while(a>0){
		sum=a%m;
		a=a/m;
		sum2 = sum2+(sum*x);
		x = x*10;
		
		}
		return sum2;
	}
	
	}
