class UnaryOperator{
	public static void main(String[] args){
		
		byte b = 100;
		
		//b = b+1; //C.E: incompatible types: possible lossy conversion from int to byte
		b = (byte)(b+1); //Explicit casting required
		
		System.out.println(b); //101
		
		byte b1 = 100;
		b1++; // Implicit casting done automatically
		System.out.println(b1); //101
		
		char s = 10;
		s = (char)(s + 1);
		System.out.println(s); //11
		
		int a1 = 2, a2 = 3;
		int res = a1++ + ++a2;  // 2 + 4 = 6
		System.out.println(res); //6
		System.out.println(a1); //3
		System.out.println(a2); //4
	}
}	
	
	