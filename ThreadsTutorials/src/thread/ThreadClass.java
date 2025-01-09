package thread;

class Alpha extends Thread{
	
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println("Thread name : " + Thread.currentThread().getName() + " count :" + i);
		}
	}
}

class Beta implements Runnable{
	
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println("Thread name : " + Thread.currentThread().getName() + " count :" + i);
		}
	}
}
public class ThreadClass {

	public static void main(String[] args) {

		Alpha a = new Alpha();
		a.setName("Alpha");
		Thread t1 = new Thread(new Beta());
		t1.setName("Beta");
		try {
			t1.sleep(5000);	
		}catch(InterruptedException e) {
			
		}
		
		a.start();
	    t1.start();
	}

}
