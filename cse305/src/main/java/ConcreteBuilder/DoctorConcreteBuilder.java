package ConcreteBuilder;

import java.util.ArrayList;
import java.util.List;

import Builder.DoctorBuilder;
import Model.Doctor;
import Model.Patient;
import Model.Payment;

public class DoctorConcreteBuilder implements DoctorBuilder {
    private int doctorID;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private List<Patient> patients=new ArrayList<>();
    private List<Payment> payments=new ArrayList<>();

    @Override
    public DoctorBuilder setDoctorID(int id) {
        this.doctorID = id;
        return this;
    }

    @Override
    public DoctorBuilder setDoctorName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public DoctorBuilder setDoctorEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public DoctorBuilder setDoctorPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public DoctorBuilder setDoctorPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public DoctorBuilder setDoctorAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public DoctorBuilder addPatient(Patient patient) {
        this.patients.add(patient);
        return this;
    }

    @Override
    public DoctorBuilder addPayment(Payment payment) {
        this.payments.add(payment);
        return this;
    }

    @Override
    public Doctor build() {
        return new Doctor(name, email, password, phone, address, doctorID, patients, payments);
    }

}
