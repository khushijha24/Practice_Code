package JavaPractice;
import java.util.Scanner;

public class HellowWorld {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	     int n = s.nextInt();

	     if(n>=0 && n<=50){
	         int i = 1;
	          while(i<=n){
	                int j = 1;
	                while(j<=n-i){
	                    System.out.print(" ");
	                    j= j+1;
	                }
	                j = 1;
	                int p = i;
	                while(j<=i){
	                    System.out.print(p);
	                    j++;
	                    p++;
	                }

	                j=1;
	                p= 2*i-2;
	                while(j<=i-1){
	                    System.out.print(p);
	                    j++;
	                    p--;
	                }
	                System.out.println();
	                i = i+1;
	            }
	        }
	     s.close();
	}

}
