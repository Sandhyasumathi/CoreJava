package str;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "abcdefabcd";
		Set<Character> set = new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		
		System.out.println(set);
		
		StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        
        System.out.println(sb.toString());
	}

}
