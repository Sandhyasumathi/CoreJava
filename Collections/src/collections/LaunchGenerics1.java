package collections;

import java.util.ArrayList;

class Alpha{
	
	
}

class Beta extends Alpha{
	
}

class Gamma{
	
}
public class LaunchGenerics1 {

	public static void main(String[] args) {
		

		ArrayList<Alpha> aList = new ArrayList<>();
		ArrayList<Beta>  bList = new ArrayList<>();
		ArrayList<Gamma> gList = new ArrayList<>();
		
		//When we try to add the collection of child into a parent ref then it will give compile time error
		//aList = bList;
		
		ArrayList<?> aList1 = new ArrayList<>();//? - unKnown type or wildcard we can add any type of objects
		ArrayList<Beta>  bList1 = new ArrayList<>();
		
		aList1=bList1;//mo error
		
		ArrayList<? extends Alpha> aList2 = new ArrayList<>();//upper bound can add either class or its child
		ArrayList<Beta>  bList2 = new ArrayList<>();
		ArrayList<Object> oList = new ArrayList<>();
		
		aList2=bList2;
		//aList2 = oList; // error has object is parent of Alpha
	    //aList2=gList;//error
		
		ArrayList<? super Alpha> aList3 = new ArrayList<>();//lower bound can add either class or its parent
		ArrayList<Beta>  bList3 = new ArrayList<>();
		ArrayList<Object> oList1 = new ArrayList<>();
		
		aList3 = oList1;
		//aList3 = bList3; //not allowed ce
	}

}
