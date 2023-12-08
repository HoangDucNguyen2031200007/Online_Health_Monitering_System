package Service;

import java.util.List;

import Entity.Doctor;

public interface DoctorService {

    Doctor findById(String doctorID);

    boolean findByEmail(String email);

    List<Doctor> getDoctorByPatientId(String patientId);

    boolean addDoctor(Doctor doctor);

    boolean updateDoctor(Doctor doctor);

    Doctor login(String email, String password);

    boolean updatePassword(String password, String email);
}
