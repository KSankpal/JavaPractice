package MultilevelInheritance;

public class CarMain {

	public static void main(String[] args) {
		//Car car = new Car();
		//AudiCar audiCar = new AudiCar();
		Model model = new Model();
		model.Doors();
		model.Seats();
		model.wheels();
		model.print();
		model.modelName1();
		model.modelName2();
		model.modelName3();

	}

}
