//file: patient/DoctorService.java

package patient;

class DoctorService{
	public static void main(String[] args){
		PatientRecord patientRecord = new PatientRecord();
		patientRecord.consult();
		//patientRecord.showMedicalHistory(); 
		//C.E: showMedicalHistory() has private access in PatientRecord
		//patientRecord.medicalHistory; //C.E: not a statement
		
	}
}

// Base-Package(HealthCareSystem)>javac patient/PatientRecord.java patient/DoctorService.java

// Base-Package(HealthCareSystem)>java patient.DoctorService