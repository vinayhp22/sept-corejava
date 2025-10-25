//Eg: Correct Initialization
class Test{
	public static void main(String[] args){
		int x; //local variable 
		if(args.length > 0){
			x = 10;
		} else {
			x = 20;
		}
		System.out.println(x); 
	}
}

//java Test ->20
//java Test Ajay -> 10
