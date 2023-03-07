
import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		int n,i,c;
		System.out.println("Enter number of students=");
		Scanner t=new Scanner(System.in);
		n=t.nextInt();
		
		//Create vector to add names from user
		
		Vector v=new Vector();
		
		for(i=0;i<n;i++) {
		System.out.println("Enter student name=");
		String s=t.next();
		v.addElement(s);
		}
		while(true) {
		System.out.println("MENU\n1.Insert new student\n2.Delete student name\n3.Display list\n4.Exit\nEnter choice=");
		c=t.nextInt();
		if(c==4)
		break;
		switch (c) {
					case 1:System.out.println("Enter name and position");
					       String s1=t.next();
					       int p=t.nextInt();
					       v.insertElementAt(s1, p);
					       System.out.println("Name is inserted");
						   break;
						   
					case 2:System.out.println("Enter name of student to be deleted");
					       String s2=t.next();
					       v.removeElement(s2);
					       System.out.println("Name is deleted");
						   break;
					
					case 3:for (i = 0; i < v.size(); i++) {
							System.out.println(v.elementAt(i).toString());
							}
							break;
					
					default:System.out.println("Invalid choice");
						break;
		}
		}
		
	}
}
