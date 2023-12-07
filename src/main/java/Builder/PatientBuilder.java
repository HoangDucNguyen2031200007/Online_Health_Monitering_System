package Builder;

import Entity.Patient;
import Entity.Status;

public interface PatientBuilder {
    PatientBuilder setPatientId(String id);

    PatientBuilder setPatientName(String name);

    PatientBuilder setPatientEmail(String email);

    PatientBuilder setPatientPassword(String password);

    PatientBuilder setPatientPhone(String phone);

    PatientBuilder setPatientAddress(String address);

    PatientBuilder setPatientDOB(String dob);

    PatientBuilder setPatientStatusId(int statusId);
    
    PatientBuilder setPatientFee(double fee);

    Patient build();
}
