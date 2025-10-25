class LongDataType{
	static int age;
	static byte b;
	static short s;
	static long x;	
	public static void main(String[] args){
		float x = 22/7;
		double y = 22/7;
		System.out.println(x); //3.0
		System.out.println(y); //3.0
		float x1 = 22/7F;
		double y1 = 22/7D;
		System.out.println(x); //3.142857
		System.out.println(y); //3.142857142857143
		float f = 3.142857; 
		double d = 3.142857142857143;
		System.out.println(f);
		System.out.println(d);
	}
}