package Service;

import java.util.List;

import Model.Doctor;
import Model.Patient;
import Model.Status;

public interface PatientService {
    Patient findById(String patientID);

    List<Doctor> getAllDoctorById(String patientID);

    Status getStatusById(String patientID);

    void savePatient(Patient patient);

    void deleteById(String patientID);
}
