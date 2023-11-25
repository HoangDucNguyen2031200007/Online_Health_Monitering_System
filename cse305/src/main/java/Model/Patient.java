package Model;

import java.util.List;

public class Patient extends User {
    private String patientID;
    private String statusID;
    private int age;
    private String dob;
    private List<String> doctors;

    public Patient() {
    }

    public Patient(String name, String email, String password, String phone, String address, String patientID,
            String statusID, int age, String dob, List<String> doctors) {
        super(name, email, password, phone, address);
        this.patientID = patientID;
        this.statusID = statusID;
        this.age = age;
        this.dob = dob;
        this.doctors = doctors;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getStatusID() {
        return statusID;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public List<String> getDoctors() {
        return doctors;
    }

}
