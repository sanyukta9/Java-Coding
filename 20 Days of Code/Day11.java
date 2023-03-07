import java.util.Scanner;

/*Given a 6X6 2D Array,A.We define an hourglass in A to be a subset 
 *of values with indices falling in this pattern in A's graphical representation 
 *a b c
 *d
 *e f g
 *Task: Calculate the hourglass sum for every hourglass in A, then 
 *print the maximum hourglass sum.
 *Input Format: There are 6 lines of input, where each line contains  
 *6 space-separated integers that describe the 2D Array A.
 *Output: Print the maximum hourglass sum in A.
 */

public class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = -10000;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            
                   // [00] [01] [02]
                //      [11]
                // [20] [21] [22]
           
            	int currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                       + arr[i+1][j+1]
                       + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                   if (currentSum > sum) {
                       sum = currentSum;
                   }
            }
        }
    
        System.out.println(sum);
    }
}