import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Visitor extends Person {
    private String visitorID;
    private String patientRelation;
    private List<LocalDate> visitDates;
    private Patient associatedPatient;

    public Visitor(String name, int age, String address, String contactNumber,
                   String visitorID, String patientRelation) {
        super(name, age, address, contactNumber);
        this.visitorID = visitorID;
        this.patientRelation = patientRelation;
        this.visitDates = new ArrayList<>();
    }

    public String getVisitorID() {
        return visitorID;
    }

    public String getPatientRelation() {
        return patientRelation;
    }

    public void setPatientRelation(String patientRelation) {
        this.patientRelation = patientRelation;
    }

    public Patient getAssociatedPatient() {
        return associatedPatient;
    }

    public void setAssociatedPatient(Patient patient) {
        this.associatedPatient = patient;
    }

    public void checkInVisit(String dateString) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(dateString, formatter);
            checkInVisit(date);
        } catch (DateTimeParseException e) {
            System.out.println("✗ Error: Invalid date format. Use yyyy-MM-dd format.");
        }
    }

    public void checkInVisit(LocalDate visitDate) {
        try {
            if (visitDate.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Visit date cannot be in the future.");
            }
            if (associatedPatient == null) {
                throw new IllegalArgumentException("Visitor must be associated with a patient.");
            }
            visitDates.add(visitDate);
            System.out.println("✓ Visit checked in successfully for " + getName() + " on " + visitDate);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error checking in visit: " + e.getMessage());
        }
    }

    public void getVisitHistory() {
        System.out.println("\n=== VISIT HISTORY FOR " + getName().toUpperCase() + " ===");
        if (visitDates.isEmpty()) {
            System.out.println("No visit history available.");
        } else {
            for (int i = 0; i < visitDates.size(); i++) {
                System.out.println((i + 1) + ". Visit Date: " + visitDates.get(i));
            }
        }
    }

    public List<LocalDate> getVisitDates() {
        return visitDates;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n=== VISITOR INFORMATION ===");
        System.out.println("Visitor ID: " + visitorID);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Contact: " + getContactNumber());
        System.out.println("Relation to Patient: " + patientRelation);
        System.out.println("Associated Patient: " + (associatedPatient != null ? associatedPatient.getName() : "Not Set"));
        System.out.println("Total Visits: " + visitDates.size());
    }
}