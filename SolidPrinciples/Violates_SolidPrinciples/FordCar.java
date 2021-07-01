package violates_solid_principles;

//Interface Segregation Principle
interface hasCar
{
	void drive();
	void shiftgear();
}
public class FordCar implements hasCar       
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
class TeslaCar implements hasCar       //This class violates Interface Segregation Principle
{
	@Override
	public void drive(){    
		//code         
	}
	@Override
	public void shiftgear(){    
		//Tesla is an electric car which does not have Gears   
	}

}
