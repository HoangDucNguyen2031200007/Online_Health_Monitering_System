/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import Entity.Doctor;
import Entity.Patient;
import java.util.List;

/**
 *
 * @author ASUS ROG
 */
public interface DoctorBuilder {

    DoctorBuilder setDoctorId(String id);

    DoctorBuilder setDoctorName(String name);

    DoctorBuilder setDoctorEmail(String email);

    DoctorBuilder setDoctorPassword(String password);

    DoctorBuilder setDoctorPhone(String phone);

    DoctorBuilder setDoctorAddress(String address);

    DoctorBuilder setPatients(List<Patient> patients);

    DoctorBuilder addPatient(Patient patientID);

    Doctor build();
}
