// Appointable.java - Interface (Abstraction)
public interface Appointable {
    void scheduleAppointment(Appointment appointment);
    void cancelAppointment(String appointmentId);
    void rescheduleAppointment(String appointmentId, String newDate);
}
