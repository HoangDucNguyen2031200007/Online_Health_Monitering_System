/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import entity.Doctor;
import entity.Patient;
import entity.Status;
import java.util.List;

/**
 *
 * @author ASUS ROG
 */
public interface PatientBuilder {
    PatientBuilder setPatientID(String id);

    PatientBuilder setPatientName(String name);

    PatientBuilder setPatientEmail(String email);

    PatientBuilder setPatientPassword(String password);

    PatientBuilder setPatientPhone(String phone);

    PatientBuilder setPatientAddress(String address);

    PatientBuilder setPatientDOB(String dob);

    PatientBuilder setPatientStatus(Status status);

    PatientBuilder addDoctors(String doctorID);

    Patient build();
}
