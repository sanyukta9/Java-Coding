import java.util.Scanner; //import scanner class

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("what's your name bro?");
        String name=sc.next();
        //to print name string values
        
		System.out.println("How old are you?");
		int age=sc.nextInt();
		//to print integer values

		System.out.println("How tall are you?");
		double height=sc.nextDouble();
		//to print float values
		
		System.out.println("Hello "+name);
		System.out.println("you are "+age+" years old");
		System.out.println("you are "+height+" in tall");
		
		sc.nextLine(); //to clear the scanner
		
		System.out.println("You coolest guy");
		boolean B=sc.nextBoolean();
		
		System.out.println(B);
        //System.out.println("Yeah man "+B);
		
	}

}
