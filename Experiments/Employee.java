
import java.util.Scanner;

/* Implement a java program to calculate gross salary & net salary taking the following data.
Input: empno, empname, basic
Process:
DA=70% of basic       
HRA=30% of basic    
CCA=Rs240/-             
PF=10% of basic         
PT= Rs100/-                
*/
public class Employee {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of Employee:");
		String name=sc.next();
		
		System.out.println("Enter Employee Number:");
		int empno=sc.nextInt();
		
		System.out.println("Enter basic salary:");
		int sal=sc.nextInt();
		
		double da,hra,pf,gp=0.00,np=0.00;
		
		da=0.70*sal;
		hra=0.30*sal;
		int cca=240;
		pf=0.10*sal;
		int pt=100;
		
		gp=sal+da+hra+cca;
		np=gp-pf-pt;
		
		System.out.println("Name of Employee:"+name);
		System.out.println("Emp No of Employee:"+empno);
		System.out.println("Gross Pay of Employee:"+gp);
		System.out.println("Net Pay of Employee:"+np);
	}

}