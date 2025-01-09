package str;

/**
 * Mutable Stringa are those whose value can be updated to the same ref object no new object will be created
 * This can be achived by using String builder or string buffer
 */
public class MutableStrings {

	public static void main(String[] args) {
		
		String str = "Name";
		System.out.println(str);//Name
		//str.concat("Name1");
		//new object will be created in Heap memory
		str=str.concat("Name1");
		System.out.println(str);//Name
		System.out.println("************************");
		StringBuffer sb = new StringBuffer("Name");
		System.out.println(sb);//Name
		
		//No need of reassign it to another object
		sb.append("Name1");
		System.out.println(sb);//NameName1
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());//Initial capacity is 16
		sb1.append("Name1 Name2 Name3 Name4 Name5");
		System.out.println(sb1.capacity());//capacity 34 The capacity will increase as ((Old cap*2) + 2)
		sb1.append("Name6 Name Name Name Name Name Name Name");
		System.out.println(sb1.capacity());//capacity 70
		sb1.trimToSize();
		System.out.println(sb1.capacity());//capacity 69
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb2.capacity());//Initial capacity is 16

	}

}
