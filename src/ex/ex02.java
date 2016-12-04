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
		System.out.print("輸入 幾進制");
		int o=scn.nextInt();
		System.out.print("輸入 數字");
		int n=scn.nextInt();
		int sum=0;
		for(int i=1;n>0;i*=o){
			sum=sum+((n%10)*i);
			n=n/10;
		}
		System.out.print("輸入 要轉成幾進制");
		int a=scn.nextInt();
		String str=new StringBuilder(fun(sum,a)).reverse().toString();	
		System.out.print("此數字轉換後為:"+str);
		}
	public static String fun(int sum,int a){
		int b=0;
		String str="";
		while(sum>0){
			b=sum%a;
			str=str+b;
			sum=sum/a;
		}
		return str;


	}
	
  }
