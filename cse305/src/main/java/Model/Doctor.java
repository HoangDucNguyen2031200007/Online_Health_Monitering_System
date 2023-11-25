package Model;

import java.util.List;

public class Doctor extends User {
    private String doctorID;
    private List<String> patients;

    public Doctor() {
    }

    public Doctor(String name, String email, String password, String phone, String address, String doctorID,
            List<String> patients) {
        super(name, email, password, phone, address);
        this.doctorID = doctorID;
        this.patients = patients;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public List<String> getPatients() {
        return patients;
    }
}
