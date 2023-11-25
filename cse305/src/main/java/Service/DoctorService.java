package Service;

import java.util.List;

import Model.Doctor;
import Model.Patient;

public interface DoctorService {
    Doctor findById(String doctorID);

    List<String> getAllDoctorName();

    List<Patient> getAllPatientById(String doctorID);

    void saveDoctor(Doctor doctor);

    void deleteById(String doctorID);
}
