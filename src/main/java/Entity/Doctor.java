package Entity;

public class Doctor extends User {

    private String doctorID;

    public Doctor(String doctorID, String name, String email, String password, String phone, String address) {
        super(name, email, password, phone, address);
        this.doctorID = doctorID;
    }

    public Doctor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDoctorID() {
        return doctorID;
    }
}
