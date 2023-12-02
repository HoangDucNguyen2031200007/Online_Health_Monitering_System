package ConcreteBuilder;

import java.util.ArrayList;
import java.util.List;

import Builder.DoctorBuilder;
import Model.Doctor;
import Model.Patient;
import Service.DoctorService;
import Service.servicelmpl.DoctorServiceImpl;

public class DoctorConcreteBuilder implements DoctorBuilder {
    private String doctorID;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private List<Doctor> listDoctor = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    private DoctorService doctorService = new DoctorServiceImpl();

    @Override
    public DoctorBuilder setDoctorID(String id) {
        this.doctorID = id;
        return this;
    }

    @Override
    public DoctorBuilder setDoctorName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public DoctorBuilder setDoctorEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public DoctorBuilder setDoctorPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public DoctorBuilder setDoctorPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public DoctorBuilder setDoctorAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public DoctorBuilder addPatient(Patient patientID) {
        this.patients.add(patientID);
        return this;
    }

    @Override
    public Doctor build() {
       Doctor a=new Doctor(name, email, password, phone, address, doctorID, patients);
       this.listDoctor.add(a);
        return a;
    }

    @Override
    public Doctor findById(String doctorID) {
        for(Doctor doctor:this.listDoctor){
            if(doctor.getDoctorID().equals(doctorID)){
                return doctor;
            }
        }
        return null;
    }

    @Override
    public List<String> getAllDoctorName() {
        return doctorService.getAllDoctorName();
    }

    @Override
    public List<Patient> getAllPatientById(String doctorID) {
        return doctorService.getAllPatientById(doctorID);
    }

    @Override
    public void saveDoctor(Doctor doctor) {
        doctorService.saveDoctor(doctor);
    }

    @Override
    public void deleteById(String doctorID) {
        doctorService.deleteById(doctorID);
    }

}
