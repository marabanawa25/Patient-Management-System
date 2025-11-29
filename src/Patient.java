// Patient.java - Subclass 1 (Inheritance)
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private String patientID;
    private String disease;
    private String medicine;
    private Doctor assignedDoctor;
    private LocalDate appointmentDate;
    private List<Visitor> visitors;
    
    // Constructor
    public Patient(String name, int age, String address, String contactNumber, 
                   String patientID, String disease, String medicine) {
        super(name, age, address, contactNumber);
        this.patientID = patientID;
        this.disease = disease;
        this.medicine = medicine;
        this.visitors = new ArrayList<>();
    }
    
    // Getters and Setters
    public String getPatientID() {
        return patientID;
    }
    
    public String getDisease() {
        return disease;
    }
    
    public void setDisease(String disease) {
        this.disease = disease;
    }
    
    public String getMedicine() {
        return medicine;
    }
    
    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    
    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }
    
    public void setAssignedDoctor(Doctor doctor) {
        this.assignedDoctor = doctor;
    }
    
    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }
    
    // Method Overloading (Polymorphism) - Schedule appointment with date string
    public void scheduleAppointment(String dateString) throws IllegalArgumentException {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(dateString, formatter);
            scheduleAppointment(date);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Use yyyy-MM-dd format.");
        }
    }
    
    // Method Overloading - Schedule appointment with LocalDate
    public void scheduleAppointment(LocalDate date) throws IllegalArgumentException {
        if (date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Appointment date cannot be in the past.");
        }
        this.appointmentDate = date;
        if (assignedDoctor != null) {
            System.out.println("✓ Appointment scheduled successfully for " + date + " with Dr. " + assignedDoctor.getName());
        } else {
            System.out.println("✓ Appointment scheduled successfully for " + date + " (Doctor to be assigned)");
        }
    }
    
    // Add visitor
    public void addVisitor(Visitor visitor) {
        try {
            if (visitor == null) {
                throw new IllegalArgumentException("Visitor cannot be null.");
            }
            visitors.add(visitor);
            System.out.println("✓ Visitor " + visitor.getName() + " added successfully to patient " + getName());
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error adding visitor: " + e.getMessage());
        }
    }
    
    // Get medical history
    public String getMedicalHistory() {
        StringBuilder history = new StringBuilder();
        history.append("Name: ").append(getName()).append("\n");
        history.append("Age: ").append(getAge()).append("\n");
        history.append("Address: ").append(getAddress()).append("\n");
        history.append("Contact: ").append(getContactNumber()).append("\n");
        history.append("Disease: ").append(disease).append("\n");
        history.append("Medicine: ").append(medicine).append("\n");
        history.append("Doctor: ").append(assignedDoctor != null ? assignedDoctor.getName() : "Not Assigned").append("\n");
        history.append("Appointment: ").append(appointmentDate != null ? appointmentDate : "Not Scheduled").append("\n");
        return history.toString();
    }
    
    public List<Visitor> getVisitors() {
        return visitors;
    }
    
    // Method Overriding (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("\n=== PATIENT INFORMATION ===");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Contact: " + getContactNumber());
        System.out.println("Disease: " + disease);
        System.out.println("Medicine: " + medicine);
        System.out.println("Doctor: " + (assignedDoctor != null ? assignedDoctor.getName() : "Not Assigned"));
        System.out.println("Appointment: " + (appointmentDate != null ? appointmentDate : "Not Scheduled"));
        System.out.println("Number of Visitors: " + visitors.size());
    }
}
