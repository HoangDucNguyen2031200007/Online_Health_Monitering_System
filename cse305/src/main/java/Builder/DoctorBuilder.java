package Builder;

import Model.Doctor;
import Model.Patient;
import Model.Payment;

public interface DoctorBuilder {
    DoctorBuilder setDoctorID(int id);

    DoctorBuilder setDoctorName(String name);

    DoctorBuilder setDoctorEmail(String email);

    DoctorBuilder setDoctorPassword(String password);

    DoctorBuilder setDoctorPhone(String phone);

    DoctorBuilder setDoctorAddress(String address);

    DoctorBuilder addPatient(Patient patient);

    DoctorBuilder addPayment(Payment payment);

    Doctor build();
}
