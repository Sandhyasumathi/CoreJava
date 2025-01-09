package thread;

class Car implements Runnable {

	/**
	 * By using synchronized key word to a method or block we can make the method or
	 * block to be accessed by only one thread at a time
	 */
//	public synchronized void run() {
//		try {
//			System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
//			Thread.sleep(4000);
//			System.out.println(Thread.currentThread().getName() + " reached the car");
//			Thread.sleep(4000);
//			System.out.println(Thread.currentThread().getName() + " started driving the car");
//			Thread.sleep(4000);
//			System.out.println(Thread.currentThread().getName() + " reached home");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * We can add synchronized to a particular block
	 */
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
			Thread.sleep(4000);
			synchronized(this) {
			System.out.println(Thread.currentThread().getName() + " reached the car");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName() + " started driving the car");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName() + " reached home");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class LaunchThread4 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Application started...");

		Car c = new Car();

		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);

		t1.start();
		t2.start();
		t3.start();

		t1.setName("Name1");
		t2.setName("Name2");
		t3.setName("Name3");

		t1.join();
		t2.join();
		t3.join();

		System.out.println("Application Terminated...");

	}

}
