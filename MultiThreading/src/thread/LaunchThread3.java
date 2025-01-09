package thread;

import java.util.Scanner;

/**
 * Another way of creating a Thread is by implementing Runnable interface
 * 
 * It will be with one run method
 */

class Bank1 implements Runnable{
	
	@Override
	public void run() {
		banking();
	}
	public void banking() {
		System.out.println("Banking Activity started....");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter the Acc No.");
		int accNo = sc.nextInt();
		
		System.out.println("Collect your cash...");
		
		System.out.println("Banking Activity Terminated....");
	}
}

class Print1 implements Runnable{
	
	@Override
	public void run() {
		try {
			printing();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void printing() throws InterruptedException {
		System.out.println("Printing Activity Started....");
		
		for(int i=0;i<5;i++) {
			System.out.println("* ");
			Thread.sleep(5000);
		}
		
		System.out.println("Printing Activity Terminated....");
	}
}

class Message1 implements Runnable{
	
	@Override
	public void run() {
		try {
			printMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printMessage() throws InterruptedException {
		System.out.println("Printing Message Activity Started....");
		
		for(int i=0;i<5;i++) {
			System.out.println("Message ");
			Thread.sleep(5000);
		}
		
		System.out.println("Printing Message Activity Terminated....");
	}
}
public class LaunchThread3 {

	public static void main(String[] args) {
		
		Bank1 b = new Bank1();
		Print1 p = new Print1();
		Message1 m = new Message1();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(m);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
