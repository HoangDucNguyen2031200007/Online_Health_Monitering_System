package Builder;

import java.util.List;

import Model.Doctor;
import Model.Patient;

public interface DoctorBuilder {
    DoctorBuilder setDoctorID(String id);

    DoctorBuilder setDoctorName(String name);

    DoctorBuilder setDoctorEmail(String email);

    DoctorBuilder setDoctorPassword(String password);

    DoctorBuilder setDoctorPhone(String phone);

    DoctorBuilder setDoctorAddress(String address);

    DoctorBuilder addPatient(String patientID);

    Doctor build();

    Doctor findById(String doctorID);

    List<String> getAllDoctorName();

    List<Patient> getAllPatientById(String doctorID);

    void saveDoctor(Doctor doctor);

    void deleteById(String doctorID);
}
