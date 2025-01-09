package collections;

import java.util.PriorityQueue;

/**
 * Belongs to the Queue family and 
 * follows minHeap data Struture(Where the priority element(min element) will be in the top)
 * duplicates are allowed
 */
public class PriorityQueueL1 {

	public static void main(String[] args) {
	
		PriorityQueue pd = new PriorityQueue();
		
		pd.add(100);
		pd.add(50);
		pd.add(175);
		pd.add(150);
		pd.add(120);
		pd.add(180);
	
		
		System.out.println(pd);//[50, 100, 175, 150, 120, 180]
		

	}

}
