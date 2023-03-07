
class OuterClass{
	//static member variable
	static int outer_x=10;
	//instance (non static) member
	int outer_y=20;
	//private variable
	private int outer_private =30;
	
	//inner class
	static class InnerClass{
		void display() {
			System.out.println("outer_x= "+outer_x);
		
		}
	}
}

//driver class
public class InnerClassDemo {
	public static void main(String[] args) {
		OuterClass outerObject = new OuterClass();
		OuterClass.InnerClass innerObject=new OuterClass.InnerClass();
		innerObject.display();
	}
}

