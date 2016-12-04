package ex;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m2 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("輸入幾乘幾的矩陣(1):");
		int n1=scn.nextInt();
		int m1=scn.nextInt();
		int data1[][]=new int[n1][m1];
		
		for(int i=0;i<n1;i++){
			for(int j=0;j<m1;j++){
				data1[i][j]=scn.nextInt();
			}
		}
		System.out.print("輸入幾乘幾的矩陣(2):");
		int n2=scn.nextInt();
		int m2=scn.nextInt();
		int data2[][]=new int[n2][m2];

		
		for(int i=0;i<n2;i++){
			for(int j=0;j<m2;j++){
				data2[i][j]=scn.nextInt();
			}
		}
		if(n1!=m2){
			System.out.print("無法出現方陣");
		}else{
		int data[][]=new int[n1][m2];
				for(int i=0;i<n1;i++){
					for(int j=0;j<m2;j++){
						for(int k=0;k<m1;k++){
							data[i][j]=data[i][j]+data1[i][k]*data2[k][j];
						}
					}
				}
				System.out.println("結果");
				for(int i=0;i<n1;i++){
					for(int j=0;j<m2;j++){
						System.out.print(data[i][j]+"\t");
					}
					System.out.println();
				}
		}
	}

}
