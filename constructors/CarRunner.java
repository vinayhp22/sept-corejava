class CarRunner{
	public static void main(String[] args){
		Car car = new Car();  
		car.display();
		
		Car car1 = new Car("Volvo");  
		car1.display();
		
		Car car2 = new Car("BMW", 200);
		car2.display();
		
		Car car3 = new Car(car2);
		car3.display();
		
		Car car4 = new Car(new Car("Jaguar", 250));
		car4.display();
	}	
}

//Output: Brand: null, speed: 0
	   // Brand: Volvo, Speed: 200
	   // Brand: BMW, Speed: 200
	   // Brand: BMW, Speed: 200
	   // Brand: Jaguar, Speed: 250
