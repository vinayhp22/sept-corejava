class ArithmaticOperators{

	public static void main(String[] args){
	
		//System.out.println(10/0);
		//R.E: Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		System.out.println(10/0.0); //Infinity
		System.out.println(-10/0.0); //-Infinity
		System.out.println(Double.POSITIVE_INFINITY); //Infinity
		System.out.println(Double.NEGATIVE_INFINITY); //-Infinity
		
		//System.out.println(0/0); //ArithmeticException: / by zero
		
		System.out.println(0.0/0.0); //NaN (Not a Number)
		System.out.println(-0.0/0.0); //NaN (Not a Number)
		
		System.out.println(10 < Double.NaN); //false
		System.out.println(10 > Double.NaN); //false
		System.out.println(10 == Double.NaN); //false
		System.out.println(Double.NaN == Double.NaN); //false
		System.out.println(Double.NaN != Double.NaN); //true
		
		System.out.println(10%0); //ArithmeticException: / by zero
		
	}
}