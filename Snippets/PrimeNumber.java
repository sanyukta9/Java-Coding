
import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		System.out.println("Enter number to find prime number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		boolean f=false;// if false is retained even after the for loop, then it is a prime number
		for(i=2;i<n;i++) {
			if(n%i==0) {
				f=true;
				break;
			}
		}
		if(f==false && n!=0 && n!=1)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");
		
	}

}
