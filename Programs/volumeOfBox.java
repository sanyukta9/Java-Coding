
class Box{
	//declaring instances of an object i.e. variables
	double width;
	double height;
	double depth;
}
public class volumeOfBox {

	public static void main(String[] args) {
		
		double vol;
		Box box= new Box(); //creating an object named box
		box.width= 20;  
		box.height= 40;
		box.depth= 60; // object.instance=value
		
		vol= box.width*box.height*box.depth;
		
		System.out.println("Volume of box:"+vol); // concatenating the value of vol
		

	}

}
