// Doctor.java - Subclass 2 (Inheritance)
import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
    private String doctorID;
    private String specialization;
    private List<Patient> assignedPatients;
    
    // Constructor
    public Doctor(String name, int age, String address, String contactNumber, 
                  String doctorID, String specialization) {
        super(name, age, address, contactNumber);
        this.doctorID = doctorID;
        this.specialization = specialization;
        this.assignedPatients = new ArrayList<>();
    }
    
    // Getters and Setters
    public String getDoctorID() {
        return doctorID;
    }
    
    public String getSpecialization() {
        return specialization;
    }
    
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    // Assign patient to doctor
    public void assignPatient(Patient patient) {
        try {
            if (patient == null) {
                throw new IllegalArgumentException("Patient cannot be null.");
            }
            if (!assignedPatients.contains(patient)) {
                assignedPatients.add(patient);
                patient.setAssignedDoctor(this);
                System.out.println("✓ Patient " + patient.getName() + " assigned to Dr. " + getName());
            } else {
                System.out.println("⚠ Patient already assigned to this doctor.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error assigning patient: " + e.getMessage());
        }
    }
    
    // View all patients
    public void viewPatients() {
        System.out.println("\n=== PATIENTS ASSIGNED TO DR. " + getName().toUpperCase() + " ===");
        if (assignedPatients.isEmpty()) {
            System.out.println("No patients assigned yet.");
        } else {
            for (int i = 0; i < assignedPatients.size(); i++) {
                Patient p = assignedPatients.get(i);
                System.out.println((i + 1) + ". " + p.getName() + " - Disease: " + p.getDisease());
            }
        }
    }
    
    // Update patient medicine
    public void updatePatientMedicine(Patient patient, String newMedicine) {
        try {
            if (patient == null) {
                throw new IllegalArgumentException("Patient cannot be null.");
            }
            if (!assignedPatients.contains(patient)) {
                throw new IllegalArgumentException("Patient is not assigned to this doctor.");
            }
            patient.setMedicine(newMedicine);
            System.out.println("✓ Medicine updated successfully for patient: " + patient.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error updating medicine: " + e.getMessage());
        }
    }
    
    public List<Patient> getAssignedPatients() {
        return assignedPatients;
    }
    
    // Method Overriding (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("\n=== DOCTOR INFORMATION ===");
        System.out.println("Name: Dr. " + getName());
        System.out.println("Specialization: " + specialization);
        System.out.println("Assigned Patients: " + assignedPatients.size());
    }
}
