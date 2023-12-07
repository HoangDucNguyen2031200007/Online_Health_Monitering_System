package Entity;

public class Doctor extends User {

    private String doctorID;

    public Doctor(String name, String email, String password, String phone, String address, String doctorID) {
        super(name, email, password, phone, address);
        this.doctorID = doctorID;

    }

    public Doctor() {
    }

    public String getDoctorID() {
        return doctorID;
    }
}
