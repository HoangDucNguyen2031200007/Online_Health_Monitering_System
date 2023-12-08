package ConcreteBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import builder.PatientBuilder;
import entity.Patient;
import entity.Status;

public class PatientConcreteBuilder implements PatientBuilder {
    private String patientID;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private Status status;
    private int age;
    private String dob;
    private double fee;
    private List<String> doctors = new ArrayList<>();

    @Override
    public PatientBuilder setPatientID(String id) {
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
    public PatientBuilder setPatientStatus(Status status) {
        this.status = status;
        return this;
    }

    @Override
    public PatientBuilder setPatientDOB(String dob) {
        this.dob = dob;
        Date now = new Date();
        this.age = now.getYear() - Integer.parseInt(dob.split("/")[0]);
        return this;
    }

    @Override
    public PatientBuilder addDoctors(String doctorID) {
        this.doctors.add(doctorID);
        return this;
    }

    @Override
    public Patient build() {
        return new Patient(name, email, password, phone, address, patientID, status, age, dob, fee);
    }
}
