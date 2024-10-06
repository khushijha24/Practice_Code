package JavaPractice;
import java.util.Scanner;

public class questionPractice {
	
//	public static void printSubstrings(String str) {
//		for(int i=0;i<str.length();i++) {
//			for(int j=i; j<str.length();j++) {
//				System.out.println(str.substring(i, j+1));
//			}
//		}
//	}
//	
	
	public static void printSubstrings(String str) {
	for(int i=0;i<str.length();i++) {
		for(int j=i; j<str.length();j++) {
			for(int k=i; k<=j; k++) {
				System.out.print(str.charAt(k));
			}
			System.out.println();
		}
	}
}
	

	public static void main(String[] args) {
		String str="abcd";
//		Scanner s= new Scanner(System.in);
//		String str= s.next();
		
		printSubstrings(str);
	}

}
