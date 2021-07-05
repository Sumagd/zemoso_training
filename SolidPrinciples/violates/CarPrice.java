package violates;

public class CarPrice        //This class violates the Open-closed Principle
{
	public double swiftCarPrice()
	{
		return  0.8*18;
		
	}

	public double fordCarPrice()
	{
		return  0.8*56;
	}

	public static void main(String[] args) {
		 CarPrice price=new CarPrice();
		 double swiftprice=price.swiftCarPrice();
		 double fordprice=price.fordCarPrice();
		 System.out.println("Cost of Swift car:"+swiftprice);
		 System.out.println("Cost of Ford car:"+fordprice);
		
	}

}
