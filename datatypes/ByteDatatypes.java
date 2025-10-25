class ByteDatatypes{
	public static void main(String[] args){
		byte b = 0;
		byte b1 = 127;
		// byte b2 = 128; // C.E: incompatible types
		byte b3 = 0b00000101; //5
		byte b4 = 'a';
		byte b5 = -1b11111011;
		System.out.println(b); //0
		System.out.println(b1); //127
		System.out.println(b3); //5
		System.out.println(b4); //97
		System.out.println(b5); 
	}
}