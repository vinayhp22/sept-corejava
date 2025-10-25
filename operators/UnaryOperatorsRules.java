class UnaryOperatorsRules{
	public static void main(String[] args){
		//int y = ++10; //error: unexpected type
		//System.out.println(++10); // error: unexpected type
			//1. allows only variables, not contants
			
		//int x = 10;
		//int y = ++(++x); //error: unexpected type
			//2.nesting is not allowed
		//final int x = 10;
		//x++; //error: cannot assign a value to final variable x
		//3. final variable is not allowed
		
		byte x = 10;
		x++;
		System.out.println(x); //11
		short x1 = 10;
		x1++;
		System.out.println(x1); //11
		double x2 = 10.5;
		x2++;
		System.out.println(x2); //11.5
		char c = 'A'; //65
		c++; //66
		System.out.println(c); //'B'
		boolean b = true;
		b++;
		
		
	
	
	}
	
}