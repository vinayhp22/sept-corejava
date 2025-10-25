class StringConcatenation{

	public static void main(String[] args){
		System.out.println(10+20); //30
		String name = "Ajay";
		int b = 10, c = 20, d = 30;
		
		System.out.println(name + b + c + d); //Ajay102030
		
		System.out.println(b + name +  c + d); //10Ajay2030
		
		System.out.println(b +  c + name + d); //30Ajay30
		
		System.out.println(b +  c + d + name); //60Ajay
		
		//name = b +  c + d; //incompatible types
							//found: int
							//required: java.lang.String
		name = name + b + c + d; //Ajay102030 //valid
		
		
		b = name + c + d; //Ajay2030 //incompatible types
							//found: java.lang.String
							//required: int
		b = b + c + d; // 60 //valid
		
		System.out.println(name);
	}
}