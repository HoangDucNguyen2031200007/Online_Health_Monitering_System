package Service;

import java.util.List;

import Entity.Patient;

public interface PatientService {

    Patient findById(String patientId);

    boolean findByEmail(String email);

    Patient login(String email, String password);

    List<Patient> getAllByDoctorId(String doctorId);

    boolean addPatient(Patient patient);

    boolean updatePatient(Patient patient);

    boolean addDoctor(String patientId, String doctorId);

    boolean updatePassword(String password, String email);
}
