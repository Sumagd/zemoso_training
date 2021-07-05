package obeys;

//obeys Liskov Substitution Principle
interface CarFeatures
{
	 int shiftgears();
	 boolean reFuel();
	 void drive();
	
}

class ManualCar implements CarFeatures //This sub class obeys Liskov Substitution Principle
{
	@Override
	public  int shiftgears()
	{
		int gear_count=4;
		System.out.println("Manual car can shift gears");
		return gear_count;
	}

	@Override
	public boolean reFuel() {
		System.out.println("Refuel with petrol or disel when needed");
		return true;
	}

	@Override
	public void drive() {
		System.out.println("Manual Car can be Driven");
		
	}

	
}
class AutomaticCar implements CarFeatures    //This sub class obeys Liskov Substitution Principle
{
	@Override
	public void drive()
	{
		System.out.println("Electric car can be only driven but has no gears");
	}

	

	@Override
	public int shiftgears() {

		System.out.println("Electric cars does not have gears");
		return 0;
	}

	@Override
	public boolean reFuel() {
		System.out.println("Refuel with Hydrogen gas");
		return false;
	}
		

}

public class Liskov {

	public static void main(String[] args)
	{
		ManualCar m=new ManualCar();
		m.reFuel();
		int gear_ford=m.shiftgears();
		System.out.println("Gear:"+gear_ford);
		System.out.println();
		
		
		AutomaticCar a =new AutomaticCar();
		a.drive();
		a.reFuel();
	}

}
