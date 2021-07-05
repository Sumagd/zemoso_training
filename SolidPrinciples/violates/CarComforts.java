package violates;
//Violates Single Responsibility Principle
//This Car class violates the Single Responsibility Principle as it does multiple functions
public class CarComforts {
	public static int playCD()
	{	
		System.out.println("Music on");
		return 1;
		
	}

	public void turnOnAC(int temperature)
	{
		if(temperature>=35)
		{
			
			System.out.println("Temperature is too High");
			System.out.println("Turn on the car AC");
		}
		else
		{
			playCD();
		}
	}
	public static void main(String[] args)
	{
		CarComforts c=new CarComforts();
			c.turnOnAC(37);
			
			
		}
	}

