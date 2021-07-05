package violates;


//Violates Liskov Substitution Principle
class CarProperties     
{
	public int drive()
	{	
		int speed=170;
		System.out.println("car can be driven");
		return speed;
		
	
	}
	public int shiftgears()
	{
		int gear=3;
		System.out.println("car can shift gears");
		return gear;
	}
}

class CarManual extends CarProperties    //This sub class violates Liskov Substitution Principle
{
	@Override
	public int drive()
	{
		int speed=100;
		System.out.println("Manual car can be driven");
		return speed;
	
	}
	@Override
	public int shiftgears()
	{
		int gears=2;
		System.out.println("Manual car can shift gears");
		return gears;
	}
	
}

class CarAutomatic extends CarProperties   //This sub class violates Liskov Substitution Principle
{
	@Override
	public int drive()
	{	int speed=140;
		System.out.println("Electric car can be driven");
		return speed;
	
	}
	@Override
	public int shiftgears()
	{	
		int gears=0;
		System.out.println("Electric car cannot shift gears");
		return gears;
	}
}

public class Liskov {

	
	public static void main(String[] args) {
		CarManual manual=new CarManual();
		int speed=manual.drive();
		System.out.println("speed:"+speed);
	
		int gear=manual.shiftgears();
		System.out.println("Gear:"+gear);
		
		System.out.println("------------------------------------------");
		CarAutomatic auto=new CarAutomatic ();
		int speed_tesla= auto.drive();
		System.out.println("speed:"+speed_tesla);
		
		int gear_tesla= auto.shiftgears();
		System.out.println("Gear:"+gear_tesla);
	}

}
