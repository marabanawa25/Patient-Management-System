import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PatientManagementSystem {
    private static final String USERNAME = "code of silence";
    private static final String PASSWORD = "AMT3";
    private static List<Patient> patientList = new ArrayList<>();
    private static List<Doctor> doctorList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeDoctors();
        if (!login()) {
            System.out.println("Access Denied! Exiting system...");
            return;
        }

        boolean running = true;
        while (running) {
            running = displayMainMenu();
        }

        scanner.close();
        System.out.println("\n✓ Logged out successfully. Thank you for using Patient Management System!");
    }

    private static boolean login() {
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║   PATIENT MANAGEMENT SYSTEM    ║");
        System.out.println("╚════════════════════════════════╝\n");

        int attempts = 0;
        int maxAttempts = 3;

        while (attempts < maxAttempts) {
            try {
                System.out.print("Username: ");
                String inputUsername = scanner.nextLine();

                System.out.print("Password: ");
                String inputPassword = scanner.nextLine();

                if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                    System.out.println("\n✓ Login Successful! Welcome to the system.\n");
                    return true;
                } else {
                    attempts++;
                    System.out.println("\n✗ Invalid credentials. Attempt " + attempts + " of " + maxAttempts);
                    if (attempts < maxAttempts) {
                        System.out.println("Please try again.\n");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error during login: " + e.getMessage());
                attempts++;
            }
        }

        return false;
    }

    private static void initializeDoctors() {

    }

    private static boolean displayMainMenu() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║           MAIN MENU                   ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("1. Add Patient");
        System.out.println("2. View All Patients");
        System.out.println("3. Search Patient by Name");
        System.out.println("4. Logout");
        System.out.print("\nEnter your choice: ");

        try {
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    registerPatient();
                    break;
                case 2:
                    viewAllPatients();
                    break;
                case 3:
                    searchPatientByName();
                    break;
                case 4:
                    System.out.println("\n✓ Logging out...");
                    return false;
                default:
                    System.out.println("\n✗ Invalid choice. Please try again.");
            }
        } catch (NumberFormatException e) {
            System.out.println("\n✗ Error: Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("\n✗ Error: " + e.getMessage());
        }

        return true;
    }

    private static void registerPatient() {
        System.out.println("\n╔═════════════════════════════════════╗");
        System.out.println("║          ADD NEW PATIENT              ║");
        System.out.println("╚═══════════════════════════════════════╝\n");

        try {
            System.out.print("Enter Patient ID: ");
            String patientID = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter Contact Number (10-15 digits): ");
            String contactNumber = scanner.nextLine();

            System.out.print("Enter Disease: ");
            String disease = scanner.nextLine();

            System.out.print("Enter Medicine: ");
            String medicine = scanner.nextLine();

            Patient patient = new Patient(name, age, address, contactNumber,
                    patientID, disease, medicine);

            System.out.print("\nDo you want to assign a doctor? (yes/no): ");
            String assignDoctor = scanner.nextLine();

            if (assignDoctor.equalsIgnoreCase("yes")) {
                System.out.print("Enter Doctor's Full Name: ");
                String doctorName = scanner.nextLine();

                System.out.print("Enter Doctor ID: ");
                String doctorID = scanner.nextLine();

                System.out.print("Enter Doctor Age: ");
                int doctorAge = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Doctor Address: ");
                String doctorAddress = scanner.nextLine();

                System.out.print("Enter Doctor Contact Number: ");
                String doctorContact = scanner.nextLine();

                System.out.print("Enter Doctor Specialization: ");
                String specialization = scanner.nextLine();

                Doctor selectedDoctor = null;
                for (Doctor doc : doctorList) {
                    if (doc.getDoctorID().equalsIgnoreCase(doctorID)) {
                        selectedDoctor = doc;
                        System.out.println("\n⚠ Doctor with this ID already exists. Using existing doctor.");
                        break;
                    }
                }

                if (selectedDoctor == null) {
                    selectedDoctor = new Doctor(doctorName, doctorAge, doctorAddress,
                            doctorContact, doctorID, specialization);
                    doctorList.add(selectedDoctor);
                    System.out.println("\n✓ New doctor added to system.");
                }

                selectedDoctor.assignPatient(patient);
            }

            patientList.add(patient);
            System.out.println("\n✓ Patient added successfully!");
            patient.displayInfo();

        } catch (NumberFormatException e) {
            System.out.println("\n✗ Error: Invalid number format.");
        } catch (IllegalArgumentException e) {
            System.out.println("\n✗ Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\n✗ Unexpected error: " + e.getMessage());
        }
    }

    private static void viewAllPatients() {
        System.out.println("\n╔═════════════════════════════════════╗");
        System.out.println("║         ALL REGISTERED PATIENTS       ║");
        System.out.println("╚═══════════════════════════════════════╝\n");

        if (patientList.isEmpty()) {
            System.out.println("No patients registered yet.");
        } else {
            System.out.println("Total Patients: " + patientList.size() + "\n");
            for (int i = 0; i < patientList.size(); i++) {
                Patient p = patientList.get(i);
                System.out.println("─────────────────────────────────────────");
                System.out.println((i + 1) + ". Patient ID: " + p.getPatientID());
                System.out.println("   Name: " + p.getName());
                System.out.println("   Age: " + p.getAge());
                System.out.println("   Disease: " + p.getDisease());
                System.out.println("   Doctor: " + (p.getAssignedDoctor() != null ?
                        p.getAssignedDoctor().getName() : "Not Assigned"));
            }
            System.out.println("─────────────────────────────────────────");
        }
    }

    private static void searchPatientByName() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║        SEARCH PATIENT BY NAME         ║");
        System.out.println("╚════════════════════════════════════════╝\n");

        try {
            if (patientList.isEmpty()) {
                System.out.println("No patients registered yet.");
                return;
            }

            System.out.print("Enter patient name to search: ");
            String searchName = scanner.nextLine();

            List<Patient> foundPatients = new ArrayList<>();
            for (Patient p : patientList) {
                if (p.getName().toLowerCase().contains(searchName.toLowerCase())) {
                    foundPatients.add(p);
                }
            }

            if (foundPatients.isEmpty()) {
                System.out.println("\n✗ No patients found with name containing: " + searchName);
            } else {
                System.out.println("\n✓ Found " + foundPatients.size() + " patient(s):\n");
                for (Patient p : foundPatients) {
                    p.displayInfo();
                    System.out.println("\n--- Medical History ---");
                    System.out.println(p.getMedicalHistory());

                    if (!p.getVisitors().isEmpty()) {
                        System.out.println("--- Visitors ---");
                        for (Visitor v : p.getVisitors()) {
                            System.out.println("• " + v.getName() + " (" + v.getPatientRelation() +
                                    ") - Visits: " + v.getVisitDates().size());
                        }
                    }
                    System.out.println("═════════════════════════════════════════\n");
                }
            }
        } catch (Exception e) {
            System.out.println("\n✗ Error searching patient: " + e.getMessage());
        }
    }

    private static void scheduleAppointment() {
        System.out.println("\n╔═════════════════════════════════════╗");
        System.out.println("║       SCHEDULE APPOINTMENT            ║");
        System.out.println("╚═══════════════════════════════════════╝\n");

        try {
            if (patientList.isEmpty()) {
                System.out.println("No patients registered. Please register a patient first.");
                return;
            }

            viewAllPatients();
            System.out.print("\nSelect Patient (1-" + patientList.size() + "): ");
            int patientChoice = Integer.parseInt(scanner.nextLine()) - 1;

            if (patientChoice >= 0 && patientChoice < patientList.size()) {
                Patient patient = patientList.get(patientChoice);

                System.out.print("Enter Appointment Date (yyyy-MM-dd): ");
                String dateString = scanner.nextLine();

                patient.scheduleAppointment(dateString);
            } else {
                System.out.println("\n✗ Invalid patient selection.");
            }
        } catch (NumberFormatException e) {
            System.out.println("\n✗ Error: Invalid input format.");
        } catch (IllegalArgumentException e) {
            System.out.println("\n✗ Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\n✗ Unexpected error: " + e.getMessage());
        }
    }


    private static void addVisitorToPatient() {
        System.out.println("\n╔═════════════════════════════════════╗");
        System.out.println("║         ADD VISITOR TO PATIENT        ║");
        System.out.println("╚═══════════════════════════════════════╝\n");

        try {
            if (patientList.isEmpty()) {
                System.out.println("No patients registered. Please register a patient first.");
                return;
            }

            viewAllPatients();
            System.out.print("\nSelect Patient (1-" + patientList.size() + "): ");
            int patientChoice = Integer.parseInt(scanner.nextLine()) - 1;

            if (patientChoice >= 0 && patientChoice < patientList.size()) {
                Patient patient = patientList.get(patientChoice);

                System.out.print("Enter Visitor ID: ");
                String visitorID = scanner.nextLine();

                System.out.print("Enter Visitor Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Visitor Age: ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Visitor Address: ");
                String address = scanner.nextLine();

                System.out.print("Enter Visitor Contact Number: ");
                String contact = scanner.nextLine();

                System.out.print("Enter Relation to Patient: ");
                String relation = scanner.nextLine();

                Visitor visitor = new Visitor(name, age, address, contact, visitorID, relation);
                visitor.setAssociatedPatient(patient);
                patient.addVisitor(visitor);

                System.out.print("\nCheck-in visit for today? (yes/no): ");
                String checkIn = scanner.nextLine();
                if (checkIn.equalsIgnoreCase("yes")) {
                    visitor.checkInVisit(LocalDate.now());
                }

                visitor.displayInfo();
            } else {
                System.out.println("\n✗ Invalid patient selection.");
            }
        } catch (NumberFormatException e) {
            System.out.println("\n✗ Error: Invalid input format.");
        } catch (IllegalArgumentException e) {
            System.out.println("\n✗ Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\n✗ Unexpected error: " + e.getMessage());
        }
    }

    private static void updatePatientMedicine() {
        System.out.println("\n╔═════════════════════════════════════╗");
        System.out.println("║       UPDATE PATIENT MEDICINE         ║");
        System.out.println("╚═══════════════════════════════════════╝\n");

        try {
            if (patientList.isEmpty()) {
                System.out.println("No patients registered. Please register a patient first.");
                return;
            }

            viewAllPatients();
            System.out.print("\nSelect Patient (1-" + patientList.size() + "): ");
            int patientChoice = Integer.parseInt(scanner.nextLine()) - 1;

            if (patientChoice >= 0 && patientChoice < patientList.size()) {
                Patient patient = patientList.get(patientChoice);

                System.out.println("Current Medicine: " + patient.getMedicine());
                System.out.print("Enter New Medicine: ");
                String newMedicine = scanner.nextLine();

                if (patient.getAssignedDoctor() != null) {
                    patient.getAssignedDoctor().updatePatientMedicine(patient, newMedicine);
                } else {
                    patient.setMedicine(newMedicine);
                    System.out.println("✓ Medicine updated successfully.");
                }
            } else {
                System.out.println("\n✗ Invalid patient selection.");
            }
        } catch (NumberFormatException e) {
            System.out.println("\n✗ Error: Invalid input format.");
        } catch (Exception e) {
            System.out.println("\n✗ Unexpected error: " + e.getMessage());
        }
    }

    private static void viewPatientDetails() {
        System.out.println("\n╔═════════════════════════════════════╗");
        System.out.println("║        VIEW PATIENT DETAILS           ║");
        System.out.println("╚═══════════════════════════════════════╝\n");

        try {
            if (patientList.isEmpty()) {
                System.out.println("No patients registered.");
                return;
            }

            viewAllPatients();
            System.out.print("\nSelect Patient (1-" + patientList.size() + "): ");
            int patientChoice = Integer.parseInt(scanner.nextLine()) - 1;

            if (patientChoice >= 0 && patientChoice < patientList.size()) {
                Patient patient = patientList.get(patientChoice);
                patient.displayInfo();

                System.out.println("\n--- Medical History ---");
                System.out.println(patient.getMedicalHistory());

                if (!patient.getVisitors().isEmpty()) {
                    System.out.println("--- Visitors ---");
                    for (Visitor v : patient.getVisitors()) {
                        System.out.println("• " + v.getName() + " (" + v.getPatientRelation() +
                                ") - Visits: " + v.getVisitDates().size());
                    }
                }
            } else {
                System.out.println("\n✗ Invalid patient selection.");
            }
        } catch (NumberFormatException e) {
            System.out.println("\n✗ Error: Invalid input format.");
        } catch (Exception e) {
            System.out.println("\n✗ Unexpected error: " + e.getMessage());
        }
    }
}