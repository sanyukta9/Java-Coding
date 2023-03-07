import java.util.Scanner;

public class CalculateHypotenuse {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c; // declaring variables
		
		Scanner sc= new Scanner(System.in); 
		/*importing scanner class to accept values from the user*/
		
		System.out.println("Enter side of a:");
		a= sc.nextDouble();
		
		System.out.println("Enter side of b:");
		b= sc.nextDouble();
		
		c= Math.sqrt((a*a)+(b*b));
		
		System.out.println("Hypotenuse of right angled triangle is: "+c);
		
		sc.close();

	}

}
