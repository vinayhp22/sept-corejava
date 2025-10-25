class StudentRunner{
	public static void main(String[] args){
		Student student = new Student();
		student.id = 101;
		student.name = "Rishab Shetty";
		student.display(); //ID: 101, Name: Rishab Shetty
		
		Student student1 = new Student();
		student1.id = 102;
		student1.name = "Rukmini Vasanth";
		student1.display(); //ID: 102, Name: Rukmini Vasanth
	}
}