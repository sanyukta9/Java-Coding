import java.util.Scanner;

public class Day6 {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
        int T = sc.nextInt(); //no. of test cases
        sc.nextLine();
        
        for(int i = 0; i < T; i++){
            String s= sc.nextLine();
            char[] charArray = s.toCharArray();
            
            for (int j = 0; j < charArray.length; j++) 
            {
                if (j % 2 == 0) 
                System.out.print(charArray[j]);
            }
            
            System.out.print(" "); // 2 space-separated strings on a single line
            
            for (int j = 0; j < charArray.length; j++) 
            {
                if (j % 2 != 0) 
                System.out.print(charArray[j]);
            }
            
            System.out.println();
        }
            sc.close();
    }
}