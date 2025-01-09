package thread;

class Library implements Runnable{
	
	String res1 = new String("Java");
	String res2 = new String("Spring");
	String res3 = new String("Microservices");
	
	@Override
	synchronized public void run() {
		
		if(Thread.currentThread().getName() == "Student1") {
			try {
				Thread.sleep(3000);
				synchronized(res1) {
					System.out.println("Student1 Acquired The resource " + res1);
					Thread.sleep(3000);
				}synchronized(res2) {
					System.out.println("Student1 Acquired The resource " + res2);
					Thread.sleep(3000);
				}synchronized(res3) {
					System.out.println("Student1 Acquired The resource " + res3);
					Thread.sleep(3000);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			try {
				synchronized(res3) {
					System.out.println("Student2 Acquired The resource " + res3);
					Thread.sleep(3000);
				}synchronized(res2) {
					System.out.println("Student2 Acquired The resource " + res2);
					Thread.sleep(3000);
				}synchronized(res1) {
					System.out.println("Student2 Acquired The resource " + res1);
					Thread.sleep(3000);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
public class LaunchThread5 {

	public static void main(String[] args) {
		
		Library lib = new Library();
		
		Thread t1 = new Thread(lib);
		Thread t2 = new Thread(lib);	
		
		t1.setName("Student1");
		t2.setName("Student2");
		
		t1.start();
		t2.start();
		
		t1.setDaemon(true);
	}

}
