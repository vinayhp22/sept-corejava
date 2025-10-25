class Calculator{
	//int square(int x){
	//	return x * x;
	//}
	
	static int cube(int x){
		return x*x*x;
	}
	
	public static void main(String[] args){
		//Calculator calcalator = new Calculator();
		//int result = calcalator.square(2);
		//System.out.println(result);
		
		int result = Calculator.cube(3);
		System.out.println(result);
	}
}