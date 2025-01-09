package thread;

/**
 * Thread is a Light weight process that will perform the line of execution of
 * the program
 * 
 * We can have multiple threads running at the same time that is called as
 * Multithreading
 * 
 * Main is the default thread that has been created and used in the stack frame.
 * This main thread will perform all the execution of the code
 */
public class LaunchThread {

	public static void main(String[] args) {

		/**
		 * We can able to make a Thread sleep for some time.
		 * Every thread will have its own name and its own priority
		 * We can able to set the name and priority
		 * 
		 * main thread name and priority can be changed
		 */
		System.out.println("Application started...");
		Thread thread1 = Thread.currentThread();
//		String thread = thread1.getName();
//		int p = thread1.getPriority();
//		System.out.println(thread);
//		System.out.println(p);
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			System.out.println("Exception ouccured");
		}
		
		thread1.setName("MainThread");
		thread1.setPriority(10);
		String thread = thread1.getName();
		int p = thread1.getPriority();
		System.out.println(thread);
		System.out.println(p);

		System.out.println("Application Terminated...");
	}

}
