package App;

import Builder.DoctorBuilder;
import Builder.PatientBuilder;
import Builder.PaymentBuilder;
import ConcreteBuilder.DoctorConcreteBuilder;
import ConcreteBuilder.PatientConcreteBuilder;
import ConcreteBuilder.PaymentConcreteBuilder;
import Model.Doctor;
import Model.Patient;

public class App {

    static PaymentBuilder paymentBuilder = new PaymentConcreteBuilder();
    static DoctorBuilder doctorBuilder = new DoctorConcreteBuilder();
    static PatientBuilder patientBuilder = new PatientConcreteBuilder();

    public static void main(String[] args) {
        Patient patient = patientBuilder.setPatientID(111)
                .setPatientName("Tuan")
                .setPatientEmail("dev.@gmail.com")
                .setPatientPassword("tuan1324")
                .setPatientPhone("05555555")
                .setPatientAddress("Binh Duong")
                .setPatientStatus("Good")
                .build();

        Doctor doctor = doctorBuilder
                .setDoctorID(222)
                .setDoctorName("JoJo")
                .setDoctorEmail("jojo@gmai.com")
                .setDoctorPassword("jojo1234")
                .setDoctorPhone("095626549")
                .setDoctorAddress("HCM")
                .addPatient(patient)
                .build();

        // patient = patientBuilder.addDoctors(doctor).build();

        System.out.println(doctor);

    }
}
