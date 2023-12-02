package Service;

import java.util.List;

import Entity.Doctor;
import Entity.Patient;

public interface DoctorService {
    Doctor findById(String doctorID);

    List<String> getAllDoctorName();

    List<Patient> getAllPatientById(String doctorID);

    boolean saveDoctor(Doctor doctor);

    boolean deleteById(String doctorID);

    Doctor findByEmail(String email);
}
