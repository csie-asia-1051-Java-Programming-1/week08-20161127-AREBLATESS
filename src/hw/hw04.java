package hw;

/*
 * Topic: 請寫以類別方式寫一個程式可顯示四位數字的 LED 燈一組，可根據輸入的四位數字顯示數字。比如說， 由鍵盤輸入 1234 ，則可在螢幕上顯示如圖
 * Date: 2016/11/21
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Number num=new Number();
		char ans[][]=new char[5][23];
		System.out.print("輸入4個數字");
		int n=scn.nextInt();
		int a=1000;
		if(n<10000 && n>0){
			for(int i=0;i<4;i++){
				char data[][]=num.number(n/a);
				n=n%a;
				a=a/10;
				for(int j=0;j<5;j++){
					for(int s=0;s<5;s++){
						ans[j][s+(i*6)]=data[j][s];
					}
				}
			}
		}else{
			System.out.print("非4位數字 錯誤");
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<23;j++){
				System.out.print(ans[i][j]);
			}System.out.println();
		}
	}

}
class Number{
	public char[][] number(int n){
		switch(n){
		case 1:
				char data1[][]={{' ',' ',' ',' ','*'},
								{' ',' ',' ',' ','*'},
								{' ',' ',' ',' ','*'},
								{' ',' ',' ',' ','*'},
								{' ',' ',' ',' ','*'}};
				return data1;
		case 2:
			char data2[][] = {{'*','*','*','*','*'},
			  		  		  {' ',' ',' ',' ','*'},
			  		  		  {'*','*','*','*','*'},
			  		  		  {'*',' ',' ',' ',' '},
			  		  		  {'*','*','*','*','*'}};
			return data2;
		case 3:
			char data3[][] = {{'*','*','*','*','*'},
	  		  		  		  {' ',' ',' ',' ','*'},
	  		  		  		  {'*','*','*','*','*'},
	  		  		  		  {' ',' ',' ',' ','*'},
	  		  		  		  {'*','*','*','*','*'}};
			return data3;
		case 4:
			char data4[][] = {{'*',' ',' ',' ','*'},
	  		  		  		  {'*',' ',' ',' ','*'},
			  		  		  {'*','*','*','*','*'},
			  		  		  {' ',' ',' ',' ','*'},
			  		  		  {' ',' ',' ',' ','*'}};
			return data4;
		case 5:
			char data5[][] = {{'*','*','*','*','*'},
			  		  		  {'*',' ',' ',' ',' '},
			  		  		  {'*','*','*','*','*'},
			  		  		  {' ',' ',' ',' ','*'},
			  		  		  {'*','*','*','*','*'}};
			return data5;
		case 6:
			char data6[][] = {{'*','*','*','*','*'},
			  		  		  {'*',' ',' ',' ',' '},
			  		  		  {'*','*','*','*','*'},
			  		  		  {'*',' ',' ',' ','*'},
			  		  		  {'*','*','*','*','*'}};
			return data6;
		case 7:
			char data7[][] = {{'*','*','*','*','*'},
			  		  		  {'*',' ',' ',' ','*'},
			  		  		  {'*',' ',' ',' ','*'},
			  		  		  {' ',' ',' ',' ','*'},
			  		  		  {' ',' ',' ',' ','*'}};
			return data7;
		case 8:
			char data8[][] = {{'*','*','*','*','*'},
			  		  		  {'*',' ',' ',' ','*'},
			  		  		  {'*','*','*','*','*'},
			  		  		  {'*',' ',' ',' ','*'},
			  		  		  {'*','*','*','*','*'}};
			return data8;
		case 9:
			char data9[][] = {{'*','*','*','*','*'},
			  		  		  {'*',' ',' ',' ','*'},
			  		  		  {'*','*','*','*','*'},
			  		  		  {' ',' ',' ',' ','*'},
			  		  		  {'*','*','*','*','*'}};
			return data9;
		case 0:
			char data0[][] = {{'*','*','*','*','*'},
			  		  		  {'*',' ',' ',' ','*'},
			  		  		  {'*',' ',' ',' ','*'},
			  		  		  {'*',' ',' ',' ','*'},
			  		  		  {'*','*','*','*','*'}};
			return data0;
		}
		return null;
		
		
	}
}