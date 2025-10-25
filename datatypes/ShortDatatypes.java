class ShortDatatypes{
	public static void main(String[] args){
		byte b = 0;
		byte b1 = 127;
		// byte b2 = 128; // C.E: incompatible types
		byte b3 = 0b00000101; //5
		byte b4 = 'a'; // 97
		byte b5 = false; //C.E: incompatible types
		byte b6 = "Vtech"; //C.E: incompatible types
							// found: java.lang.String
							//required: byte
	}
}