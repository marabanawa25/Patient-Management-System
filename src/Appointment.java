//Appointment.java - Supporting Class
public class Appointment {
    private String appointmentId;
    private String date;
    private String time;
    private Patient patient;
    private Doctor doctor;
    private String status;
    private String reason;

public Appointment(String appointmentId, String date, String time, Patient patient, Doctor doctor, String reason){
    try{
        if (date == null || time == null){
            throw new NullPointerException("Date and time cannot be null");
        }
        if (patient == null || doctor == null){
            throw new NullPointerException("Patient and doctor cannot be null")
        }

    }
}
}
