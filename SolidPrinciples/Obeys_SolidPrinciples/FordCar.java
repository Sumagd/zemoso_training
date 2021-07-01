package obeys_solid_principles;
//This class obeys Interface Segregation Principle
interface drivableCar
{
	void drive();
}
interface hasGears
{
	void shiftgear();
}
public class FordCar implements drivableCar,hasGears        
	{
		@Override
		public void drive(){    
			//code         
		}
		@Override
		public void shiftgear(){    
			//code         
		}
	}
	class TeslaCar implements drivableCar
	{
		@Override
		public void drive(){    
			//code         
		}
	}


