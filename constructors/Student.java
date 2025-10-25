class Student {
	int rollNo;
	String name;
	
	//Constructor
	Student(int r, String n){
		rollNo = r;
		name = n;
	}
	
	//Method
	void display(){
		System.out.println("Name: "+ name + ", Roll No.: "+rollNo);	
	}

}
