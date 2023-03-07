
import java.util.*;
class ExceptionDemo
{
public static void main(String ar[])  //command line arg array
{
	Scanner sc =new Scanner(System.in);
    int a,b,c;

try
{
System.out.println("enter value of a and b");
a=sc.nextInt();
b=sc.nextInt();
c=a/b;
System.out.println("result= "+c);
System.out.println(ar[2]);  
}
catch(InputMismatchException ex)
{
System.out.println(" input barabar nahi hai");
}

catch(ArithmeticException ex)
{
System.out.println(" denominator zero hai");
}
catch(ArrayIndexOutOfBoundsException ex)
{
System.out.println(" Array index accessed is out of bounds");
}

System.out.println("Execution Continues"); 
}
}
