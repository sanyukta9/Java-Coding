public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
        	String targetString = "Java Is Fun To Learn";
      		String s1= "JAVA";
      		String s2= "Java";
      		String s3 = "  Hello Java  ";
      		
      		System.out.println("Char at index 2(third position): " + targetString.charAt(2));
      		System.out.println("After Concat: "+ targetString.concat("-Enjoy-"));
      		System.out.println("Checking equals ignoring case: " +s2.equalsIgnoreCase(s1));
      		System.out.println("Checking equals with case: " +s2.equals(s1));
      		System.out.println("Checking Length: "+ targetString.length());
      		System.out.println("Replace function: "+ targetString.replace("fun", "easy"));
      		System.out.println("SubString of targetString: "+ targetString.substring(8));
      		System.out.println("SubString of targetString: "+ targetString.substring(8, 12));
      		System.out.println("Converting to lower case: "+ targetString.toLowerCase());
      		System.out.println("Converting to upper case: "+ targetString.toUpperCase());
      		System.out.println("Triming string: " + s3.trim());
      		System.out.println("searching s1 in targetString: " + targetString.contains(s1));
      		System.out.println("searching s2 in targetString: " + targetString.contains(s2));

      		

	}
}