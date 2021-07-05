package obeys;
//This class obeys the Open-closed Principle
class CalculateCarPrice
{
	public double calculatePrice()
	{
	return 0.8;
	}
}
 class SwiftPrice extends CalculateCarPrice 
{
	 @Override
	public double calculatePrice()
		{
		 	return 0.8*33;
		}
}
 class FordPrice extends CalculateCarPrice 
 {
	 @Override
	public double calculatePrice()
		{
		 	return 0.8*30;
		}
 }
 class BmwPrice extends CalculateCarPrice 
 {
	 @Override
	public double calculatePrice()
		{
		 	return 0.8*43;
		}
 }
public class PriceCalculator {
	public static void main(String[] args) {
		 CalculateCarPrice cp=new CalculateCarPrice();
		 double swiftprice=cp.calculatePrice();
		 double fordprice=cp.calculatePrice();
		 double bmwprice=cp.calculatePrice();
		 System.out.println("Cost of Swift car:"+swiftprice);
		 System.out.println("Cost of Ford car:"+fordprice);
		 System.out.println("Cost of BMW car:"+bmwprice);
		
	}

}
