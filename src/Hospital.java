// Hospital.java - Main Management Class
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Administrator> administrators;
    private List<Appointment> appointments;

    // Constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.administrators = new ArrayList<>();
        this.appointments = new ArrayList<>();
        System.out.println("Hospital System Initialized: " + hospitalName);
    }

    // Add patient
    public void addPatient(Patient patient) {
        try {
            if (patient == null) {
                throw new NullPointerException("Patient cannot be null");
            }

            // Check for duplicate
            for (Patient p : patients) {
                if (p.getPatientId().equals(patient.getPatientId())) {
                    throw new IllegalArgumentException("Patient with ID " +
                            patient.getPatientId() + " already exists");
                }
            }

            patients.add(patient);
            System.out.println("Patient registered: " + patient.getName());
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Error adding patient: " + e.getMessage());
        }
    }

    // Add doctor
    public void addDoctor(Doctor doctor) {
        try {
            if (doctor == null) {
                throw new NullPointerException("Doctor cannot be null");
            }

            // Check for duplicate
            for (Doctor d : doctors) {
                if (d.getDoctorId().equals(doctor.getDoctorId())) {
                    throw new IllegalArgumentException("Doctor with ID " +
                            doctor.getDoctorId() + " already exists");
                }
            }

            doctors.add(doctor);
            System.out.println("Doctor added: Dr. " + doctor.getName());
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Error adding doctor: " + e.getMessage());
        }
    }

    // Add administrator
    public void addAdministrator(Administrator admin) {
        try {
            if (admin == null) {
                throw new NullPointerException("Administrator cannot be null");
            }
            administrators.add(admin);
            System.out.println("Administrator added: " + admin.getName());
        } catch (NullPointerException e) {
            System.out.println("Error adding administrator: " + e.getMessage());
        }
    }

    // Schedule appointment
    public void scheduleAppointment(Appointment appointment) {
        try {
            if (appointment == null) {
                throw new NullPointerException("Appointment cannot be null");
            }

            appointments.add(appointment);
            appointment.getPatient().scheduleAppointment(appointment);
            appointment.getDoctor().scheduleAppointment(appointment);
        } catch (NullPointerException e) {
            System.out.println("Error scheduling appointment: " + e.getMessage());
        }
    }

    // Find patient by ID
    public Patient findPatient(String patientId) {
        try {
            for (Patient p : patients) {
                if (p.getPatientId().equals(patientId)) {
                    return p;
                }
            }
            throw new IllegalArgumentException("Patient not found with ID: " + patientId);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Find doctor by ID
    public Doctor findDoctor(String doctorId) {
        try {
            for (Doctor d : doctors) {
                if (d.getDoctorId().equals(doctorId)) {
                    return d;
                }
            }
            throw new IllegalArgumentException("Doctor not found with ID: " + doctorId);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Display all patients
    public void displayAllPatients() {
        try {
            if (patients.isEmpty()) {
                throw new IllegalStateException("No patients registered");
            }
            System.out.println("\n=== ALL PATIENTS IN " + hospitalName + " ===");
            for (int i = 0; i < patients.size(); i++) {
                System.out.println((i + 1) + ". " + patients.get(i).getName() +
                        " (ID: " + patients.get(i).getPatientId() + ")");
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    // Display all doctors
    public void displayAllDoctors() {
        try {
            if (doctors.isEmpty()) {
                throw new IllegalStateException("No doctors registered");
            }
            System.out.println("\n=== ALL DOCTORS IN " + hospitalName + " ===");
            for (int i = 0; i < doctors.size(); i++) {
                System.out.println((i + 1) + ". Dr. " + doctors.get(i).getName() +
                        " - " + doctors.get(i).getSpecialization() +
                        " (ID: " + doctors.get(i).getDoctorId() + ")");
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    // Display all appointments
    public void displayAllAppointments() {
        try {
            if (appointments.isEmpty()) {
                throw new IllegalStateException("No appointments scheduled");
            }
            System.out.println("\n=== ALL APPOINTMENTS IN " + hospitalName + " ===");
            for (Appointment apt : appointments) {
                apt.displayAppointment();
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    // Getters
    public String getHospitalName() { return hospitalName; }
    public List<Patient> getPatients() { return patients; }
    public List<Doctor> getDoctors() { return doctors; }
    public List<Administrator> getAdministrators() { return administrators; }
    public List<Appointment> getAppointments() { return appointments; }
}