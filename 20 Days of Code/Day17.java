import java.util.Scanner;

/*Write a Calculator class with a single method: int power(int,int). 
 *The power method takes two integers, n and p, as parameters and 
 *returns the integer result of . If either  or  is negative, then 
 *the method must throw an exception with the message: n and p should 
 *be non-negative.Note: Do not use public in the declaration for class.
 *Input: The first line contains an integer, T, the number of test cases. 
 *Each of the T subsequent lines describes a test case in 2 space-separated 
 *integers that denote n and p, respectively.
 */

class Calculator{
	
	//method
	public int power(int n,int p) throws Exception{
        if(n<0 || p<0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            return (int)Math.pow(n,p);
        }
    }
}

public class Day17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter no. of test case: ");
		int T=sc.nextInt();
		
		while(T-- >0) {
			int n=sc.nextInt();
			int p=sc.nextInt();
			Calculator c=new Calculator();
			
			try {
				int cal= c.power(n, p);
					System.out.println(cal);
			}
			catch (Exception e) {
                System.out.println(e.getMessage());
            }
					
		}
		sc.close();
	}

}
