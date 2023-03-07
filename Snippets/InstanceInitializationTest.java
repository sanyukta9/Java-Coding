
public class InstanceInitializationTest {

	private int x;
	
	{
		System.out.println("Initization Block :x= " +x);
		x=5;
	}
	public  InstanceInitializationTest() {		
		System.out.println("Constructor :  x="+x);
	}
	public static void main(String[] args) {
		InstanceInitializationTest t1= new InstanceInitializationTest();
		InstanceInitializationTest t2= new InstanceInitializationTest();
	}

}

