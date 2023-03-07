
//test with 121
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter number to find if palindrome or not: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		
		int sum=0,d;
		
		while(n>0) {
			d=n%10;//denominator
			sum=(sum*10)+d;
			n=n/10;//quotient
		}
		
		if(temp==sum)
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
		
	}
}

