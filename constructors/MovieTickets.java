class MovieTickets{
	String movieName;
	double price;
	int[] seatNumbers;
	int seatsBooked;

	MovieTickets(){
		System.out.println("No- arguments constructor");
	}
	MovieTickets(String movieName){
		this();
		this.movieName=movieName;
	}
	MovieTickets(String movieName, double price){
		this(movieName);
		this.price = price;
	}
	MovieTickets(String movieName, double price, int[] seatNumbers){
		this(movieName, price);
		this.seatNumbers = seatNumbers;
	}
	MovieTickets(String movieName, double price, int[] seatNumbers, int seatsBooked){
		this(movieName, price, seatNumbers);
		this.seatsBooked = seatsBooked;
	}
	MovieTickets(MovieTickets movieTickets){
		this(movieTickets.movieName, movieTickets.price, movieTickets.seatNumbers, movieTickets.seatsBooked);
	}
	

}