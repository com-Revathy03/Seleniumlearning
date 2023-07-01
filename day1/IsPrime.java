package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int num= 17, i=2;
		boolean prime=true;
		
		for(i=2;i<num;i++) {
			if(num % i==0) {
				System.out.println(num + " is not primenumber");
				prime=false;
			}
		}
		if (prime==true)
		{
			System.out.println(num + " is a primenumber");
		}
	}

}
