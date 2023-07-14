package week3.Stringday2_Assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String text= "I am a Software Tester";
		String[] splitText = text.split(" ");
		
		//Iterating through each word
		for(int i=0;i<=splitText.length-1;i++) {
			if(i%2!=0) {
				//System.out.println(splitText[i]);
				char[] ch =	splitText[i].toCharArray();
				for(int j=ch.length-1;j>=0;j--) {
					System.out.print(ch[j]);
				}
			}else 
			{
				System.out.print(" "+splitText[i]+" ");
			}
		}
	}
}
