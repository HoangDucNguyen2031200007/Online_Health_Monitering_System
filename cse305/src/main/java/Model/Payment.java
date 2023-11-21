package Model;

public class Payment {
    private int paymentID;
    private Doctor doctor;
    private Patient patient;
    private double consultancyFee;
    private String description;

    public Payment() {
    }

    public Payment(int paymentID, Doctor doctor, Patient patient, double consultancyFee, String description) {
        this.paymentID = paymentID;
        this.doctor = doctor;
        this.patient = patient;
        this.consultancyFee = consultancyFee;
        this.description = description;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public double getConsultancyFee() {
        return consultancyFee;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Payment [paymentID=" + paymentID + ", doctor=" + doctor + ", patient=" + patient + ", consultancyFee="
                + consultancyFee + ", description=" + description + "]";
    }

}
