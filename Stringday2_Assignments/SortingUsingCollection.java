package week3.Stringday2_Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] value = {"Hcl", "Wipro", "Aspire systems", "CTS"};
		
		List<String> list= new ArrayList<>();
		
		for(int i=0;i<value.length;i++)
		{
			list.add(value[i]);
		}
		Collections.sort(list);
		System.out.println(list);
		
	}
}
