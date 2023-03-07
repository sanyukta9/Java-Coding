import java.util.Scanner;

/*Write a Person class with an instance variable,age , and a constructor 
 *that takes an integer,initialAge , as a parameter. The constructor must 
 *assign initialAge to age after confirming the argument passed as initialAge 
 *is not negative; if a negative argument is passed as , the constructor 
 *should set age to 0 and print Age is not valid, setting age to 0.. 
 *In addition, you must write the following instance methods: yearPasses() 
 *should increase the  age instance variable by 1.amIOld() should perform 
 *the following conditional actions:
 *--> If age<13 , print You are young.. 
 *--> If age>=13 and age<18, print You are a teenager..
 *--> Otherwise, print You are old.. 
 *All methods should be public and instance variables should be private
 *as it implements the concept of encapsulation
 */

public class Day4 {
	private int age;
	
	public Day4(int initialAge){
		if(initialAge<0) {
			age=0;
			System.out.println("Age is not valid, setting age to 0.");
		}
			else age=initialAge;
	}
	
	public void yearPasses() {
		age+=1; //age++
	}
	
	public void amIOld() {
		if(age<13)
			System.out.println("You are young.");
		else if(age>=13 && age<18) 
			System.out.println("You are a teenager.");
		else 
			System.out.println("You are old.");
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt(); //no. of test cases we want to check
		for (int i = 0; i < T; i++) {
			
		   int age=sc.nextInt();
		   Day4 p=new Day4(age);
		   p.amIOld();
		   
		   for(int j = 0; j < 3; j++) {
		   p.yearPasses();
		   }
		   p.amIOld();
		   System.out.println();
		}
	}

}
