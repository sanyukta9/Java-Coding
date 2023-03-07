import java.util.Scanner;

/*Given an integer, , perform the following conditional actions:
 * 1.If n is odd, print Weird
 * 2.If n is even and in the inclusive range of 2 to 5, print Not Weird
 * 3.If n is even and in the inclusive range of 6 to 20, print Weird
 * 4.If n is even and greater than 20, print Not Weird
 * Complete the stub code provided in your editor to print whether or 
 * not n is weird.
 * constraints: 1<=n<=100
 */

public class Day3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Input Format: A single line containing a positive integer,n
		int n=sc.nextInt();
		
		//If n is odd, print Weird
			if(n%2==0) {
		    if(n>=2&&n<=5)
				System.out.println("Not Weird");
			else if(n>=6&&n<=20)
				System.out.println("Weird");
			else if(n>=20)
				System.out.println("Not Weird");
			}
			else
				System.out.println("Weird");
	}
}
