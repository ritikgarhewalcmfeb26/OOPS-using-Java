/*8. Hospital Patient Record System
Create a simple patient management program.
Requirements
 Create a class Patient with:
 patient ID
patient name
 age
disease
Create objects for at least 3 patients.
Display patient details.
Add a method to check whether the patient is a senior citizen */

import java.util.Scanner;

class Patient {
	int patientId;
	String patientName;
	int age;
	String disease;


	public Patient(int patientId, String patientName, int age, String disease) {

		this.patientId = patientId;
		this.patientName = patientName;
		this.age= age;
		this.disease = disease;
	}

	public boolean isSeniorCitizen() {

		return this.age >= 60;
	}

	public void displayDetails() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + patientName);
	
	if (isSeniorCitizen()) {
		System.out.println("Age        : " + age + " (Senior Citizen)");
	} 
	else {
		System.out.println("Age        : " + age);
	}

	System.out.println("Disease    : " + disease);

 }
}

class Question_8{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		Patient[] patients = new Patient[3];
		System.out.println("=== Hospital Patient Record System ===");
		for (int i = 0; i < patients.length; i++) {
			System.out.println("\n--- Enter details for Patient " + (i + 1) + " ---");
			System.out.print("Enter Patient ID: ");
			int id = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Enter Patient Name: ");
			String name = scanner.nextLine();

			System.out.print("Enter Patient Age: ");
			int age = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Enter Disease: ");
			String disease = scanner.nextLine();
			
			patients[i] = new Patient(id, name, age, disease);
		}
		  System.out.println("\n\n=== Registered Patient Records ===");
        System.out.println("----------------------------------------");
        
        for (Patient patient : patients) {
            patient.displayDetails();
        }
        scanner.close();
	}
}