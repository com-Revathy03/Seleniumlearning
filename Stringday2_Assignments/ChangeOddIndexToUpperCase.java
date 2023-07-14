package week3.Stringday2_Assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		//output = ChAnGeMe
		char[] ch=test.toCharArray();
		
		for (int i=0;i<ch.length;i++) {
			if(i%2==1) {
				System.out.print(Character.toUpperCase(ch[i]));
			}else
			{
				System.out.print(ch[i]);
			}
		}
		
}
}