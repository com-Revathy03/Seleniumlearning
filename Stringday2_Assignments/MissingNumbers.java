package week3.Stringday2_Assignments;


import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {

	public static void main(String[] args) {

		int num[]= {1,2,3,4,5,7,8,9,10};
		Set<Integer> set= new TreeSet<>();

		//iterator through loop
		for(int i=1;i<num.length;i++) {
			set.add(num[i]);
			//check the i value and num value
			if(i!=num[i-1]) {
				System.out.println(i);	
				break;
			}
		}
	}
}
