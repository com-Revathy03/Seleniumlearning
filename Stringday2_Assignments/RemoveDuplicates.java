package week3.Stringday2_Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "PayPal India";
		char[] ch = s.toCharArray();
		
		Set<Character> charset = new LinkedHashSet<>();	

		for(int i=0;i<ch.length;i++) {
			charset.add(ch[i]);
			}System.out.println(charset);	
	}
}


