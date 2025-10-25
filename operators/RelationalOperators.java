class RelationalOperators{
	public static void main(String[] args){
		int x = 10;
		int y = 11;
		
		if(x>y){ //10>11 - false
			System.out.println("X is greater than y");
		} else {
			System.out.println("Y is greater than X");
		}

		System.out.println(10<11); //true
		System.out.println('a'<11.5); //97<11.5 //false
		System.out.println('a'>'b'); //97>98 //false
		
		//System.out.println(true>false); //C.E: bad operand types for binary operator '>'
		//System.out.println("Vtech">="Vtech"); ////C.E: bad operand types for binary operator '>='
		//System.out.println(10>20>30); //C.E: bad operand types for binary operator '>'
		
		double marks = 99.99;
		if(marks > 35){ //true
			System.out.println("Passed");
		}
	}
}