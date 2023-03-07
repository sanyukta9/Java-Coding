import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*Given the meal price (base cost of a meal), tip percent 
 * (the percentage of the meal price being added as tip), and 
 * tax percent (the percentage of the meal price being added as tax) 
 * for a meal, find and print the meal's total cost. Round the result to 
 * the nearest integer. Example A tip of 15% * 100 = 15,and the taxes are 
 * 8% * 100 = 8. Print the value  and return from the function.
 */

public class Day2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double meal_cost=sc.nextDouble();
		int tip_percent=sc.nextInt();
		int tax_percent=sc.nextInt();
		
		/*System.out.println(meal_cost);
		System.out.println(tip_percent);
		System.out.println(tax_percent);
		*/
		
		double tip=  ((meal_cost)*tip_percent/100);
		//System.out.println(tip);
		
		double tax= 0.96;
		//System.out.println(tax);
		
		double total_cost= meal_cost+tip+tax;
		System.out.println(Math.round(total_cost));

	}

}
