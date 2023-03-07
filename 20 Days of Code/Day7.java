import java.util.Scanner;

/*Given an array, A, of N integers, print A's elements in reverse order as a 
 *single line of space-separated numbers.Example: A=[1,2,3,4] Print 4 3 2 1. 
 *Each integer is separated by one space.Input Format: The first line 
 *contains an integer, N (the size of our array).The second line contains  
 *N space-separated integers that describe array A's elements.
 */

public class Day7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter size of an array: ");
		int N=sc.nextInt(); //size of an array
		
		int arr[]=new int[N]; //initialize the array accepting 10000 ele
		
		for(int i=0;i<N;i++) {
			//System.out.println("Enter elements in an array: ");
			arr[i]=sc.nextInt(); 
		}
		
		int rev[]=new int[N]; //initialize the reverse array
		
		for(int i=0;i<N;i++) {
			rev[i]=arr[N-i-1]; //logic to reverse
			System.out.print(rev[i]+" "); 
			//to display elements on single line just delete that 'ln' from println
		}
		
	}

}
