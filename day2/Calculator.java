package week1.day2;

public class Calculator {
	
//	 1.Create a class called Calculator
//	    2.Create 3 methods
//	        - addThreeNumbers(3 int arguments) and return the value
//	        - subtwoNumbers(1 int arguments,1 float argument) and return the value
//	        - divide twoNumbers(2 int arguments)
//	    3.Create a main method and create an object for the class and access all the method
//	    4.Finall,print them in the console

	
	public int addThreeNumbers(int a, int b, int c)
	{
		return a+b+c;
	}
	
	 public float subTwoNumbers(int num,float num2)
	 {
		return num+num2;
		
	 }
	 
	 public int divideTwoNumbers(int num3,int num4)
	 {
		 return num3/num4;
		 
	 } 
	 
	public static void main(String[] args) {
		Calculator calc= new Calculator();
		
		int addition=calc.addThreeNumbers(10, 20, 40);
		float sub=calc.subTwoNumbers(20, 5.5f);
	    int division = calc.divideTwoNumbers(20, 5);
	    
	    System.out.println("The addition value is "+addition);
	    System.out.println("The subtraction value is "+sub);
	    System.out.println("The division value is "+division);
	}
}
