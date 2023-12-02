/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import Entity.Patient;
import Entity.Status;

/**
 *
 * @author ASUS ROG
 */
public interface PatientBuilder {
    PatientBuilder setPatientId(String id);

    PatientBuilder setPatientName(String name);

    PatientBuilder setPatientEmail(String email);

    PatientBuilder setPatientPassword(String password);

    PatientBuilder setPatientPhone(String phone);

    PatientBuilder setPatientAddress(String address);

    PatientBuilder setPatientDOB(String dob);

    PatientBuilder setPatientStatus(Status status);
    
    PatientBuilder setPatientFee(double fee);

    Patient build();
}
