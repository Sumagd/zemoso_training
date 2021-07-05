package violates;

interface CarFeatures
{
	int drive();
	int shiftGear();
	
}
class Manualcar implements CarFeatures      
{
	@Override
	public int drive(){    
		int speed=120;
		System.out.println("Ford car can be driven");  
		return speed;
	}
	@Override
	public int shiftGear(){ 
		int gear=1;
		System.out.println("Ford car can shift gears");
		return gear;
	}
	
}
class Automaticcar implements CarFeatures       //This class violates Interface Segregation Principle
{
	@Override
	public int drive(){  
		int speed=150;
		System.out.println("Tesla car can be driven");
		return speed;
	}
	@Override
	public int shiftGear(){  
		int gear=2;
		System.out.println("Tesla is an electric car which does not have Gears");
		return gear;
	}
	
}
public class InterfaceSeggregation {

	
	public static void main(String[] args) {
		Manualcar f=new Manualcar ();
		int speed_cc=f.drive();
		System.out.println("Speed of the car:"+speed_cc);
		int gear_count=f.shiftGear();
		System.out.println("Car gear:"+gear_count);
		System.out.println("----------------------------------");
		Automaticcar t=new Automaticcar();
		int speed=t.drive();
		System.out.println("speed of the car:"+speed);
		int gear=t.shiftGear();
		System.out.println("car gear:"+gear);
		
	}

}
