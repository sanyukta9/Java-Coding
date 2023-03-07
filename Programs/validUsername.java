import java.util.Scanner;
import java.util.regex.Pattern;

/*You are updating the username policy on your company's internal networking platform. 
 *According to the policy, a username is considered valid if all the 
 *following constraints are satisfied:
 *1. The username consists of 8 to 30 characters inclusive. If the username 
 *consists of less than 8 or greater than 30 characters, then it is an
 *invalid username.
 *2. The username can only contain alphanumeric characters and underscores (_). 
 *Alphanumeric characters describe the character set consisting of lowercase 
 *characters [a-z], uppercase characters [A-Z],and digits [0-9].
 *3. The first character of the username must be an alphabetic 
 *character, i.e., either lowercase character or uppercase character .
 *Input Format: The first line of input contains an integer n, 
 *describing the total number of usernames. Each of the next  lines
 *contains a string describing the username. 
 */

class UsernameValidator {

	  public static final String regularExpression = "^[A-Za-z]\\w{7,29}$";
	}

	public class validUsername {

	  private static final Scanner sc = new Scanner(System.in);

	  public static void main(String[] args) {
	    int n = Integer.parseInt(sc.nextLine());
	    while (n-- != 0) {
	      String userName = sc.nextLine();

	      if (userName.matches(UsernameValidator.regularExpression)) {
	        System.out.println("Valid");
	      } else {
	        System.out.println("Invalid");
	      }
	    }
	  }
	}
