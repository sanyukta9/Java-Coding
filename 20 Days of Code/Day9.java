import java.util.Scanner;

/*Input Format: A single integer, n(the argument to pass to factorial)
 *Your submission must contain a recursive function named factorial.
 *Recursive Method for Calculating Factorial:
 *factorial(n)= 1 if n<=1, otherwise n*factorial(n).
 */


public class Day9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter number to find factorial: ");
		int n=sc.nextInt();
		System.out.println(factorial(n));
			
	}

	static int factorial(int n) {
		// TODO Auto-generated method stub
		if(n<=1) {
		return 1;
		}
		else {
		return (n*factorial(n-1));
		}
	}

}
