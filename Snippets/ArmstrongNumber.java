
//test with : 9926315 or 153
import java.util.Scanner;

public class ArmstrongNumber {
     public static void main(String[] args) {
    	System.out.println("Enter number to find if Armstrong number: ");
 		Scanner sc=new Scanner(System.in);
 		int n=sc.nextInt();
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
}

