import java.util.Scanner;

/*Given a base-10 integer,n,convert it to binary (base-2).Then find 
 *and print the base-10 integer denoting the maximum number of 
 *consecutive 1's in n's binary representation. When working with 
 *different bases, it is common to show the base as a subscript.
 */

public class Day10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//convert to binary
		String [] str= Integer.toBinaryString(n).split("0");
		int max=0;
		for(String s: str) {
			if(max<s.length()) {
				max=s.length();
			}
		}
		System.out.println(max);
	}

}
