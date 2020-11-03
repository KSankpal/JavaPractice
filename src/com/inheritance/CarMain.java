package com.inheritance;

public class CarMain {

	public static void main(String[] args) {
		AudiCar audiCar = new AudiCar();
		audiCar.modelName1();
		audiCar.modelName2();
		audiCar.modelName3();
		audiCar.Seats();
		audiCar.wheels();
		audiCar.Doors();
		
		BMWCar bmwCar = new BMWCar ();
		bmwCar.modelName1();
		bmwCar.modelName2();
		bmwCar.modelName3();
		bmwCar.Seats();
		bmwCar.Doors();
		bmwCar.wheels();
		
		VolkswagenCar volkswagenCar = new VolkswagenCar();
		volkswagenCar.modelName1();
		volkswagenCar.Doors();
		volkswagenCar.Seats();
		volkswagenCar.wheels();
		
		KIACar kiaCar = new KIACar();
		kiaCar.modelName1();
		kiaCar.Doors();
		kiaCar.wheels();
		kiaCar.Seats();
		
		



	}

}
