
import java.util.Scanner;

/*Five Bikers Compete in a race such that they drive at a constant speed which 
 * may or may not be the same as the other. To qualify the race, the speed of a racer 
 * must be more than the average speed of all 5 racers. Write a Java program to take 
 * as input the speed of each racer and print back the speed of qualifying racers.
 */
public class BikeRace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int speed[]=new int[5];
		int i;
		for(i=0;i<5;i++) {
		System.out.println("Enter the speed of racer:"+i+":");
		speed[i]=sc.nextInt();
		}
		//avg is sum of all bikers divided by total no .of bikes
		
		int sum=0;
		
		//iterate the speed array and assign it to sum variable while adding sum again to next speed in speed array
		for(i=0;i<5;i++) {
		   sum+=speed[i];
		}
		
		//calculate avg
		double avg=sum/5;
		
		System.out.println(" The average speed of all racers is : "+avg);
		System.out.println(" ---The speed of qualifying racers are:---");
		//To find if each speed in speed array is greater than avg value
		for(i=0;i<5;i++) {
			if(speed[i]>avg)
				System.out.println("Congrats Racer-"+i+":You have a qualifying speed of : "+speed[i]);
		}
		sc.close();
	}
}

