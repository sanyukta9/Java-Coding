
import java.util.Scanner;

public class ReadUserDataUsingScanner {
	
	public static void main(String[] args) {
		
		System.out.println("What is your name?");
		Scanner s=new Scanner(System.in).useDelimiter("\n");
		String name=s.next();
		System.out.println("Good afternoon "+name);
		
		
		System.out.println("Which city do you stay in?");
		Scanner s1=new Scanner(System.in);
		String city=s1.nextLine();
		System.out.println("Oh.... "+city+" its a wonderful place!");
		
		s1.close();
		s.close();
		
	}

}
