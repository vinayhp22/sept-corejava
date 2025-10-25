class MovieTicketsRunner{

	public static void main(String[] args){
		MovieTickets mt1 = new MovieTickets();
		
		
		MovieTickets mt = new MovieTickets("Kantara Chaptar 1", 1000, new int[]{111,112}, 2);
		System.out.println(mt.movieName); //null
		System.out.println(mt.price);
		for(int i = 0; i<mt.seatNumbers.length; i++){
			System.out.println(mt.seatNumbers[i]);
		}
		System.out.println(mt.seatsBooked);
		
		System.out.println("==================================");

		MovieTickets c = new MovieTickets(mt);
		System.out.println(c.movieName); //null
		System.out.println(c.price);
		for(int i = 0; i<c.seatNumbers.length; i++){
			System.out.println(c.seatNumbers[i]);
		}
		System.out.println(c.seatsBooked);
	}
	
}
