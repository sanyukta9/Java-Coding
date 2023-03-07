

class A
{
	int x;
    int y;
    //default constructor
    A(){
    	x=5;
        y=5;
       }
    //parameterized constructor
    A(int p,int q){
    	x=p;
        y=q;
      }
    //copy constructor
    A(A a){
    	x=a.x;
        y=a.y;
       }
   void display(){
   System.out.println("x= "+x);
   System.out.println("y= "+y);
   }
}

class ConstructorExample
{
	public static void main(String ar[]){
   A a1=new A();//default
   A a2=new A(10,20);//parameterized
   A a3=new A(a2);//copy
   System.out.println("for object a1");
   a1.display();
   System.out.println("for object a2");
   a2.display();
   System.out.println("for object a3");
   a3.display();
   }
}