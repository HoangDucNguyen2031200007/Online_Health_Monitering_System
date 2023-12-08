package Service.ServiceImpl;

import ConcreteBuilder.ScheduleConcreteBuilder;
import Context.DBConnUtils;
import Entity.Schedule;
import Service.ScheduleService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScheduleServiceImpl implements ScheduleService {

    private Connection con = DBConnUtils.getConnection();
    private PreparedStatement st;
    private ResultSet rs;

    @Override
    public boolean addSchedule(Schedule schedule) {
        try {
            st = con.prepareStatement("""
                                      Insert into Schedule (PatientID, DoctorID, Schedule_Time)
                                      values (?,?,?);
                                      """);
            st.setString(1, schedule.getPatientId());
            st.setString(2, schedule.getDoctorId());
            st.setString(3, schedule.getDate());

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(ScheduleServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List<Schedule> getAllByPatientId(String patientId) {
        List<Schedule> schedules = new ArrayList<>();

        try {
            st = con.prepareStatement("""
                                      select d.DoctorName, p.PatientName, sch.Schedule_Time from Schedule sch
                                      left join doctor d on d.DoctorID = sch.DoctorID
                                      left join patient p on p.PatientID = sch.PatientID
                                      where sch.PatientID=?
                                      """);
            st.setString(1, patientId);
            rs = st.executeQuery();

            while (rs.next()) {
                String doctorName = rs.getString("DoctorName");
                String patientName = rs.getString("PatientName");
                String date = rs.getString("Schedule_Time");

                Schedule schedule = new ScheduleConcreteBuilder()
                        .setDate(date)
                        .setDoctor(doctorName)
                        .setPatient(patientName)
                        .build();

                schedules.add(schedule);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScheduleServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return schedules;
    }

    @Override
    public List<Schedule> getAllByDoctorId(String doctorId) {
        List<Schedule> schedules = new ArrayList<>();

        try {
            st = con.prepareStatement("""
                                      select d.DoctorName, p.PatientName, sch.Schedule_Time from Schedule sch
                                      left join doctor d on d.DoctorID = sch.DoctorID
                                      left join patient p on p.PatientID = sch.PatientID
                                      where sch.DoctorID=?
                                      """);
            st.setString(1, doctorId);
            rs = st.executeQuery();

            while (rs.next()) {
                String doctorName = rs.getString("DoctorName");
                String patientName = rs.getString("PatientName");
                String date = rs.getString("Schedule_Time");

                Schedule schedule = new ScheduleConcreteBuilder()
                        .setDate(date)
                        .setDoctor(doctorName)
                        .setPatient(patientName)
                        .build();

                schedules.add(schedule);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScheduleServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return schedules;
    }

}
