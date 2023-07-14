package week3.Stringday2_Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String str ="madam";
		char[] ch = str.toCharArray();
		Set<Character> unique = new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++) {
			unique.add(ch[i]);
		}System.out.println(unique);
	}

}
