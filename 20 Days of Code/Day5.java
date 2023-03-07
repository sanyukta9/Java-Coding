import java.util.Scanner;

/*Given an integer,n , print its first 10 multiples. Each multiple n*i 
 *(where 1<=i<=10)should be printed on a new line in the form: n x i = result.
 * Input Format:A single integer,n
 * --Loops-- 
 */

public class Day5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int result=n*i;
			System.out.println(n+" x "+i+" = "+result);
		}

	}

}
