package Entity;

public class Patient extends User {

    private String patientID;
    private int statusId;
    private int age;
    private String dob;
    private double fee;

    public Patient() {
    }

    public Patient(String name, String email, String password, String phone, String address, String patientID,
            int statusId, int age, String dob, double fee) {
        super(name, email, password, phone, address);
        this.patientID = patientID;
        this.statusId = statusId;
        this.age = age;
        this.dob = dob;
        this.fee = fee;
    }

    public String getPatientID() {
        return patientID;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public int getStatusId() {
        return statusId;
    }

    public double getFee() {
        return fee;
    }

}
