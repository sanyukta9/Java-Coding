//-->I wrote this code on my own<--
import java.util.Scanner;

//Abstract classes
/*An abstract class is a class that is declared abstract—it may or 
 *may not include abstract methods. An abstract method is a method 
 *that is declared without an implementation(without braces,and followed 
 *by a semicolon).
 *Given a Book class and a Day13 class, write a MyBook class 
 *that does the following:
 *1.Inherits from Book
 *2.Has a parameterized constructor taking these  parameters:
 *string title
 *string author
 *int price
 *Implements the Book class' abstract display() method so it prints:
 *1.title, a space, and then the current instance's title.
 *2.author, a space, and then the current instance's author.
 *3.price, a space, and then the current instance's price.
 *Note: you must not use an access modifier public 
 */

class Book{
	
}

class MyBook extends Book{
	//instances of this class are abstract(not public)
	private String title;
	private String author;
	private int price;
	
	//constructor of class MyBook
	MyBook(String title,String author,int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	//display() method
	void display(){
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
}

public class Day13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter title of the book: ");
		String title=sc.nextLine();
		//System.out.println("Enter author of the book: ");
		String author=sc.nextLine();
		//System.out.println("Enter price of the book: ");
		int price=sc.nextInt();
		
		//create an object to initialize the constructor
		MyBook b=new MyBook(title,author,price);
		
		//call display method of class MyBook
		b.display();
	}

}
