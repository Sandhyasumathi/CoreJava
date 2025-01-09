package array;

import java.util.Scanner;

/**
 * Collection of Homogenous data, index based data strutures
 */
public class Array1 {

	public static void main(String[] args) {
		
		//creation of array
		//1D array
		int[] arr = new int[5];	
////		//adding data
////		arr[0]=1;
////		arr[1]=2;
////		arr[2]=3;
////		arr[3]=4;
////		arr[4]=5;
////		
////		//fetching data
////		System.out.println(arr[4]);
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=0;i<5;i++) {
//			System.out.println("Kindly enter the value for data" + i);
//			arr[i]=sc.nextInt();
//		}
//		
//		for(int i=0;i<5;i++) {
//			System.out.print(arr[i] +" ");
//		}
//		System.out.println(" ");
		
		//Creating a 2D array
		//int[][] marks = new int[3][3];
		
		//Creating a 2D Jagged array
		int[][] marks = new int[3][];
		marks[0] = new int[4];
		marks[1] = new int[3];
		marks[2] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				System.out.println("Kindly enter the value for class " + i + " and students" + j);
				marks[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				System.out.print(marks[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		//enhanced for loop for 2D array
		for(int e[]:marks) {
			for(int e1:e) {
				System.out.print(e1+ " ");
			}
			System.out.println();
		}
		
		//we can also create array when the values are known at the time of array creation
		int []a = new int[] {1,2,3,4}; // The size is not fixed
		int b[] = {3,1,5,1,7,2};
		
		System.out.println(a.getClass().getName()); //The name of the class will be as[I [->ref the dimension && I -> integer
		
	}

}
