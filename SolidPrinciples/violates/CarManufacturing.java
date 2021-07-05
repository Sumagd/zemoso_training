package violates;

//violates Dependancy Inversion Principle

class car
{
	public int engineType()
	{	
		int Stroke=4;
		System.out.println("stroke:"+Stroke);
		return 12345;
		
	}
}		
public class CarManufacturing {

	
	public static void main(String[] args)
	{
		
			car s=new car();
			int engineNumber=s.engineType();
			System.out.println("Engine Number"+engineNumber);
			
		}
}
