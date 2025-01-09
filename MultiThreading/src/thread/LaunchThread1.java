package thread;

import java.util.Scanner;

/**
 * Single thread Application
 * CPU Time will get wasted
 */
public class LaunchThread1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Application started...");
		
		System.out.println("Banking Activity started....");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter the Acc No.");
		int accNo = sc.nextInt();
		
		System.out.println("Collect your cash...");
		
		System.out.println("Banking Activity Terminated....");

		System.out.println("Printing Activity Started....");
		
		for(int i=0;i<5;i++) {
			System.out.println("* ");
			Thread.sleep(5000);
		}
		
		System.out.println("Printing Activity Terminated....");
		
		System.out.println("Printing Message Activity Started....");
		
		for(int i=0;i<5;i++) {
			System.out.println("Message ");
			Thread.sleep(5000);
		}
		
		System.out.println("Printing Message Activity Terminated....");
	}

}
