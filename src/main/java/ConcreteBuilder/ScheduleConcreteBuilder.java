package ConcreteBuilder;

import Builder.ScheduleBuilder;
import Entity.Schedule;

public class ScheduleConcreteBuilder implements ScheduleBuilder {

    private String patientId;
    private String doctorId;
    private String patient;
    private String doctor;
    private String date;

    @Override
    public ScheduleBuilder setPatientId(String patientId) {
        this.patientId = patientId;
        return this;
    }

    @Override
    public ScheduleBuilder setDoctorId(String doctorId) {
        this.doctorId = doctorId;
        return this;
    }

    @Override
    public ScheduleBuilder setPatient(String patientName) {
        this.patient = patientName;
        return this;
    }

    @Override
    public ScheduleBuilder setDoctor(String doctorName) {
        this.doctor = doctorName;
        return this;
    }

    @Override
    public ScheduleBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    @Override
    public Schedule build() {
        return new Schedule(patientId, doctorId, patient, doctor, date);
    }

}
