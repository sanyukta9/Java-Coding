//To Demonstrate Pass By Value

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "name:" +name +" age:" +age;
	}
	public void changeDetails(String name, int age) {
		this.name=name;
		this.age=age;
	}
}

//driver class
public class PersonDemo {
	public static void main(String[] args) {
		Person person1= new Person("Neeta",32);
		
		Person person2;
		person2=person1;
		person2.changeDetails("Geeta", 18);
		
		System.out.println(person1);
	}
}
