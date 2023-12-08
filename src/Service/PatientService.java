package Service;

import java.util.List;

import entity.Doctor;
import entity.Patient;
import entity.Status;

public interface PatientService {
    Patient findById(String patientID);

    List<Doctor> getAllDoctorById(String patientID);

    Status getStatusById(String patientID);

    void savePatient(Patient patient);

    void deleteById(String patientID);
}
