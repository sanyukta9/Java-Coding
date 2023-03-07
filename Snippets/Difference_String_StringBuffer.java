
public class Difference_String_StringBuffer {
		public static void main(String[] args) {
			
			//String class is immutable
			
			String s=new String("Sanyukta");
			s.concat(" Adhate");
			System.out.println(s);
			
			
			//String Buffer class is mutable
			
			StringBuffer sb=new StringBuffer("Sanyukta");
			sb.append(" Adhate");
			System.out.println(sb);
			
			String a1=new String("java");
			String a2=new String("java");
			System.out.println(a1==a2);//o/p->false as reference variable point to different objects
			System.out.println(a1.equals(a2));//o/p->true as content of both objects is the same (Equals method od String Class overrides the equals method of Object class to change the implementation to content comparison
		
			StringBuffer sb1=new StringBuffer("java");
			StringBuffer sb2=new StringBuffer("java");
		    System.out.println(sb1==sb2);//o/p->false as reference variable point to different objects
			System.out.println(sb1.equals(sb2));//o/p->false as equals method of String Buffer does not override the equals method of Object Class which is used for reference comparison only
		
		}
}
