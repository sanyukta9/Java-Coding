
public class StringOperations {
		public static void main(String[] args) {
			String s1;
			s1=new String("abc");//one way to declare
			
			String s2=new String("abc");//second way to declare
			String s3="He is ___ years old";//third way to declare
			
			//String concatenation with another datatype using "+"
			int age=9;
			String s33="He is"+9+"years old";
			System.out.println("Concat-->"+s33);
			
			//Character Extraction
			System.out.println(s1.charAt(1)); //one character
			String s4="This is demo of getChars method";
			int start=10;
			int end=14;
			char buf[]=new char[end-start];
			s4.getChars(start, end, buf, 0);//multiple character extraction
			System.out.println(buf);
			
			
			//String comparison
			String a1="Hello";
			String a2="Hello";
			String a3="Good Bye";
			String a4="HELLO";
			System.out.println("a1.equals(a2)-->"+a1.equals(a2));
			System.out.println("a1.equals(a3)-->"+a1.equals(a3));
			System.out.println("a1.equals(a4)-->"+a1.equals(a4));
			System.out.println("a1.equals(a4)-->"+a1.equalsIgnoreCase(a4));
			
			//boolean return methods
			System.out.println("a1.startsWith()-->"+a1.startsWith("He"));
			System.out.println("a1.endsWith()-->"+a1.endsWith("lo"));
			
			System.out.println("a1.endsWith()-->"+a1.compareTo("He"));//sorting alogorithm/dictionary based
			
			//Searching
			
			String b1="Now we are currently learning about the methods of string class in java";
			System.out.println("b1.indexOf--->"+b1.indexOf("t"));//searches for first occurance of t
			System.out.println("b1.indexOf--->"+b1.indexOf("the"));//searches for first occurance of the
			
			System.out.println("b1.indexOf--->"+b1.lastIndexOf("t"));//searches for last occurance of t
			
			String n1="My name is Indu";
			System.out.println("Static-->n1.substring--->"+n1.substring(11, 15));// static coz we need to know index?
			//dynamic way
			System.out.println("Dynamic-->n1.substring--->"+n1.substring(n1.indexOf("Indu"), n1.indexOf("Indu")+"Indu".length()));	
			
			
			//Miscellanous methods
			System.out.println("Replace-->"+n1.replaceAll("Indu", "Bindu"));
			String n2="    My name is Indu            ";
			System.out.println("Trim-->"+n2.trim());
			System.out.println("Uppercase-->"+n2.toUpperCase());
			System.out.println("join-->"+String.join(" ", "Alpha","Beta","Gamma"));
			
			//Data conversion using valueOf ()
			double num=2.0;
			System.out.println("Convert double to string output="+String.valueOf(num));
			
		}
}

