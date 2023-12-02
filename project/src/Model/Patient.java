/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS ROG
 */
import java.util.List;

public class Patient extends User {
    private String patientID;
    private Status status;
    private int age;
    private String dob;
    private double fee;
//    private List<String> doctorsID;

    public Patient() {
    }

    public Patient(String name, String email, String password, String phone, String address, String patientID,
            Status status, int age, String dob, double fee) {
        super(name, email, password, phone, address);
        this.patientID = patientID;
        this.status = status;
        this.age = age;
        this.dob = dob;
        this.fee = fee;
//        this.doctorsID = doctorsID;
    }

    public String getPatientID() {
        return patientID;
    }

    public Status getStatusID() {
        return status;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

//    public List<String> getDoctorsID() {
//        return doctorsID;
//    }

    public Status getStatus() {
        return status;
    }

    public double getFee() {
        return fee;
    }

}