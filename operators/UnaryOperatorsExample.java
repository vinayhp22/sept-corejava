class UnaryOperatorsExample{
	public static void main(String[] args){
		System.out.println("y=x++");
		int x = 10, y = x++;
		System.out.println("y = "+y + "x = "+x);
		
		System.out.println("y=++x");
		x = 10; y = ++x;
		System.out.println("y = "+y + "x = "+x);
		
		System.out.println("y=x--");
		x = 10; y = x--;
		System.out.println("y = "+y + "x = "+x);
		
		System.out.println("y=--x");
		x = 10; y = --x;
		System.out.println("y = "+y + "x = "+x);

		
		
		
	}
}