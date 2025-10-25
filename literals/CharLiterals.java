class CharLiterals{
	public static void main(String[] args){
		//16bit unicode single characters
		char c = 'A'; //A
		char c1 = 65; //A
		//char c2 = "a"; //C.E: Incompatible types
		//char c3 = 'ab'; //C.E: unclosed character literal 
		//char c4 = a; // C.E: cannot find symbol
		
		
		char ch = 97; //a
		char ch1 = 98; //b55
		char ch2 = 055; //(45)->-
		char ch3 = 0125; //U
		int ch4 = 0xFace; //64206
		
		System.out.println(ch);
		System.out.println(ch4);
	
	
	
	}
}
