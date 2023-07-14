package week3.Stringday2_Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int data[]= {3,2,11,4,6,7,2,3,3,6,7};
		//Declaring empty set
		Set<Integer> set= new TreeSet<>();
		//Iterating through loop
		for(int i=0;i<data.length;i++) {
			//adding the value into set
			set.add(data[i]);
		}
		//converting set to list
		List<Integer> list = new ArrayList<>(set);
	    System.out.println(list);
	    
	    System.out.println(list.get(list.size()-2));
	    

	}

}
