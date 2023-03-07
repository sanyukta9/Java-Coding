
public class StringDemo {

	public static void main(String[] args) {
		
		//Strings
		
		/**created string object using new keyword --> 2 objects get created 
		 * in heap memory and String Constant Pool by JVM.
		 * The variables s,s1,s2 refer to the objects implicitly(in Heap memory)
		 * Strings are immutable
		 */
		String s=new String("Sanyukta ");
		System.out.println(s);
		
		s.concat("Adhate");
		System.out.println(s); //can't modify the original object
		
		String s5=s.concat("Adhate ");
		System.out.println(s5);
		
		s5.concat("Here");
		System.out.println(s5);
		
		String s6=s5.concat("Here");
		System.out.println(s6);
		
		String s1=new String("Sanyukta");
		s.concat("Adhate");
		System.out.println(s1);//now s and s1 two objects present referring to the two different things 
		
		String s2=new String("Java");
		s.concat("Demo");
		System.out.println(s2);//**now s, s1, s3 three objects present referring
		/* to the three different things but while content comparison
		 * it can be true if one or more things may same
		 */
		
		System.out.println(s==s1);//compare reference variables
		System.out.println(s.equals(s1));//compare content
		
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//**created string object using new keyword --> 1 object get created
		 /* in heap space and string constant pool
		  * The variables s,s1,s2 refer to the objects explicitly(in string constant pool)
		  */
		
		String s3= "Hellooooo ";
		String s8= "Hellooooo ";
		
		s8.concat("Yola");
		
		System.out.println(s3);
		System.out.println(s8);
		
		/**s3.concat("World");
		System.out.println(s3);
		
		String s4=s3.concat("World");
		System.out.println(s4);

		
		//String Buffers
		StringBuffer sb=new StringBuffer("Sanyukta ");
		sb.append("Adhate");
		System.out.println(sb);
		
		//String Builders
		StringBuilder sbd=new StringBuilder("Sanyukta ");
		sbd.append("Adhate");
		System.out.println(sbd);*/

	}

}
