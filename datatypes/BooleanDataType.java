class BooleanDataType{
	public static void main(String[] args){
		boolean b = true;
		boolean b1 = false;
		
		//boolean b2 = True; //C.E: cannot find symbol
		//boolean b3 = "true"; //C.E: incompatible types
		//boolean b4 = 0; //C.E: incompatible types 
		//boolean b5 = 1; //C.E: incompatible types
		
		//if(0){ //C.E: Incompatible types
			System.out.println("This is if block");
		//} else {
			System.out.println("This is else block");
		//}
		//Correct Way
		if(true){
			System.out.println("This is if block"); 
			//This is if block
		} else {
			System.out.println("This is else block");
		}
		if(false){
			System.out.println("This is if block"); 
		} else {
			System.out.println("This is else block");
			// This is else block
		}
		//while(1){ //C.E: Incompatible types
			//System.out.println("This is while block");
		//}
		// Correct Way
		do{
			System.out.println("This is while block");
		} while(true);
		
		while(false){
			System.out.println("This is while block");
		}
	}
	
	{
		
	}

}