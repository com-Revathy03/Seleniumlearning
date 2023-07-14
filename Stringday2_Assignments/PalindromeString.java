package week3.Stringday2_Assignments;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "madam", rev =" ";
		char[] ch = s.toCharArray();
		
		//iterating the string in reverse order
		for(int i=ch.length-1;i>=0;i--) {
			
			//Adding the character in rev
			rev =rev+ch[i];
		}
		//System.out.println(rev);
		//Comparing the original string with reversed string
		if(s.equals(rev)) {
			System.out.println("The Given String is Palindrome: "+rev);
		}else {
			System.out.println("The Given String is not a Palindrome: "+rev);
		}
	}
}
