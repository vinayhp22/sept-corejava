class UnaryOperators{
	public static void main(String[] args){
		int num = 10;
		System.out.println(num++); //post-increment  //10
			// first used, then it'll increase by 1
		System.out.println(num); //11
		
		System.out.println(++num); //pre-increment  // 12
			// first increase by 1, then used
		System.out.println(num); //12
		
		System.out.println(num--); //post-decrement  //12
			// first used, then it'll decrease by 1
		System.out.println(num); //11
		
		System.out.println(--num); //pre-decrement  // 10
			// first decrease by 1, then used
		System.out.println(num); //10
		
		
	}
}