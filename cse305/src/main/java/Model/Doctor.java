package Model;

import java.util.List;

public class Doctor extends User {
    private int doctorID;
    private List<Patient> patients;
    private List<Payment> payments;

    public Doctor() {
    }

    public Doctor(String name, String email, String password, String phone, String address, int doctorID,
            List<Patient> patients, List<Payment> payments) {
        super(name, email, password, phone, address);
        this.doctorID = doctorID;
        this.patients = patients;
        this.payments = payments;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    private String getPatientNames() {
        String names = "[";
        for (Patient patient : patients) {
            names += (patient.getName()+" ");
        }
        return names + "]";
    }

    @Override
    public String toString() {
        return super.toString() + "Doctor [doctorID=" + doctorID + ", patients=" + getPatientNames() + ", payments=" + payments
                + "]";
    }

}
