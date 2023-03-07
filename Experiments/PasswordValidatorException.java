
/**
 * Write java program where user will enter loginid and password as input. 
 * The password should be 8 digit containing one digit and one special symbol. 
 * If user enter valid password satisfying above criteria then show “Login Successful Message”. 
 * If user enter invalid Password then create InvalidPasswordException stating 
 * Please enter valid password of length 8 containing one digit and one Special Symbol. 
 * 
 */
import java.util.Scanner;
import java.util.regex.Pattern;
class InvalidPasswordException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int passwordConditionViolated=0;
	InvalidPasswordException(int conditionValue){
		passwordConditionViolated=conditionValue;
	}
	String printMessage(){
		switch(passwordConditionViolated) {
		case 1: return("Password Length should be 8 characters");
		case 2: return("Password should contain at least one digit");
		case 3: return("Password should contain at least one special symbol");
		}
		return ("");
	}
}

public class PasswordValidatorException {
    public static void main(String[] args) {
    	System.out.println("Enter your username");
    	Scanner in=new Scanner(System.in);
    	String username=in.nextLine();
		
    	System.out.println("Enter your password");
    	String password=in.nextLine();
    	
    	System.out.println("Is the "+password+" password valid?");
    	try {
			isValid(password);
			System.out.println("Login Successful");
		} 
    	catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}
	}

	private static void isValid(String password) throws InvalidPasswordException {
		// TODO Auto-generated method stub
		//less than 8 length
		if(password.length()<8) {
			throw new InvalidPasswordException(1);
		}
		//check if at least one digit
		if(true) {
			int count=0;
			//check digits from 0 to 9
			for(int i=0;i<=9;i++) {
				String str1=Integer.toString(i);
				if(password.contains(str1)) {
					count=1;
				}
			}
			if(count==0) {
				throw new InvalidPasswordException(2);
			}
		}
		//check for one special symbol
		Pattern specialCharPattern=Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);
		if(!specialCharPattern.matcher(password).find()) {
			throw new InvalidPasswordException(3);
		}
		
	}
}
