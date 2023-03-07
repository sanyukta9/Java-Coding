
import java.util.Scanner;

public class RecursiveDemo {
		public static void main(String[] args) {
			RecursiveDemo r1= new RecursiveDemo();
			int ch,n1,n2,g,l,n,i,k,m,s;
			//to get choice from user : based on menu
			Scanner sc=new Scanner(System.in);
		do {
			System.out.println("\n1.GCD and LCM\n2.Fibionacci\n3.Reverse\n4.SummationSeries\n5.Exit");
		
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
					switch (ch) {
								case 1:System.out.println("Enter n1 and n2 :");
										n1=sc.nextInt();
										n2=sc.nextInt();
										g=r1.gcd(n1,n2);
										l=(n1*n2)/g;
										System.out.println("GCD is: "+g+" "+"LCM is: "+l);
									    break;
								case 2: System.out.println("Enter limit: ");
										n=sc.nextInt();
										for(i=0;i<n;i++) {
										 System.out.println(r1.fibo(i)+" ");
										}
										break;
								case 3: System.out.print("Enter number to reverse: ");
										k=sc.nextInt();
										r1.reverse(k);
									    break;
								case 4: System.out.println("Enter limit of the series: ");
										m=sc.nextInt();
										s=r1.sum(m);
										System.out.println("Sum is : "+s);
									    break;
								case 5:	break;
					}
			} while(ch!=5);
		}
		
		int gcd(int n1, int n2){
			//recursive method to find GCD using euclid's algorithm
			if(n2!=0)
			{return gcd(n2,n1%n2);}
			else {
				return n1;
			}
		}
		
		int fibo(int i){
			if (i==0)
				return 0;
			else if(i==1)
				return 1;
			else return (fibo(i-1)+fibo(i-2));	
		}
		void reverse(int k) {
			if(k<10)
				System.out.print(k);
			else {
				System.out.print(k%10);
				reverse(k/10);
			}
		}
		int sum(int m) {
			if(m==1) return 1;
			else
				return (m+sum(m-1));
		}
}
