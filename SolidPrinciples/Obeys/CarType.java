package com.solid.obeys.dip;
//obeys Dependancy Inversion Principle



public class CarType
{
	private final FeaturesOfCar car;
	public CarType(FeaturesOfCar car)
	 {
		this.car=car;
		car.engineType();
		car.fuelType();
		car.hadGears();
		
	 }
}
		
		
		
