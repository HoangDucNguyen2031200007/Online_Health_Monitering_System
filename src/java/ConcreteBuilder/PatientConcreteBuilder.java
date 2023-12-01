package ConcreteBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Builder.PatientBuilder;
import Model.Doctor;
import Model.Patient;
import Model.Status;
import Model.StoreUser;
import Service.PatientService;
import Service.ServiceImpl.PatientServiceImpl;

public class PatientConcreteBuilder implements PatientBuilder {
    private String patientID;
    private String name;
    private String email;
    private StoreUser stu;
    private String password;
    private String phone;
    private String address;
    private String statusID;
    private int age;
    private String dob;
    private List<String> doctors = new ArrayList<>();

    private PatientService patientService = new PatientServiceImpl();

    @Override
    public PatientBuilder setPatientID(String id) {
        this.patientID = id;
        return this;
    }

    @Override
    public PatientBuilder setPatientName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PatientBuilder setPatientEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public PatientBuilder setPatientPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public PatientBuilder setPatientPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public PatientBuilder setPatientAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public PatientBuilder setPatientStatus(String status) {
        this.statusID = status;
        return this;
    }

    @Override
    public PatientBuilder setPatientDOB(String dob) {
        this.dob = dob;
        Date now = new Date();
        this.age = now.getYear() - Integer.parseInt(dob.split("-")[2]);
        return this;
    }

    @Override
    public PatientBuilder addDoctors(String doctorID) {
        this.doctors.add(doctorID);
        return this;
    }

    @Override
    public Patient build() {
        stu.addList(new StoreUser(false,this.patientID ,email, password));
        return new Patient(name, email, password, phone, address, patientID, statusID, age, dob, doctors);
    }

    @Override
    public Patient findById(String patientID) {
        return patientService.findById(patientID);
    }

    @Override
    public List<Doctor> getAllDoctorById(String patientID) {
        return patientService.getAllDoctorById(patientID);
    }

    @Override
    public Status getStatusById(String patientID) {
        return patientService.getStatusById(patientID);
    }

    @Override
    public void savePatient(Patient patient) {
        patientService.savePatient(patient);
    }

    @Override
    public void deleteById(String patientID) {
        patientService.deleteById(patientID);
    }

}
