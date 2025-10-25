class Laptop{
	public String brand;
	
	public Laptop(){
		this("Dell"); //calling another construtor
	}
	
	public Laptop(String brand){
		this.brand = brand;
	}
	
	public void display(){
		System.out.println("Brand: "+this.brand);
	}
	
}