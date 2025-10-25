class LiteralsExample{
	public static void main(String[] args){
		long x = 10;
		short x1 = 010;
		int x2 = 0x10;
		int x3 = 0xFAF;
		float f1 = 010; // 8.0
		byte  b2 = 'a'; //97
		short b1 = 'a'; //97
		int i = 'a'; //97
		long l = 'a'; //
		double d = 010.10;
		double d5 = 10001e-1; 
		
		//byte ex1 = 10e1; //100
		//short ex2 = 10e2; //1000
		//int ex3 = 10e2; //1000
		//long ex4 = 10e3; // 10000
		
		float ex1 = 10e1f;
		float ex5 = 10e31f;
		float exf1=10001e-1f; // 1000.1
		double ex6 = 10e2;
		
		System
		.out
		.println(x);
		System.out.println(ex1);
		System.out.println(ex5);
		System.out.println(exf1);
		System.out.println(ex6);
		System.out.println(exf1);
		System.out.println("=====================");
		
		
		char char1 = 'A';
		char char2 = ' ';
		System.out.println(char1);
		System.out.println(char2);
		char char3 = 65; //A
		char char4 = 25000;
		
		//range: '\u0000' to '\uffff'
		char char5 = '\u9090';
		System.out.println(char5);
		char char6 = '\uffff';
		System.out.println((int)char6);

		char char7 = '\n';
		char char8 = '\t';
		char char9 = '\r';
		char char10 = '\f';
		char char11 = '\b';
		char char12 = '\'';
		char char13 = '\"';
		char char14 = '\\';
		
		//char char = '/a'; -> invalid: forward slash not allowed

		System.out.println("Newline: "+char7);
		System.out.println("Tab: "+char8+"1");
		System.out.println("Carriage Return: "+char9+"Vtech");
		System.out.println("Form: "+char10);
		System.out.println("Backspace:"+char11+"1");
		System.out.println(char12);
		System.out.println(char13);
		System.out.println(char14);
		
		
		System.out.println("\'Welcome \n to \n Vtech\'");
		
		
		
		int bin = 0b11; //3
		int bin1 = -0b11; //-3
		System.out.println(bin); //
		System.out.println(bin1); //
		
		//1,11,000 rs -> 1_11_000
		int us = 12_34_567;
		double us1 = 12_34_567.67_67;
		//int us3 = _12; //C.E:  cannot find symbol
		//int us4 = 12_; //illegal underscore
		//double us5 = _12_34_567.67_67; //C.E : ';' expected
		double us5 = 12_34_567_.67_67; //C.E : ';' expected
		
		System.out.println(us);
		System.out.println(us1);

	}
}