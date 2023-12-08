package Service.ServiceImpl;

import ConcreteBuilder.DoctorConcreteBuilder;
import Context.DBConnUtils;
import java.sql.Connection;
import java.util.List;

import Entity.Doctor;
import Service.DoctorService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoctorServiceImpl implements DoctorService {

    private final Connection con = DBConnUtils.getConnection();
    private PreparedStatement st;
    private ResultSet rs;

    @Override
    public Doctor findById(String doctorID) {
        Doctor doctor = null;
        try {
            st = con.prepareStatement("select * from doctor where DoctorID=?");
            st.setString(1, doctorID);

            rs = st.executeQuery();

            if (rs.next()) {
                String id = rs.getString("DoctorID");
                String name = rs.getString("DoctorName");
                String phone = rs.getString("DoctorPhone");
                String address = rs.getString("DoctorAddress");
                String email = rs.getString("DoctorEmail");
                String password = rs.getString("DoctorPassword");

                doctor = new DoctorConcreteBuilder()
                        .setDoctorId(id)
                        .setDoctorName(name)
                        .setDoctorEmail(email)
                        .setDoctorPassword(password)
                        .setDoctorPhone(phone)
                        .setDoctorAddress(address)
                        .build();
            }
            return doctor;
        } catch (SQLException ex) {
            Logger.getLogger(DoctorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean findByEmail(String email) {
        try {
            st = con.prepareStatement("select * from doctor where DoctorEmail=?");
            st.setString(1, email);

            rs = st.executeQuery();

            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(DoctorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Doctor login(String email, String password) {
        Doctor doctor = null;
        try {
            st = con.prepareStatement("select * from doctor where DoctorEmail=? and DoctorPassword=?");
            st.setString(1, email);
            st.setString(2, password);

            rs = st.executeQuery();

            if (rs.next()) {
                String id = rs.getString("DoctorID");
                String name = rs.getString("DoctorName");
                String phone = rs.getString("DoctorPhone");
                String address = rs.getString("DoctorAddress");

                doctor = new DoctorConcreteBuilder()
                        .setDoctorId(id)
                        .setDoctorName(name)
                        .setDoctorEmail(email)
                        .setDoctorPassword(password)
                        .setDoctorPhone(phone)
                        .setDoctorAddress(address)
                        .build();
            }
            return doctor;
        } catch (SQLException ex) {
            Logger.getLogger(DoctorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<Doctor> getDoctorByPatientId(String patientId) {
        List<Doctor> doctors = new ArrayList<>();

        try {
            st = con.prepareStatement("""
                                      select d.* from doctor d
                                      left join patientdoctor pd on d.DoctorID=pd.DoctorID
                                      where pd.PatientID=?
                                      """);
            st.setString(1, patientId);

            rs = st.executeQuery();

            while (rs.next()) {
                String id = rs.getString("DoctorID");
                String name = rs.getString("DoctorName");
                String phone = rs.getString("DoctorPhone");
                String address = rs.getString("DoctorAddress");
                String email = rs.getString("DoctorEmail");
                String password = rs.getString("DoctorPassword");

                Doctor doctor = new DoctorConcreteBuilder()
                        .setDoctorId(id)
                        .setDoctorName(name)
                        .setDoctorEmail(email)
                        .setDoctorPassword(password)
                        .setDoctorPhone(phone)
                        .setDoctorAddress(address)
                        .build();

                doctors.add(doctor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doctors;
    }

    @Override
    public boolean addDoctor(Doctor doctor) {
        try {
            st = con.prepareStatement("""
                                        INSERT INTO doctor (DoctorName ,DoctorEmail ,DoctorPassword ,DoctorPhone ,DoctorAddress)
                                        VALUES (?,?,?,?,?)                         
                                        """);

            st.setString(1, doctor.getName());
            st.setString(2, doctor.getEmail());
            st.setString(3, doctor.getPassword());
            st.setString(4, doctor.getPhone());
            st.setString(5, doctor.getAddress());

            int k = st.executeUpdate();

            return k != 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updateDoctor(Doctor doctor) {
        try {
            st = con.prepareStatement("""
                                      UPDATE doctor
                                         SET DoctorName = ?
                                            ,DoctorPhone = ?
                                            ,DoctorAddress = ?
                                            ,DoctorEmail = ?
                                       WHERE DoctorID=?
                                    """);
            st.setString(1, doctor.getName());
            st.setString(2, doctor.getPhone());
            st.setString(3, doctor.getAddress());
            st.setString(4, doctor.getEmail());
            st.setString(5, doctor.getDoctorID());

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(PatientServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean updatePassword(String password, String email) {
        try {
            st = con.prepareStatement("""
                                      UPDATE doctor
                                         SET DoctorPassword = ?
                                       WHERE DoctorEmail=?
                                    """);
            st.setString(1, password);
            st.setString(2, email);

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(PatientServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
