//file: admin/Admin.java
package admin;

import studentmngtsystem.StudentService;

class Admin{
	public static void main(String[] args){
		StudentService st = new StudentService();
		st.addStudent();
	}
}

//Execution
// javac studentmngtsystem/StudentService.java admin/Admin.java
// java admin.Admin