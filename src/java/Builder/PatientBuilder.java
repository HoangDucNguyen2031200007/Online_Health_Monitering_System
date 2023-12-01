package Builder;

import java.util.List;

import Model.Doctor;
import Model.Patient;
import Model.Status;

public interface PatientBuilder {
    PatientBuilder setPatientID(String id);

    PatientBuilder setPatientName(String name);

    PatientBuilder setPatientEmail(String email);

    PatientBuilder setPatientPassword(String password);

    PatientBuilder setPatientPhone(String phone);

    PatientBuilder setPatientAddress(String address);

    PatientBuilder setPatientDOB(String dob);

    PatientBuilder setPatientStatus(String statusID);

    PatientBuilder addDoctors(String doctorID);

    Patient build();

    Patient findById(String patientID);

    List<Doctor> getAllDoctorById(String patientID);

    Status getStatusById(String patientID);

    void savePatient(Patient patient);

    void deleteById(String patientID);
}
