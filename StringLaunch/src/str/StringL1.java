package str;

/**
 * String is a collection of Characters enclosed with " " Strings are basically
 * immutable ie can't be changed once created But we can create mutable String
 * by using String builder and String buffer class
 */
public class StringL1 {

	public static void main(String[] args) {

		/**
		 * There are two ways to create a String by using direct literal or by using new
		 * keyword
		 * 
		 * Inside the Heap there is a separate memory(String Constant pool) to store the
		 * String literals where duplicates are not allowed
		 */

//		String str1 = "Name";
//		String str2 = "Name";

		/**
		 * == will compare the ref of the object in the above case Both str1 and str2
		 * will refer to the same objects hence the o/p is true
		 */
//		System.out.println(str1==str2);//true

		/**
		 * when we use new keyword then it will be stored in heap where duplicates are
		 * allowed and when we compare it the o/p will be false as new ref obj will be created
		 */
		String str = new String("Name");
		String strStr = new String("Name");

		System.out.println(str == strStr);// false
		
		/**
		 * The equals method will compare the data of the object. Hence the O/p is true
		 */
		System.out.println(str.equals(strStr));//true
		
		String str3 = "Name";
		String str4 = new String("Name");
		System.out.println(str3==str4);//false
		System.out.println(str3.equals(str4));//true
		
		String str5 = "Name";
		String str6 = "name";
		
		System.out.println(str5==str6);//false
		System.out.println(str5.equals(str6));//false
		System.out.println(str5.equalsIgnoreCase(str6));//true
		
		String fName = "Name1";
		System.out.println(fName);//Name1
		fName.concat("Name2");
		//Has the Strings are Immutable
		System.out.println(fName);//Name1
		
		
		String fName1 = "Name1";
		System.out.println(fName1);//Name1
		fName1 = fName1.concat(" Name2");
		//Has the Strings are Immutable
		System.out.println(fName1);//Name1 Name2
		
		String Name = " FirstName LastName ";
		System.out.println(Name.length());//18
		System.out.println(Name.toLowerCase());//firstname lastname
		System.out.println(Name.toUpperCase());//FIRSTNAME LASTNAME
		System.out.println(Name.substring(2, 8));//rstNam
		System.out.println(Name.substring(10));//LastName
		char[] ch = Name.toCharArray();
		for(char c:ch) {
			System.out.println(c);
		}
		
		System.out.println(Name.contains("LastName"));//true
		System.out.println(Name.startsWith("First"));//true
		System.out.println(Name.startsWith("Name"));//false
		System.out.println(Name.indexOf('a'));//6
		System.out.println(Name.lastIndexOf('a'));//15
		
		String[] strarr = Name.split(" ");
		System.out.println(strarr.length);
		for(String s:strarr) {
			System.out.println(s + " ");
		}
		
		System.out.println(Name);// FirstName LastName 
		//will remove the extra space before and after
		System.out.println(Name.trim());//FirstName LastName
		
		String Name1 = "NAME";
		String Name2 = "NAME";
		
		/***
		 * Will compare the ASCII values char by char and return int type value if matches 0 and if not 1
		 */
		System.out.println(Name1.compareTo(Name2));
		

		
	}

}
