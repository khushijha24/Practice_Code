package JavaPractice;
import java.util.Scanner;

public class StringPractice {
	
	public static void countWords(String str) {
		if (str.length()==0) {
			System.out.println(0);
		}
		int spaces=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				spaces++;
			}
			
		}
		System.out.println (spaces+1);
	}
	
	
	public static boolean CheckPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
			
		}
			i++;
			j--;
		}
		return true;	
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		countWords(str);
		
		
        String sentence="malayalam";
		
		System.out.println(CheckPalindrome(sentence));

	}
}
