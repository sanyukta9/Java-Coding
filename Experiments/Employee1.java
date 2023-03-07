
/*Write a program that would print the information (name, year of joining, salary, address) of three employees 
 * by creating a class named 'Employee'. The output should be as follows:
 * Name           Year of Joining 					Address
 * Robert			1994					64C-WallsStreet
 * Sam				2000					68D-WallsStreet
 * John             1999					26B-WallsStreet
 */
public class Employee1 {
		String name;
		int year;
		int salary;
		String address;
		
		Employee1(String name,int year,String address){
			System.out.println(name+"       "+year+"         "+address);
		}

		public static void main(String[] args) {
			System.out.println("Name           Year of Joining               Address");
			//parameterized constructor
			Employee1 e1=new Employee1("Robert",1994,"64C-WallsStreet");
			Employee1 e2=new Employee1("Sam",2000,"68D-WallsStreet");
			Employee1 e3=new Employee1("John",1999,"26B-WallsStreet");
	
		}
}
