
import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		SwitchDemo s=new SwitchDemo();
		System.out.println("Enter number to find factorial");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		switch (n) {
					case 0:s.factorial(n);
						   break;
					
					case 1:s.armstrong(n);
					   break;
					case 2:System.out.println("i is two");
					   break;
					default:System.out.println("i is greater than 2");
					break;
					
		}
		
	}
	private void armstrong(int n) {
		int sum=0,temp,remainder,digits=0;
 		temp=n;
 		
 		//count the number of digits
 		
 		while(temp!=0) {
 			digits++;
 			temp=temp/10;//quotient
 		}
 		
 		temp=n;
 		
 		//to get individual numbers of the temp number and raise them to power and then sum the powers
 		while(temp!=0) {
 			remainder=temp%10; //to get individual numbers

 			sum=(int) (sum+Math.pow(remainder,digits));//final value is the sum
 			temp=temp/10;
 		}
 		
 		if(n==sum)
 			System.out.println(n+" is an Armstrong number");
 		else
 			System.out.println(n+" is not an Armstrong number");
 		
		
	}
	public void factorial(int n) {
		int i,fact=1;
		
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial is: "+fact);
	}
}
