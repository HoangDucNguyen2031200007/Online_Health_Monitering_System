package ConcreteBuilder;

import Builder.PatientBuilder;
import Entity.Patient;
import java.time.LocalDateTime;

public class PatientConcreteBuilder implements PatientBuilder {

    private String id = "0";
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private int statusId;
    private int age;
    private String dob;
    private double fee = 0;

    @Override
    public PatientBuilder setPatientId(String id) {
        this.id = id;
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
    public PatientBuilder setPatientStatusId(int statusId) {
        this.statusId = statusId;
        return this;
    }

    @Override
    public PatientBuilder setPatientDOB(String dob) {
        this.dob = dob;
        int currentYear = LocalDateTime.now().getYear();
        this.age = currentYear - Integer.parseInt(dob.split("/")[2]);
        return this;
    }

    @Override
    public PatientBuilder setPatientFee(double fee) {
        this.fee = fee;
        return this;
    }

    @Override
    public Patient build() {
        return new Patient(name, email, password, phone, address, id, statusId, age, dob, fee);
    }

}
