package Model;

import java.util.List;

public class Patient extends User {
    private int patientID;
    private String status;
    private List<Doctor> doctors;

    public Patient() {
    }

    public Patient(String name, String email, String password, String phone, String address, int patientID,
            String status, List<Doctor> doctors) {
        super(name, email, password, phone, address);
        this.patientID = patientID;
        this.status = status;
        this.doctors = doctors;
    }

    public int getPatientID() {
        return patientID;
    }

    public String getStatus() {
        return status;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    private String getDoctorNames() {
        String names = "[";
        for (Doctor doctor : doctors) {
            names += (doctor.getName() + " ");
        }
        return names + "]";
    }

    @Override
    public String toString() {
        return super.toString() + "Patient [patientID=" + patientID + ", status=" + status + ", doctors="
                + getDoctorNames() + "]";
    }

}
