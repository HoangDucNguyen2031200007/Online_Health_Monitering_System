package ConcreteBuilder;

import Builder.PaymentBuilder;
import Model.Doctor;
import Model.Patient;
import Model.Payment;

public class PaymentConcreteBuilder implements PaymentBuilder {
    private int paymentID;
    private Doctor doctor;
    private Patient patient;
    private double consultancyFee;
    private String description;

    @Override
    public PaymentBuilder setPaymentID(int id) {
        this.paymentID = id;
        return this;
    }

    @Override
    public PaymentBuilder setPatient(Patient patient) {
        this.patient = patient;
        return this;
    }

    @Override
    public PaymentBuilder setDoctor(Doctor doctor) {
        this.doctor = doctor;
        return this;
    }

    @Override
    public PaymentBuilder setConsultancyFee(double fee) {
        this.consultancyFee = fee;
        return this;
    }

    @Override
    public PaymentBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Payment createPayment() {
        return new Payment(paymentID, doctor, patient, consultancyFee, description);
    }

}
