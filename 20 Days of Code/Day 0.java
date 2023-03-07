import java.util.Scanner;

/*Input Format: 
 * The first line contains a string.The second line contains another string. 
 * The strings are comprised of only lowercase English letters.
 * Output Format:
 * There are three lines of output:
 * 1.For the first line, sum the lengths of A and B
 * 2.For the second line,write Yes if  is lexicographically greater than  
 * otherwise print No instead.
 * 3.For the third line, capitalize the first letter in both  
 * and  and print them on a single line, separated by a space.
*/
public class Day0 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		String str=sc.nextLine();
		String str1=sc.nextLine();
		//System.out.println(str+"\n"+str1);
		
		//1
		System.out.println(str.length()+str1.length());
		
		//2
		int s=str.compareTo(str1);
		if(s>0) {
			System.out.println("Yes");
		}
		else 
			System.out.println("No");
		
		//3
		String a= str.substring(0, 1).toUpperCase() + str.substring(1);
		//System.out.println(a);
		String b = str1.substring(0, 1).toUpperCase() + str1.substring(1);
		//System.out.println(b);
		System.out.println(a+" "+b);

	}

}
