package ConcreteBuilder;

import java.util.ArrayList;
import java.util.List;

import Builder.PatientBuilder;
import Model.Doctor;
import Model.Patient;

public class PatientConcreteBuilder implements PatientBuilder {
    private int patientID;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String status;
    private List<Doctor> doctors = new ArrayList<>();

    @Override
    public PatientBuilder setPatientID(int id) {
        this.patientID = id;
        return this;
    }

    @Override
    public PatientBuilder setPatientName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PatientBuilder setPatientEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public PatientBuilder setPatientPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public PatientBuilder setPatientPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public PatientBuilder setPatientAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public PatientBuilder setPatientStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public PatientBuilder addDoctors(Doctor doctor) {
        this.doctors.add(doctor);
        return this;
    }

    @Override
    public Patient build() {
        return new Patient(name, email, password, phone, address, patientID, status, doctors);
    }

}
