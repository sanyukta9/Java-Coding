/*
 * Create a class Book and define a display method to display book information. 
 * Inherit Reference_Book and Magazine classes from Book class and override display method of Book class 
 * in Reference_Book and Magazine classes. Make necessary assumptions required.
 */

class Book{
	void display() {
		System.out.println("Name of the book: Black Book Java");
		System.out.println("Author of the book: Steven Holzner");
		System.out.println("Publisher: Dreamtech Press");
	}
}

class Reference_Book extends Book{
	void display() {
		System.out.println("Name of the book: Complete Java reference");
		System.out.println("Author of the book: Patrick, Herbert");
		System.out.println("Publisher: McGraw Hill Education");
	}
}
	
class Magazine extends Book{
	void display() {
		System.out.println("Name of the book: Core Java");
		System.out.println("Author of the book: Cay Horstmann");
		System.out.println("Publisher: Addison-Wesley");	
	}
}


//driver class
public class Inheritance {

	public static void main(String[] args) {
		
		Book b= new Book();
		b.display();
		
		b=new Reference_Book();
		b.display();
		
		b=new Magazine();
		b.display();
	}

}
