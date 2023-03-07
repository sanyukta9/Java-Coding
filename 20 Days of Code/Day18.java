import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//Stack and queue
/*first take each character in s, enqueue it in a queue, and also 
 *push that same character onto a stack. Once that's done, we must 
 *dequeue the first character from the queue and pop the top character 
 *off the stack, then compare the two characters to see if they are
 *the same; as long as the characters match, we continue dequeuing, 
 *popping, and comparing each character until our containers are empty 
 *(a non-match means  isn't a palindrome). 
 */

public class Day18 {
	Queue <Character> q=new LinkedList<>(); //Queue
	Stack <Character> s=new Stack<>(); //Stack
	
	//push character into the stack
	void pushCharacter(char c) {
		s.push(c);
	}
	
	//enqueue character into the queue
	void enqueueCharacter(char c) {
		q.add(c);
	}
	
	//pop topmost character from stack
	char popCharacter() {
		return s.pop();
	}
	
	//dequeue character from the queue
	char dequeueCharacter() {
		return q.remove();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a string: ");
		String str=sc.nextLine();
		sc.close();
		
		char[] s = str.toCharArray(); //array of characters
		
		//create an object
		Day18 sq=new Day18();
		
		for(char c: s) {
			sq.pushCharacter(c); //call stack PUSH
			sq.enqueueCharacter(c); //call queue ENQUEUE
		}

		//CHECK PALINDROME CONDITION ON 'S' CHARACTER
		boolean isPalindrome=true;
		for(int i=0; i<s.length/2; i++) {
			if(sq.popCharacter() != sq.dequeueCharacter()) {
				isPalindrome=false;
				break;
			}
		}
		
		System.out.println("The word, "+str+", is" 
				+( (!isPalindrome) ? "not a palindrome." : " a palindrome." ));
		
	}

}
