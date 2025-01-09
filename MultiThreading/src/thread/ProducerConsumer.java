package thread;

class Produce extends Thread 
{

	Queue q;
	int i=1;

	public Produce(Queue q) 
	{
		this.q=q;
	}

	@Override
	public void run() 
	{
		while(true) 
		{
			q.produce(i++);
		}
	}
}

class Consume extends Thread 
{
	Queue q;

	public Consume(Queue q) 
	{
		this.q=q;
	}

	@Override
	public void run() 
	{
		while(true) 
		{
			q.consume();
		}
	}
}

class Queue 
{

	int data;
	boolean flag=false;

	synchronized public void produce(int i) 
	{
		
		try 
		{
			if (flag==true) 
			{
				System.out.println("Producer is waiting...");
				wait();
			} 
			else 
			{
				data = i;
				System.out.println("I Have produced the data " + data);
				flag=true;
				notify();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	synchronized public void consume() 
	{
		try 
		{
			if (flag==false) 
			{
				System.out.println("Consumer is waiting...");
				wait();
			} 
			else 
			{
				System.out.println("I Have Consumed the data " + data);
				flag=false;
				notify();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
}

public class ProducerConsumer 
{

	public static void main(String[] args) 
	{

		Queue q = new Queue();
		Produce p = new Produce(q);
		Consume c = new Consume(q);

		p.start();
		c.start();

	}

}
