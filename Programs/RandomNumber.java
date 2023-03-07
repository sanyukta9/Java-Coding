import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		Random rdm= new Random(); 
		//first create an object Random then import random class to get random Nos.
		
		int x;
		
		x= rdm.nextInt();
		
		double y;
		
		y= rdm.nextDouble();
		
		boolean z;
		
		z= rdm.nextBoolean();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}

}
