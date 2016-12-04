package hw;
/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一個數字:");
		int o=scn.nextInt();
		String str=fun(o);
		int sum=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='1'){
				sum=sum+1;}
		}
		System.out.println("轉換為二進制有  " + sum + " 個1");
	}
	public static String fun(int n){
		int a=0;
		if(n==0){
			return "";
		}else{
			a=n%2;
			return a+""+fun(n/2);
		
		}
	}

}
