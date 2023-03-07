import java.util.Scanner;

//Inheritance
/*You are given two classes, Person and Student, where Person is the 
 *base class and Student is the derived class. Completed code for Person 
 *and a declaration for Student are provided for you in the editor. 
 *Observe that Student inherits all the properties of Person.
 *Complete the Student class by writing the following:
 *A Student class constructor, which has 4 parameters:
 *A string, firstName.
 *A string, lastName.
 *An integer, idNumber.
 *An integer array (or vector) of test scores, scores.
 *A char calculate() method that calculates a Student object's average 
 *and returns the grade character representative of their calculated 
 *average. Input: The first line contains firstName, lastName and idNumber, 
 *separated by a space. The second line contains the number of test scores. 
 *The third line of space-separated integers describes scores.
 */

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	//protected
	
	Person(String firstName,String lastName,int identification) {
		//System.out.println(firstName+" "+lastName+" "+idNumber);
		 this.firstName = firstName;
	     this.lastName = lastName;
	     this.idNumber = identification;
	     //this. is of person
	}
	//constructor 
	
	public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
	//print person's data: is of person
}

	class Student extends Person{
		
		private int[] testScores; //array of testScores
		Student(String firstName, String lastName, int identification, int[] testScores) {
			super(firstName, lastName, identification);
			this.testScores = testScores;
		}
	
	char calculate() {
		int total=0;
		for (int testScore : testScores) total += testScore;
        int avg = total / testScores.length;
        if (avg >= 90 && avg <= 100) 
        	return 'O';
        if (avg >= 80 && avg < 90) 
        	return 'E';
        if (avg >= 70 && avg < 80) 
        	return 'A';
        if (avg >= 55 && avg < 70) 
        	return 'P';
        if (avg >= 40 && avg < 55) 
        	return 'D';
        return 'T';
     }
}

public class Day12 {	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String firstName=sc.next();
		String lastName=sc.next();
		int id=sc.nextInt();
		
		int numScores = sc.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = sc.nextInt();
        }
        sc.close();
		
		Student s=new Student(firstName, lastName, id, testScores);
		
		s.printPerson();
		System.out.println("Grade: "+s.calculate());

	  }

   }