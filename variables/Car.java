class Car{
	String name;
	String color;
	public Car(){}

	public Car(String name, String color){
		this.name = name;
		this.color = color;
	}

	void showColor(){
		System.out.println("The color of "+ name +" car is: "+color);
	}

	

	public static void main(String[] args){
		Car nano = new Car();
		nano.name = "Nano";
		nano.color = "Red";

		Car bmw = new Car();
		bmw.name = "BMW";
		bmw.color = "White";

		Car thar = new Car();
		thar.name = "Thar";
		thar.color = "Black";

		nano.showColor();
		bmw.showColor();
		thar.showColor();

		Car rollsroyals = new Car("Rolls royals", "Gold");
		rollsroyals.showColor();
	}
}
