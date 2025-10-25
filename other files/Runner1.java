class Runner1{
	long mobile;
	static String email;
	
	public Runner1(){
		System.out.println("Runner1 constructor is running");
	}
	public static void run(){  //staric method = class-level
		String greet = "Welcome";
		int year = 2025;
		System.out.println(greet);
		System.out.println(year);
			
	}
	public void start(){ //instance method = object level
		String month = "Sept";
		int date = 10;
		System.out.println(month);
		System.out.println(date);
	}
	public static void main(String[] args){
		int age = 22; //primitive variable
		String name = "Ajay"; //Reference variable
		int x = 10; //declaration
		System.out.println(x); 
		// local must & should initialize at the time of declaration
		//C.E : variable x might not have been initialized
		
		System.out.println(age);
		System.out.println(name);
		run();
		//Object Creation / instanciation
		Runner1 obj = new Runner1();
		obj.start();
		
		Runner1 obj1 = new Runner1();
		obj.start();

		System.out.println("obj: "+obj.mobile);
		System.out.println("obj1: "+obj1.mobile);
		obj.mobile = 9796669867L;
		obj1.mobile = 98298299296L;
		System.out.println("obj: "+obj.mobile);
		System.out.println("obj1: "+obj1.mobile);
	}
	
	

}