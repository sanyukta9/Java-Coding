import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class patternDemo
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int T = Integer.parseInt(in.nextLine());
        while(T>0){
            String pattern = in.nextLine();
            T--;
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException ex){
                System.out.println("Invalid");
            }
        }
    }
}

