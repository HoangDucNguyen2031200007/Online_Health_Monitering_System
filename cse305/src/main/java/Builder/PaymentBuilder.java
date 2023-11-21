package Builder;

import Model.Doctor;
import Model.Patient;
import Model.Payment;

public interface PaymentBuilder {
    PaymentBuilder setPaymentID(int id);

    PaymentBuilder setPatient(Patient patient);

    PaymentBuilder setDoctor(Doctor doctor);

    PaymentBuilder setConsultancyFee(double fee);

    PaymentBuilder setDescription(String description);

    Payment createPayment();
}
