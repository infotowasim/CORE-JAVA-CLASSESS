package com.wasim;

//a table which is consist of multiple row and multiple column, means 2D Array.
//u have to put less then value of small value here small value 3 so u can put any value which is less then 3. so it will indicate the lenght of the column or j.
//row , column
//outer loops runs once and inner loop should run all.

public class A {

	public static void main(String[] args) {

//		int[][] x=new int[3][3]; // row , column
//		
//		x[0][0]=10;
//		x[0][1]=20;
//		x[0][2]=30;
//		
//		x[1][0]=40;
//		x[1][1]=50;
//		x[1][2]=60;
//		
//		x[2][0]=70;
//		x[2][1]=80;
//		x[2][2]=90;
//		
//		for (int i = 0; i < x.length; i++) { // outer loops runs once and inner loop should run all.
//			for (int j = 0; j < x[0].length; j++) { // u have to put less then value of small value here small value 3 so u can put any value which is less then 3. so it will indicate the lenght of the column or j.
//				System.out.println(x[i][j]);
//			}
//		}

		int[][] arr = new int[2][4]; // row , column

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 40;

		arr[1][0] = 50;
		arr[1][1] = 60;
		arr[1][2] = 70;
		arr[1][3] = 80;

		for (int i = 0; i < arr.length; i++) { // outer loops runs once and inner loop should run all.
			for (int j = 0; j < arr[0].length; j++) { // u have to put less then value of small value here small value 3
														// so u can put any value which is less then 3. so it will
														// indicate the lenght of the column or j.
				System.out.println(arr[i][j]);
			}
		}

	}
}
