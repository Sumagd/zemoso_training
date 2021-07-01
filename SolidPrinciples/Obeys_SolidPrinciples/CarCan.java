package obeys_solid_principles;
//This class obeys Liskov Substitution Principle
	interface shiftgears
	{
		 void shiftgears();
	}
	public class CarCan {
	{
		public void drive()
		{
			//code
		}
	}
	class FordCar extends CarCan implements shiftgears
	{
		@Override
		public void shiftgears()
		{
			//code
		}
	}
	class TeslaCar extends CarCan
	{
		//code
	}



}
