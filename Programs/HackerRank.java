import java.util.Scanner;

/*Java has 8 primitive data types; char, boolean, byte, short, int, 
 * long, float, and double. For this exercise, we'll work with the 
 * primitives used to hold integer values (byte, short, int, and long):
 * A byte is an 8-bit signed integer.
 * A short is a 16-bit signed integer.
 * An int is a 32-bit signed integer.
 * A long is a 64-bit signed integer.
 * Given an input integer, you must determine which primitive data types are 
 * capable of properly storing that input.
 *Input Format: The first line contains an integer, T, denoting the number of 
 *test cases.Each test case,T , is comprised of a single line with an integer,
 *n, which can be arbitrarily large or small.
 */

public class HackerRank {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++) {
			
			try {
			long n=sc.nextLong();
			System.out.println(n+"can be fitted in:");
			
			if(n>=-128 && n<=127) {
				System.out.println("*byte");
			}
			if(n>=-32768 && n<=32767) {
				System.out.println("*short");
			}
			if(n>=-2147483648 && n<=2147483647) {
				System.out.println("*int");
			}
			System.out.println("*long");
			
			}
			
			catch(Exception e) {
				System.out.println(sc.next()+"can't be fitted anywhere.");
			}
			
		}
			
		}
		
	}


