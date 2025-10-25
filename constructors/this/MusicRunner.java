class MusicRunner{

	public static void main(String[] args){
		Music music = new Music("Bangle Bangari");
		music.display();
		
		Music music1 = new Music("Munagru Male", "Kannada");
		music1.display();
		
		Music music2 = new Music("Perfect", "English", "Western");
		music2.display();
		
		Music music3 = new Music("Jaya Gana Mana", "Sanscrit", "Classic", 52);
		music3.display();
		
		Music music4 = new Music(music3);
		music4.display();
	}
}