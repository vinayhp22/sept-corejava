class WhileExample{
	static boolean bool;
	public static void main(String[] args){
		System.out.println(bool);
		//while(1){ //C.E: Incompatible types
			//System.out.println("This is while block");
		//}
		// Correct Way
		/*
		while(boolean){
			System.out.println("This is while block");
		}
		*/
		int i =1;
		while(i<5){
			System.out.println
			("This is while block with i = "+i);
			i++;
		}
	}
}