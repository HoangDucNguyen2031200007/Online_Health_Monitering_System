package Service;

import java.util.List;

import Entity.Patient;
import Entity.Status;

public interface PatientService {

    Patient login(String email, String password);

    List<Patient> getAllByDoctorId(String doctorId);

    Status getStatusById(String patientID);

    boolean savePatient(Patient patient);

    boolean deleteById(String patientID);
}
