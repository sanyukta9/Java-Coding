/*
 *  Create an interface vehicle and classes like bicycle, car, bike etc, having common functionalities 
 *  and put all the common functionalities in the interface. Classes like Bicycle, Bike, car etc implement 
 *  all these functionalities in their own class in their own way
 * 
 */

interface Vehicle{
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}	

	class Bicycle implements Vehicle{
		int speed;
		int gear;
		@Override
		public void changeGear(int newGear) {
			// TODO Auto-generated method stub
			gear=newGear;
		}

		@Override
		public void speedUp(int increment) {
			// TODO Auto-generated method stub
			speed=speed+increment;
		}

		@Override
		public void applyBrakes(int decrement) {
			// TODO Auto-generated method stub
			speed=speed-decrement;
		}
		
		public void printStates() {
			System.out.println("Speed: "+speed+" Gear: "+gear);
		}
	}
	
	
	class Car implements Vehicle{
		int speed;
		int gear;
		@Override
		public void changeGear(int newGear) {
			// TODO Auto-generated method stub
			gear=newGear;
		}

		@Override
		public void speedUp(int increment) {
			// TODO Auto-generated method stub
			speed=speed+increment;
		}

		@Override
		public void applyBrakes(int decrement) {
			// TODO Auto-generated method stub
			speed=speed-decrement;
		}
		public void printStates() {
			System.out.println("Speed: "+speed+" Gear: "+gear);
		}
	}
	
	class Bike implements Vehicle{
		int speed;
		int gear;
		@Override
		public void changeGear(int newGear) {
			// TODO Auto-generated method stub
			gear=newGear;
		}

		@Override
		public void speedUp(int increment) {
			// TODO Auto-generated method stub
			speed=speed+increment;
		}

		@Override
		public void applyBrakes(int decrement) {
			// TODO Auto-generated method stub
			speed=speed-decrement;
		}
		public void printStates() {
			System.out.println("Speed: "+speed+" Gear: "+gear);
		}
	}

//driver class
public class Interface {

	public static void main(String[] args) {
		Bicycle bicycle= new Bicycle();
		bicycle.changeGear(4);
		bicycle.speedUp(2);
		bicycle.applyBrakes(2);
		
		System.out.println("Bicycle's present state:");
		bicycle.printStates();
		
		Car car= new Car();
		car.changeGear(4);
		car.speedUp(2);
		car.applyBrakes(2);
		
		System.out.println("Car's present state:");
		car.printStates();
		
		Bike bike= new Bike();
		bike.changeGear(3);
		bike.speedUp(5);
		bike.applyBrakes(2);
		
		System.out.println("Bike's present state:");
		bike.printStates();

	}

}
