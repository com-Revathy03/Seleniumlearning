package week1.day2;

public class DuplicateArryay{

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,3,5,5,6,6,7,8};
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Array is "+arr[i]);
				}
			}			
		}
	}
}
