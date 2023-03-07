import java.io.File;

/**
 * You have been given the list of the names of the files in a directory. 
 * You have to select Java files from them. 
 * A file is a Java file if it’s name ends with “.java”. 
 * For e.g. File- “Names.java” is a Java file, “FileNames.java.pdf” is not. 
   Input: test.java, ABC.doc, Demo.pdf, add.java, factorial.java, sum.txt
   Output: test.java, add.java, factorial.java
 *
 */

public class ReadFilesFromFolder {
	static File folder=new File("D:\\Sanyukta\\My Java_eclipse\\File Handling\\ReadFiles");
	static String temp="";
	public static void main(String[] args) {
		System.out.println("Reading files under the folder"+folder.getAbsolutePath());
		
		listFilesForFolder(folder);
		
//		try {
//			FileInputStream inputStream=new FileInputStream("D:/DemoFolder/add.java");
//			String everything=IOUtils.toString(inputStream);
//			System.out.println("Everything inside the file-->"+everything);
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	
	static void listFilesForFolder(File folder) {
		for (File fileEntry:folder.listFiles()) {
			if(fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry);
			}
			else {
				if(fileEntry.isFile()) {
					temp=fileEntry.getName();
					if((temp.substring(temp.lastIndexOf('.')+1, temp.length()).toLowerCase()).equals("java"))
						System.out.println("Java File Names are ="+fileEntry.getName());
				}
			}
		}
	}
}
