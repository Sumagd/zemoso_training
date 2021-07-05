package com.solid.obeys.dip;

public class ManualCarManufacture implements FeaturesOfCar {

	@Override
	public int engineType()
	{	
		int Stroke=4;
		System.out.println("stroke:"+Stroke);
		return 12345;
	}

	@Override
	public int fuelType() {
		System.out.println("Fuel: Petrol");
		return 0;
	}

	@Override
	public void hadGears() {
		System.out.println("Manual car has gears");
		
	}
	
}
