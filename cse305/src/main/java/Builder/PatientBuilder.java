package Builder;

import Model.Doctor;
import Model.Patient;

public interface PatientBuilder {
    PatientBuilder setPatientID(int id);

    PatientBuilder setPatientName(String name);

    PatientBuilder setPatientEmail(String email);

    PatientBuilder setPatientPassword(String password);

    PatientBuilder setPatientPhone(String phone);

    PatientBuilder setPatientAddress(String address);

    PatientBuilder setPatientStatus(String status);

    PatientBuilder addDoctors(Doctor doctor);

    Patient build();
}
