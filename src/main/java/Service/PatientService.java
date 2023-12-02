package Service;

import java.util.List;

import Entity.Doctor;
import Entity.Patient;
import Entity.Status;

public interface PatientService {
    Patient findByEmail(String email);

    List<Doctor> getAllDoctorById(String patientID);

    Status getStatusById(String patientID);

    boolean savePatient(Patient patient);

    boolean deleteById(String patientID);
}
