package com.solid.obeys.dip;

public class ElectricCarManufacture implements FeaturesOfCar {

	@Override
	public int engineType()
	{	
		int Stroke=3;
		System.out.println("stroke:"+Stroke);
		return 123;
	}

	@Override
	public int fuelType() {
		System.out.println("Fuel:Electric car");
		return 0;
	}

	@Override
	public void hadGears() {
		System.out.println("Electric car has no gears");
		
	}

}
