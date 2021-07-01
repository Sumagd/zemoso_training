
//obeys Dependency Inversion Principle
 interface Car 
 {
	 public void engineType();
 }

class Carmanufacturing 
{
	public void Manufacture(Car c)
	{
		//manufacture car
	}
	
	public void engineType()
		{
			
		}
		
	}
public class SwiftCar
{
 public void manufacture(Carmanufacturing carmanufacturing)
 {
	 //code
 }
}
class BMW
{
 public void manufacture(Carmanufacturing carmanufacturing)
 {
	 //code
 }
}
class Test
{
	public static void main(String args[])
	{
     SwiftCar s = new SwiftCar();
     s.manufacture(new Carmanufacturing());
     BMW b = new BMW();
     b.manufacture(new Carmanufacturing());
	}
}

