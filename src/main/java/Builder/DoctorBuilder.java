package Builder;

import Entity.Doctor;

public interface DoctorBuilder {

    DoctorBuilder setDoctorId(String id);

    DoctorBuilder setDoctorName(String name);

    DoctorBuilder setDoctorEmail(String email);

    DoctorBuilder setDoctorPassword(String password);

    DoctorBuilder setDoctorPhone(String phone);

    DoctorBuilder setDoctorAddress(String address);

    Doctor build();
}
