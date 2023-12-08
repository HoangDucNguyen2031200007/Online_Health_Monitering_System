package ConcreteBuilder;

import java.util.ArrayList;
import java.util.List;

import builder.DoctorBuilder;
import entity.Doctor;

public class DoctorConcreteBuilder implements DoctorBuilder {
    private String doctorID;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private List<String> patients = new ArrayList<>();

    @Override
    public DoctorBuilder setDoctorID(String id) {
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
    public DoctorBuilder addPatient(String patientID) {
        this.patients.add(patientID);
        return this;
    }

    @Override
    public Doctor build() {
        return new Doctor(name, email, password, phone, address, doctorID, patients);
    }

}
