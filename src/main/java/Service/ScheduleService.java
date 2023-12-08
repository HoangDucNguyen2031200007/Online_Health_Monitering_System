package Service;

import Entity.Schedule;
import java.util.List;

public interface ScheduleService {

    boolean addSchedule(Schedule schedule);

    List<Schedule> getAllByPatientId(String patientId);

    List<Schedule> getAllByDoctorId(String doctorId);
}
