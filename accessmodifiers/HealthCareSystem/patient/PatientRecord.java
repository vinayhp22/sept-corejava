//file: patient/PatientRecord.java

package patient;

class PatientRecord{
	private boolean medicalHistory = true;
	
	private void showMedicalHistory(){
		System.out.println("Medical History available: "+medicalHistory);
	}
	public void consult(){
		System.out.println("Doctor checked patient via medical history..");
	}
}

Task: for Protected accessModifier

1. HRSystem(project)
	hr(package) - Employee(name, salary - protected fields), HRService
	payroll(package) - Manager extends Employee, PayrollService
2. UniversityApp(Project)
	university(package) -Pesron(name - protected), UniversityService
	student(package) - Student extends Person, StudentService

3. TransportSystem(Project)
	transport(package) - Vehicle(speed - protected), TransportService
	logistics(package) - Truck extends Vehicle, LogisticsService