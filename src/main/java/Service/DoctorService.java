package Service;

import java.util.List;

import Entity.Doctor;
import Entity.Patient;

public interface DoctorService {
    Doctor findById(String doctorID);

    List<String> getAllDoctorName();

    boolean saveDoctor(Doctor doctor);

    boolean deleteById(String doctorID);

    Doctor login(String email, String password);
}
