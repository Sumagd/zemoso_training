package obeys;


//obeys Interface Segregation Principle
interface ElectricCarFeatures
{
	int drive();
	
}
interface ManualCarFeatures
{
	int shiftGear();
}
class CarManual implements ElectricCarFeatures,ManualCarFeatures     
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
class CarElectric implements  ElectricCarFeatures      //This class obeys Interface Segregation Principle
	{
		@Override
		public int drive(){ 
			int speed=140;
			System.out.println("Tesla car can only be driven but cannot shift gears");   
			return speed;
		}
	}

public class IntefaceSegregation {

	
	public static void main(String[] args) {
		CarManual f=new CarManual();
		int speed_cc=f.drive();
		System.out.println("speed of the ford car:"+speed_cc);
		int gear_count=f.shiftGear();
		System.out.println("Ford Car gear:"+gear_count);
		System.out.println("--------------------");
		CarElectric t=new CarElectric();
		int speed=t.drive();
		System.out.println("speed of the Tesla car:"+speed);
		
		
	}

}
