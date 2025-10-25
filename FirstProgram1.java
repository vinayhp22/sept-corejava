public class Fan {
	
	public int rotate(){
		System.out.println("Rotating");
		return 100;
	}
	
	
		
	public static void main(String args[]){
		System.out.println(100+200);
		System.out.println("100"+"200");
		
		Fan ref = new Fan();
		ref.rotate();
	} 

} 