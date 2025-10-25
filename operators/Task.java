class Task{

	public static void main(String[] args){
		int x=100, y=110, z = 120, a = 10, b = 20, c = 30;
		//int res = x-- + --x; // 198
		//int res1 = x++ - ++y + z++ - --a + b-- - --c; //91
					//100 - 111 + 120 - 9 + 20 - 29; //91
		//int res2 = ++x + y++ - ++z + a-- - --b + c--;
					//101 + 110 - 121 + 10 - 19 + 30 //111
		//int res3 = x-- + --y + z++ + a++ + ++b + c++;
					//100 + 109 + 120 + 10 + 21 + 30 //390
		double n = 10f;
		float res = (float)(n + 1); //10.0 + 1.0 = 11.0
		
		System.out.println(res);
		
	
	}
}