
public class StaticInitializationTest {
	static int capacity;
	static boolean flag;
	
	
	static {
		System.out.println("Static Init block called");
		//initilize to 10
		capacity=10;
		flag=true;
		
	}
	static {
		System.out.println("second Static Init block called");
		//initilize to 10
		capacity=20;
		flag=false;
		
	}
	public static void main(String[] args) {
		System.out.println("capacity : "+capacity);
		System.out.println("flag : "+ flag);
	}
	
	
}
