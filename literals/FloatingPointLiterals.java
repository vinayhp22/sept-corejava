class FloatingPointLiterals{
	public static void main(String[] args){
		float f = 10.5f;
		double d = 10.5;
		float f = 10.5; //C.E: Incompatible types
		double d = 10.5d;
		
		float f1 = 010; //8.0
		float f2 = 0xFACE; //64206.0
		float f3 = 10.5; //C.E: Incompatible types
		double d1 = 123.456;
		float f8 = 0123.456; //123.456
		double d2 = 123.456; // valid(not a octal)
		//double d3 = 0x123.456; // C.E 
					//malformed floating-point literal
		
		System.out.println(d1); // 123.456
		System.out.println(d2); // 123.456
		
		double d4 = 0xFACE; //64206.0
		//valid - hex(integer) assigned to double
		float f4 = 0xFACE; //hex(integer) //64206.0
		System.out.println(f4);
		
		//exponential Notatation(Scientific Notatation)
		// e or E to represents powers of 10
		//10e2 = 10 * 10^2 = 1000
		
		float f5 = 10e2f;// 10 * 10^2 = 1000.0
		float f6 = 10e-2f; // 10 * 10^12 = 10^-1 = 0.1
		
		System.out.println(f5);
		//int i = 10e2;
		//System.out.println(i);

	}
}