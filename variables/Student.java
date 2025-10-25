class  Student {
	String name;
	static String collge;
	public static void main(String[] args){
		System.out.println(Student.collge); //Recommended
		Student student = new Student();
		Student student1 = new Student();
		System.out.println(student.collge); //Allowed
		Student.college = "ABC College";
		System.out.println(Student.collge); //ABC College
		System.out.println(student.collge); //ABC College
		System.out.println(student.name);
		System.out.println(student1.name);
	}
}
	