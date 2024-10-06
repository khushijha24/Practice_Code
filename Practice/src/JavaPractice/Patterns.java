package JavaPractice;
import java.util.Scanner;

public class Patterns {
	//code for pattern type 1.1
	public static void NumPattern1() {
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
                j=1;
                while(j<=i){
                    System.out.print(j);
                    j=j+1;
                }
                System.out.println();
                i = i+1;
            }
        }
        else{
            System.out.println("Invalid: choose number between 0 to 50!");
        }
	}
	
	
	//code for pattern type 1.2
	public static void NumPattern2() {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();

	        if(n>=0 && n<=50){
	            int i = 1;
	            while(i<=n){
	                int j = 1;
	                while(j<=n-i+1){
	                    System.out.print(n-i+1);
	                    j= j+1;
	                }
	                System.out.println();
	                i = i+1;
	            }
	        }
	        else{
	            System.out.println("Invalid: choose number between 0 to 50!");
	        }
	}
	
	//code for pattern type 2.1
	
	public static void CharPattern1() {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n>=0 && n<=50){
            int i = 1;
            char p = 'A';
            while(i<=n){
                int j = 1;
                while(j<=i){
                    System.out.print(p);
                    j= j+1;
                }
                System.out.println();
                p= (char)(p+1);
                i = i+1;
            }
        }
        else{
            System.out.println("Invalid: choose number between 0 to 50!");
        }
	}
	
	
	//code for pattern type 2.2
	
	public static void CharPattern2() {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n>=0 && n<=50){
            int i = 1;
            while(i<=n){
                int j = 1;
                char p =(char)('A'+ i-1);
                while(j<=i){
                    System.out.print(p);
                    p= (char)(p+1);
                    j= j+1;
                }
                System.out.println();
                i = i+1;
            }
        }
        else{
            System.out.println("Invalid: choose number between 0 to 50!");
        }
	}

	//code for pattern type 2.3
	
	public static void CharPattern3() {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n>=0 && n<=50){
            int i = 1;
            while(i<=n){
                int j = 1;
                char p =(char)(64 + n - i + 1);
                while(j<=i){
                    System.out.print(p);
                    p= (char)(p+1);
                    j= j+1;
                }
                System.out.println();
                i = i+1;
            }
        }
        else{
            System.out.println("Invalid: choose number between 0 to 50!");
        }
	}
	
	//code for pattern type 3.1
	
	public static void StarPattern1(){
	Scanner s= new Scanner(System.in);
    int n= s.nextInt();

    int i= 1;
    while(i<=n){
        int j= 1;
        while(j<=n){
            System.out.print('*');
            j=j+1;
        }
        System.out.println();
        i=i+1;
    }
}
	
	//code for pattern type 3.2
	public static void StarPattern2() {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n>=0 && n<=50){
            int i = 1;
            while(i<=n){
                int p = i;
                int j = 1;
                while(j<=i){
                    System.out.print(p);
                    j= j+1;
                    p= p-1;
                }
                System.out.println();
                i = i+1;
            }
        }
        else{
            System.out.println("Invalid: choose number between 0 to 50!");
        }
	}
	
	//code for pattern type 3.3
	   public static void StarPattern3() {
			 Scanner s = new Scanner(System.in);
		        int n = s.nextInt();

		        if(n>=0 && n<=50){
		            int i = 1;
		            while(i<=n){
		                int j = 1;
		                while(j<=i){
		                    System.out.print(i);
		                    j= j+1;
		                }
		                System.out.println();
		                i = i+1;
		            }
		        }
		        else{
		            System.out.println("Invalid: choose number between 0 to 50!");
		        }
		}
	   
	   
	 //code for pattern type 4.1
	   public static void TreePattern1() {
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
	                while(j<=i){
	                    System.out.print("*");
	                    j++;
	                }

	                j=1;
	                while(j<=i-1){
	                    System.out.print("*");
	                    j++;
	                }
	                System.out.println();
	                i = i+1;
	            }
	        }
	        else{
	            System.out.println("Invalid: choose number between 0 to 50!");
	        }
	   }
	   
	   
	   //code for pattern type 4.2
	   public static void TreePattern2() {
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
	        else{
	            System.out.println("Invalid: choose number between 0 to 50!");
	        }
	   }
	
	public static void main(String[] args) {
		 NumPattern1();
		 NumPattern2();
		 CharPattern1();
		 CharPattern2();
		 CharPattern3();
		 StarPattern1();
		 StarPattern2();
		 StarPattern3();
		 TreePattern1();
		 TreePattern2();

	}

}
