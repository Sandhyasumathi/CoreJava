package thread;

import java.util.Scanner;

/**
 * One way of creating Thread
 * By Extending the Thread Class we can able to make the class as Thread
 * 
 * We have to give all our work to the run method (overridden method). 
 */
class Bank extends Thread{
	
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

class Print extends Thread{
	
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

class Message extends Thread{
	
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
public class LaunchThread2 {

	public static void main(String[] args) throws InterruptedException {
		

		System.out.println("Application Started...");
		
		/**
		 * To give life to our thread we need to invoke Start method
		 * All the below will start working concurrently
		 */
		Bank b = new Bank();
		Print p = new Print();
		Message m = new Message();
		
		b.start();
		p.start();
		m.start();
		
		/**
		 * To check whether the thread is alive or not
		 */
		System.out.println(b.isAlive());
	    /**
	     * Main thread will wait for the threads which invoked Join method to get completed 
	     */
		b.join();
		p.join();
		m.join();
		
		System.out.println("Application Terminated...");
	}

}
