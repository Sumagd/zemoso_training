package violates_solid_principles;
//This class violates Liskov Substitution Principle
public class CarCan {
	public void drive()
	{
		//code
	}
	public void shiftgears()
	{
	//code
	}
}

class Fordcar extends CarCan
{
	//code
}

class Teslacar extends CarCan
{
	//code
}

