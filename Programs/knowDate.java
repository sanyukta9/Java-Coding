import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

/*You are given a date. You just need to write the method, getDay, 
 *which returns the day on that date. Function findDay has the 
 *following parameters:
 *int: month
 *int: day
 *int: year
 *Returns string: the day of the week in capital letters
 *Input Format: A single line of input containing the space separated 
 *month, day and year, respectively,
 */

public class knowDate {
	public static <Calender> String findDay(int month,int day,int year) {
		Calendar c=Calendar.getInstance();
		c.set(year, month, day);
		return LocalDate.of(year, month, day).getDayOfWeek().toString();
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		int year = sc.nextInt();
		//System.out.println(month+" "+day+" "+year);
		String Day=knowDate.findDay(year,day,month);
	}

}
