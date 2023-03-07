
/*
 * A university has two types of students — graduate students and research students. 
 * The University maintains the record of name, age and programme of every student. 
 * For graduate students, additional information like percentage of marks and stream, 
 * like science, commerce, etc. is recorded; whereas for research students, additionally, 
 * specialization and years of working experience, if any, is recorded. Each class has a constructor. 
 * The constructor of subclasses makes a call to constructor of the superclass. 
 * Assume that every constructor has the same number of parameters as the number of instance variables. 
 * In addition, every subclass has a method that may update the instance variable values of that subclass. 
 * All the classes have a function display_student_info( ), 
 * the subclasses must override this method of the base class. 
 * Every student is either a graduate student or a research student. 
Perform the following tasks for the description given above using Java : 
(i) Create the three classes with proper instance variables and methods, with suitable inheritance. 
(ii) Create at least one parameterised constructor for each class. 
(iii) Implement the display_student_info( ) method in each class. 
 * 
 */

public class University_Inheritance {
	String name;
	int age;
	String programme;
	
	public University_Inheritance(String name,int age, String programme ){
		this.name=name;
		this.age=age;
		this.programme=programme;	
	}
	
	public void display_student_info() {
		System.out.println("Student Info: "+"Name: "+name+ " Age:"+age+" Programme:"+programme);
	}

	public static void main(String[] args) {
		University_Inheritance u=new University_Inheritance("Sara",33,"INFT");
		u.display_student_info();
		System.out.println("--------------------");
		GraduateStudents gs= new GraduateStudents("Sanyukta",19,"INFT",75,"Science");
		gs.display_student_info();
		System.out.println("--------------------");
		ResearchStudents rs= new ResearchStudents("Aarav",31,"CMPN","CMPN Security",10);
		rs.display_student_info();
	}
}

class GraduateStudents extends University_Inheritance{
	int markspercent;
	String stream;
	public GraduateStudents(String name,int age, String programme, int markspercent, String stream) {
		super(name,age,programme);
		this.markspercent = markspercent;
		this.stream = stream;
	}
	public void display_student_info() {
		super.display_student_info();
		System.out.println("GraduateStudents Info: "+" Markspercent:"+markspercent+ " Stream:"+stream);
	}
}

class ResearchStudents extends University_Inheritance{
	
	String specialization;
	int yearsofexp;
	
	public ResearchStudents(String name, int age, String programme, String specialization,int yearsofexp) {
		super(name, age, programme);
		this.specialization=specialization;
		this.yearsofexp=yearsofexp;
	}
	
	public void display_student_info() {
		super.display_student_info();
		System.out.println("ResearchStudents Info: "+" Specialization:"+specialization+ " Yearsofexp:"+yearsofexp);
	}
}