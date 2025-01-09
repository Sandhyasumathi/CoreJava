package exception;

import java.util.Scanner;


/**
 * to create a custom exception need to extend any of the Exception class and create an instance of it in exception block
 */

class InvalidInputException extends Exception{
	
	public InvalidInputException(String msg){
		super(msg);
	}
	
}

class Atm{
	
	private int accNo=1234;
	private int password=2525;
	
	int eAccNo;
	int ePassword;
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account no: ");
		eAccNo = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the password: ");
		ePassword = sc1.nextInt();
	}
	
	public void verify() throws InvalidInputException {
		if(accNo==eAccNo && password==ePassword) {
			System.out.println("Can Withraw the amount...");
		}else {
			System.out.println("Please enter the correct creds...");
			InvalidInputException in = new InvalidInputException("Invalid Creds...");
			System.out.println(in.getMessage());
			throw in;
		}
	}
}

class Bank{
	

	public void initiate() {
		Atm a = new Atm();
		
		a.input();
		try {
			a.verify();
		} catch (InvalidInputException e) {
			System.out.println("Enter creds");
			
			a.input();
			try {
				a.verify();
			} catch(InvalidInputException e1) {
				System.out.println("Enter correct creds");
			}
		}
	}
}

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.initiate();
	}

}
