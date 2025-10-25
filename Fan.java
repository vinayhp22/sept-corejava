public class Fan {
	private String company;
	int markeingRatePrice;
	double PI = 3.14;
	int MAX_USERS = 100;
	String DATABASE_URL = "localhost";
	
	
	// This is single line comment
	/* 
		This 
		is
		multi-line
		comment
	*/
	
	
	
	public int rotateFan(){
		System.out.println("Rotating");
		return 100;
	}
	
	public void setCompany(String companyName){
		this.company = companyName;
	}
	
	public String getCompany(){
		return this.company;
	}
	
	public void switchOnOrOff(){
	
	}
	MyClass and myclass
	
	
		
	public static void main(String args[]){
		System.out.println(100+200);
		System.out.println("100"+"200");
		
		Fan ref = new Fan();
		int value = ref.rotate();
		System.out.println("value: "+ value);
	} 

} 

getDetails(), calculateSalary(), printReport() 