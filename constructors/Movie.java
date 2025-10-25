class Movie{
	String name;
	String hero;
	
	
	Movie(){}
	
	Movie(String n){
		name = n;
	}
	
	Movie(String n, String h){
		name = n;
		hero = h;
	}
	
	Movie(Movie m){
		name = m.name;
		hero = m.hero;
	}

	void display(){
		System.out.println("Name: "+ name+ ", Hero: "+hero);
	}
}