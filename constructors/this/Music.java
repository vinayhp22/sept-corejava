public class Music{
	String name;
	String language;
	String type;
	double length;
	
	public Music(){
		System.out.println("No-args const called...");
	}
	
	public Music(String name){
		this();
		this.name = name;
	}
	
	public Music(String name, String language){
		this(name);
		this.language = language;
	}
	
	public Music(String name, String language, String type){
		this(name, language);
		this.type = type;
	}
	
	public Music(String name, String language, String type, double length){
		this(name, language, type);
		this.length = length;
	}
	
	public Music(Music music){
		this(music.name, music.language, music.type, music.length);
	}
	
	public void display(){
		System.out.println("Name: "+this.name+", Language: "+this.language+", Type: "+this.type+", length: "+this.length);
	}
}