package Entity;

public class Schedule {

    private String patientId;
    private String doctorId;
    private String patient;
    private String doctor;
    private String date;

    public Schedule() {
    }

    public Schedule(String patientId, String doctorId, String patient, String doctor, String date) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public String getPatient() {
        return patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

}
