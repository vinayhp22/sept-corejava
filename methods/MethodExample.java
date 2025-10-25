class MethodExample{
	static int add(int x, int y){
		int z = x+y;
		return z;
	}
	
	public static void main(String[] args){
		int result = add(10, 20);
		System.out.println(result);	
		double sqrt1 =  Math.sqrt(25);
		System.out.println(sqrt1);	
		
		
		System.out.println(); -> prints output
		Math.sqrt(25); -> returns square root
	}
	
	void greet(){
		System.out.println("Hello World!!!");
	}	
}