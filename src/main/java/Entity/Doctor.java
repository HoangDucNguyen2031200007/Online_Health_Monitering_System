package Entity;

public class Doctor extends User {

    private String doctorID;

    public Doctor(String doctorID, String name, String email, String password, String phone, String address) {
        super(name, email, password, phone, address);
        this.doctorID = doctorID;
    }

    public String getDoctorID() {
        return doctorID;
    }
}
