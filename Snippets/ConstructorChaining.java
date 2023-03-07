
//To learn constructor chaining using super keyword
class B{
	//parameterized constructor
	B(int i){
		System.out.println("Inside constructor of Class B: "+i);
	}
}

public class ConstructorChaining extends B{
	
	ConstructorChaining(){
		super(10);
		System.out.println("Inside the class's constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Start of my application");
		new ConstructorChaining();
		System.out.println("End of my application");
	}

}