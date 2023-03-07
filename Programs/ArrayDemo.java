
public class ArrayDemo {

	public static void main(String[] args) {
		
		//array used to store multiple values in a string variable
		
		/*String[] cars= {"Camaro","Maruti","BMW","Tesla"};
		 * 
		 *cars[0]="nano";
		 *System.out.println(cars[0]);
		 *--- will give o/p nano ---
		 *and if we excluded cars[0]="nano"; then we'll get o/p Camaro
		 */
		
		String[] cars= new String[4]; //here we can decide length of an array
		cars[0]="BMW";
		cars[1]="Tesla";
		cars[2]="TATA";
		cars[3]="Porsche";
		
		// to print all characters in array used length
		for(int i=0; i<cars.length; i++)
		System.out.println(cars[i]);
    }
}
