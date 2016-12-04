package ex;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Method machine=new Method("計算機","001");
		int a=scn.nextInt();
		int b=scn.nextInt();
		char n=scn.next().charAt(0);
		System.out.print("結果為"+machine.compute(a,b,n));
	}
}
//Method 類別
class Method{
//資料成員
	private String name;//名字
	private String id;//編號
//Method 類別的建構元
	public Method(String id1,String name1){
		name=name1;
		id=id1;
	}
//功能
public double compute(float v1,float v2,char art){
	double result=0;
	switch(art){
	case '+':
		result=v1+v2;
		break;
	case '-':
		result=v1-v2;
		break;
	case '*':
		result=v1*v2;
		break;
	case '/':
		result=v1/v2;
		break;
	case '√'://開根號
		result=Math.pow(v1,1/2);
		break;
	case '^'://平方
		result=Math.pow(v1,2);
		break;
	case '³'://立方
		result=Math.pow(v1,3);
		break;
	}
	return result;
	}
}

