class Car{
	String brand;
	int speed;

	Car(){}
	Car(String b, int s){
		brand = b;
		speed = s;
	}
	
	Car(String b){
		brand = b;
	}
	
	//Copy Constructor
	Car(Car car){
		brand = car.brand;
		speed = car.speed;
	}
	
	void display(){
		System.out.println("Brand: "+ brand + ", Speed.: "+speed);	
	}
}
