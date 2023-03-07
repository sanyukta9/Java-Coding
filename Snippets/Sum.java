
//To learn method overloading and constructor overloading
public class Sum {
	//Compare constructors
	Sum(String a, String b) {
		System.out.println("Constructor overloading: Differs in number of parameters: "+a+" "+b);
	}
	Sum(String a, int b) {
		System.out.println("Constructor overloading: Differs in datatype of parameters: "+a+" "+b);
	}
	Sum(int a, String b) {
		System.out.println("Constructor overloading: Differs in sequence of datatype of parameters: "+a+" "+b);
	}
	public Sum() {
		// TODO Auto-generated constructor stub
	}

	//Compare method
	int add(int x,int y) {
		System.out.println("Add method with 2 parameters of int type");
		return (x+y);
	}
	
	//INVALID CASE OF METHOD OVERLOADING: same name and method signature/argument list: Difference only in return type of method
	/*float add(int x,int y) {
		System.out.println("Add method with 2 parameters of int type");
		return (x+y);
	}*/
	
	int add(int x,int y,int z) {
		System.out.println("Overloaded method:differs in number of parameters");
		return (x+y+z);
	}
	double add(int x,double y) {
		System.out.println("Overloaded method: differs in datatype");
		return (x+y);
	}
	double add(double x,int y) {
		System.out.println("Overloaded method:Differs in the sequence of datatype of parameters");
		return (x+y);
	}
	
	public static void main(String[] args) {
		
		//CONSTRUCTOR OVERLOADING
		Sum s2=new Sum("indu","bindu");
		Sum s3=new Sum("indu",23);
		Sum s4=new Sum(23,"indu");
		
		//METHOD OVERLOADING 
		Sum s=new Sum();		
		System.out.println("Sum value is: "+s.add(10, 20));
		System.out.println("Sum value is: "+s.add(10, 20,30));
		System.out.println("Sum value is: "+s.add(10, 20.02));
		System.out.println("Sum value is: "+s.add(20.02, 10));
			 		  
		System.out.println("Sum value is: "+s.add(10, 20.02f));//type promotion
	}

}