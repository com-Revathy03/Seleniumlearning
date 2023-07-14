package week3.Stringday2_Assignments;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text= "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		//Declare empty set
		Set<String> set = new LinkedHashSet<>();
		//iterate through loop
		for(int i=0;i<split.length;i++) {
			//add the splited words in set
			set.add(split[i]);
		}System.out.println(set);
	}
}

