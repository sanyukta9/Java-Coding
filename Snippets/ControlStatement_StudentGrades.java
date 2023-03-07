
/*Problem Statement: Create a Java Program to grade students: >=75 : Distinction, 60-75:First Class,
50-60:Second Class, <50 : Fail*/


public class ControlStatement_StudentGrades {
	public static void main(String[] args) {
		String name[]= {"Sanyukta","Rohan","Ruchi","Sammy"};
		int marks[]= {81,75,43,58};
		
	for(int i=0;i<4;i++) {	
		if(marks[i]>=75)
			System.out.println("Congrats "+ name[i]+ " you have got Distinction");
		else if (marks[i]>60)	
			System.out.println("Congrats "+ name[i]+ " you have got First Class");
		else if (marks[i]>50)	
			System.out.println("Congrats "+ name[i]+ " you have got Second Class");
		else
			System.out.println("Status "+ name[i]+ " Fail: better luck next time");
	}
  }
}



