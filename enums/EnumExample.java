class EnumExample{
	public static void main(String[] args){
		// Day today = "Monday";
		Day today = Day.MONDAY;
		
		System.out.println(today);
		
		System.out.println("All days of the week");
		Day[] days = Day.values();
		//Day[] days = {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
	// FRIDAY, SATURDAY};
		for(int i = 0; i<days.length; i++){
			System.out.println(days[i]);
		}
	}
}