import java.util.Scanner;

/* Write a program to print the area of a rectangle by creating a class named 'Area' 
 * having two methods. First method named as 'setDim' takes length and breadth of rectangle 
 * as parameters and the second method named as 'getArea' returns the area of the rectangle. 
 * Length and breadth of rectangle are entered through keyboard.
 */

public class Area {
		int length;
		int breadth;
	
		void setDim(int l,int b){
			length=l;
			breadth=b;
		}
		
		int getArea(){
			return length*breadth;
		}
		
		public static void main(String args[]) {
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter the length of rectangle:");
			int l=s.nextInt();
			
			System.out.println("Enter the breadth of rectangle:");
			int b=s.nextInt();
			
			Area areaobj=new Area();
			areaobj.setDim(l, b);
			
			System.out.println("Area of the rectangle is : "+areaobj.getArea());
			
		}
}

