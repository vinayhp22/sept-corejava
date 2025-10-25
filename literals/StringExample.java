class StringExample{
	public static void main(String[] args){
	
		String name = "Vtech";
		
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(4));
		//System.out.println(name.charAt(5)); 
		//R.E: StringIndexOutOfBoundsException
		
		System.out.println(name); 

		name = "Vtech "+"Integrated";
		
		
		System.out.println(name.concat(" Solutions")); 
		System.out.println(name.contains("Vtech"));
		System.out.println(name.length()); 

		
		

	
	



	}
}