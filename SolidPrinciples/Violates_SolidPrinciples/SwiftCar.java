package violates_solid_principles;

//Violates Dependency Inversion Principle
public class SwiftCar {
	public void engineType()
	{
		//code
	}
		
	}
class carmanufacturing {					//This class violates Dependency Inversion Principle
	public void Manufacture()
	{
		SwiftCar s=new SwiftCar();
		//get car details and start manufacturing
		
	}


}
