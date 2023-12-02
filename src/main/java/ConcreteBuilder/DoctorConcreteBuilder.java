package ConcreteBuilder;

import Builder.DoctorBuilder;
import Entity.Doctor;

public class DoctorConcreteBuilder implements DoctorBuilder {

    private String id = "0";
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;

    @Override
    public DoctorBuilder setDoctorId(String id) {
        this.id = id;
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
    public Doctor build() {
        return new Doctor(id, name, email, password, phone, address);
    }

}
