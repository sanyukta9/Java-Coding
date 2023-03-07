
//To learn constructor types
public class Test {
	int i;
	String name;
	double b;
	
	  //user-defined constructor with no arguments/parameters 
	Test()
	{ 
		i=6; 
		
	}
	 
	
	 Test(String name,int marks){ 
		 
	   System.out.println(name+" "+marks);
	}
	 
	public static void main(String[] args) {
		//calling of default constructor is done only if there is no user -defined constructor
		
		//user defined constructor
		Test t=new Test();
		System.out.println(t.i);
		
	
		//parameterised constructor 
		Test t2=new Test("Sanyukta",80);
		
	}
}

