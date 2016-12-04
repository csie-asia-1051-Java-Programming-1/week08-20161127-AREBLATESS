package hw;
/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		String str=new StringBuilder(fac(n)).reverse().toString();
		System.out.println(str);
	}
	public static String fac(int a){
		int sum=0;

		if(a==0){
			return "";
		}else{
			sum=a%2;
			return sum+""+fac(a/2);
			
		}
		
	}

}
