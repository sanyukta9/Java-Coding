
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Switch m=new Switch();
	
		System.out.println("\nMenu:\n1-Factorial \n2-Armstrong \n3-Palindrome \n4-Prime Number"
				+ " \n5-Fibonacci Series \nEnter Choice:\n");
		int ch=sc.nextInt();
		switch (ch){
			case 1:m.factorial();
				break;
			case 2:m.Armstrong();
				break;
			
			case 3:m.palindrome();
				break;
				
			case 4:m.prime();
				break;	
				
			case 5:m.fibonacci();
				break;	

			default:
				System.out.println("Invalid choice....");
				break;
			}
		sc.close();
}
	
	public void factorial() {
		System.out.println("Enter number to find Factorial:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i, fact= 1;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial is :"+fact);
	}
	
	public void Armstrong() {
		System.out.println("Enter number to check armstrong or not:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int temp, sum=0, remainder, digits=0 ;
		temp=n;
		
		while(temp!=0) {
			digits++;
			temp=temp/10;
		}
		temp=n;
		while(temp!=0) {
			remainder=temp%10;
			sum=(int) (sum + Math.pow(remainder, digits));
			temp=temp/10;
		}
		if(sum==n)
			System.out.println(n+ " is an Armstrong Number");
		else
			System.out.println(n+ " is not an Armstrong Number");
	}
	
	public void palindrome() {
		System.out.println("Enter number to check Palindrome or not:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int d,sum=0,temp=n;
		while(n>0) {
			d=n%10;
			sum= (sum*10) + d;
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp+ " is a Palindrome");
		else
			System.out.println(temp+ " is not a Palindrome");
	}
	
	public void prime() {
		System.out.println("Enter number to check Prime or not:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		boolean f=false;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				f=true;
				break;
			}	
		}
		if(f==false)
			System.out.println(n+ " is a prime number");
		else 
			System.out.println(n+ " is not a prime number");
	}
	
	public void fibonacci() {
		System.out.println("Enter limit to find fibionnacci Series");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1,c=0,i;
		System.out.println("Fibionacci Series is: "+a+"\n"+b);
		for(i=2;i<=n;i++) {
			c=a+b;
			System.out.println("\t"+c);
			a=b;
			b=c;
		}
	}
}
