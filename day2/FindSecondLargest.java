package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {	
	public static void main(String[] args) {
		int arr[]= {1,3,5,6,32,15};
		int second=0;
		Arrays.sort(arr);
		second=arr[arr.length-2];

		System.out.println("The Second largest number is:"  +second);
		
	}
		
}
	
