class CarDriver{
	public static void main(String[] args){
		Car car = new Car(); //Object Creation/Instatiation
		car.brand = "Mahindra";
		car.speed = 140;
		car.drive(); //Mahindra is driving at 140 kmph
		
		Car car1 = new Car(); //Another Object Creation
		car1.brand = "Rolls Roys";
		car1.speed = 200;
		car1.drive(); //Rolls Roys is driving at 200 kmph
	}
}

