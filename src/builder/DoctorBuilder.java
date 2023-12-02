/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import entity.Doctor;
import entity.Patient;
import java.util.List;

/**
 *
 * @author ASUS ROG
 */
public interface DoctorBuilder {

    DoctorBuilder setDoctorID(String id);

    DoctorBuilder setDoctorName(String name);

    DoctorBuilder setDoctorEmail(String email);

    DoctorBuilder setDoctorPassword(String password);

    DoctorBuilder setDoctorPhone(String phone);

    DoctorBuilder setDoctorAddress(String address);

    DoctorBuilder addPatient(String patientID);

    Doctor build();

    Doctor findById(String doctorID);

    List<String> getAllDoctorName();

    List<Patient> getAllPatientById(String doctorID);

    void saveDoctor(Doctor doctor);

    void deleteById(String doctorID);
}
