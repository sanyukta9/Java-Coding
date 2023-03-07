import java.util.Scanner;

//Static Initializer Block

public class SIB {
	
	static Scanner sc=new Scanner(System.in);
		static int B=sc.nextInt();
		static int H=sc.nextInt();
		static Boolean flag=true;
		
		static {
			if(B<0 || H<0)
				flag=false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	
	public static void main(String[] args) {
		if(flag=true) {
			int area=B*H;
			System.out.println(area);
		}

	}

}
