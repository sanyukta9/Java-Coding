import java.util.Scanner;

//Exceptions - String to Integer
/*Task: Read a string,S, and print its integer value; if S cannot 
 *be converted to an integer, print Bad String. Note: You must use
 *String-to-Integer and exception handling constructs built into your 
 *submission language.If you attempt to use loops/conditional statements, 
 *you will get a 0 score.
 *Input Format: A single string,S.
 *Output Format: Print the parsed integer value of S, or Bad String 
 *if  cannot be converted to an integer.
 */

public class Day16 {

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        
	    String S=sc.nextLine();
	    try
	    {
	        int no;
	        no=Integer.parseInt(S);
	        System.out.println(no);
	    }
	    catch(Exception a)
	    {
	        System.out.println("Bad String");
	    }          
	}
}