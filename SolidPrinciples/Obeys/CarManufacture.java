package obeys;

import com.solid.obeys.dip.CarType;
import com.solid.obeys.dip.ElectricCarManufacture;
import com.solid.obeys.dip.ManualCarManufacture;

//obeys dependancy inversion principle
public class CarManufacture {

	
	public static void main(String[] args) {
		CarType type_manual=new CarType(new ManualCarManufacture());
		System.out.println("------------Dependency Inversion Principle--------------");
		CarType type_auto=new CarType(new  ElectricCarManufacture());

	}

}
