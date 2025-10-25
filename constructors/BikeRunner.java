class BikeRunner{
	public static void main(String[] args){
		Bike bike1 = new Bike();// no-args constructor
		bike1.display();
		
		Bike bike2 = new Bike("Pulser NS 200");
		bike2.display();
		
		Bike bike3 = new Bike("Hayabuzza 1200", 250);
		bike3.display();
		
		Bike bike4 = new Bike("Splender plus", 90, 75, 90, 120000);
		bike4.display();
	}
}