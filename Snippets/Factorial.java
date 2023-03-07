
import java.util.Scanner;

public class Factorial {
		public static void main(String[] args) {
			System.out.println("Enter number to find factorial");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int i,fact=1;
			
			for(i=1;i<=n;i++) {
				fact=fact*i;
			}
			
			System.out.println("Factorial is: "+fact);
		}
}

