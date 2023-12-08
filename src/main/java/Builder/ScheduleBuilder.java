package Builder;

import Entity.Schedule;

public interface ScheduleBuilder {

    ScheduleBuilder setPatientId(String patientId);

    ScheduleBuilder setDoctorId(String doctorId);

    ScheduleBuilder setPatient(String patientName);

    ScheduleBuilder setDoctor(String doctorName);

    ScheduleBuilder setDate(String date);

    Schedule build();
}
