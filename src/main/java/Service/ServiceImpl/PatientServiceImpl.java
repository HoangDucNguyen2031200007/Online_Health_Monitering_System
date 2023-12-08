package Service.ServiceImpl;

import ConcreteBuilder.PatientConcreteBuilder;
import java.sql.Connection;
import java.util.List;

import Context.DBConnUtils;
import Entity.Patient;
import Entity.Status;
import Service.PatientService;
import Service.StatusService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PatientServiceImpl implements PatientService {

    private final Connection con = DBConnUtils.getConnection();
    private PreparedStatement st;
    private ResultSet rs;

    @Override
    public Patient findById(String patientId) {
        Patient patient = null;
        try {
            st = con.prepareStatement("select * from patient where PatientId=?");
            st.setString(1, patientId);

            rs = st.executeQuery();

            if (rs.next()) {
                String id = rs.getString("PatientId");
                String Name = rs.getString("PatientName");
                String Password = rs.getString("PatientPassword");
                String Phone = rs.getString("PatientPhone");
                String Address = rs.getString("PatientAddress");
                int statusID = rs.getInt("PatientStatusID");
                double Fee = rs.getDouble("PatientFee");
                String DOB = rs.getString("PatientDOB");
                String email = rs.getString("PatientEmail");

                patient = new PatientConcreteBuilder()
                        .setPatientId(id)
                        .setPatientName(Name)
                        .setPatientEmail(email)
                        .setPatientPassword(Password)
                        .setPatientDOB(DOB)
                        .setPatientPhone(Phone)
                        .setPatientAddress(Address)
                        .setPatientStatusId(statusID)
                        .setPatientFee(Fee)
                        .build();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return patient;
    }

    @Override
    public Patient login(String email, String password) {
        Patient patient = null;
        try {
            st = con.prepareStatement("select * from patient where PatientEmail=? and PatientPassword=?");
            st.setString(1, email);
            st.setString(2, password);

            rs = st.executeQuery();

            if (rs.next()) {
                String id = rs.getString("PatientId");
                String Name = rs.getString("PatientName");
                String Password = rs.getString("PatientPassword");
                String Phone = rs.getString("PatientPhone");
                String Address = rs.getString("PatientAddress");
                int statusID = rs.getInt("PatientStatusID");
                double Fee = rs.getDouble("PatientFee");
                String DOB = rs.getString("PatientDOB");

                patient = new PatientConcreteBuilder()
                        .setPatientId(id)
                        .setPatientName(Name)
                        .setPatientEmail(email)
                        .setPatientPassword(Password)
                        .setPatientDOB(DOB)
                        .setPatientPhone(Phone)
                        .setPatientAddress(Address)
                        .setPatientStatusId(statusID)
                        .setPatientFee(Fee)
                        .build();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return patient;
    }

    @Override
    public List<Patient> getAllByDoctorId(String doctorId) {
        List<Patient> patients = new ArrayList<>();

        try {
            st = con.prepareStatement("""
                                      select p.* from patient p
                                      left join patientdoctor pd on p.PatientID=pd.PatientID
                                      where pd.DoctorID=?
                                      """);
            st.setString(1, doctorId);

            rs = st.executeQuery();

            while (rs.next()) {
                String id = rs.getString("PatientID");
                String name = rs.getString("PatientName");
                String phone = rs.getString("PatientPhone");
                String address = rs.getString("PatientAddress");
                int statusID = rs.getInt("PatientStatusID");

                Patient patient = new PatientConcreteBuilder()
                        .setPatientId(id)
                        .setPatientName(name)
                        .setPatientPhone(phone)
                        .setPatientAddress(address)
                        .setPatientStatusId(statusID)
                        .build();

                patients.add(patient);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBConnUtils.closeConnection(con);
        }

        return patients;
    }

    @Override
    public boolean addPatient(Patient patient) {
        try {

            StatusService statusService = new StatusServiceImpl();
            int statusId = statusService.addStatus();

            st = con.prepareStatement("""
                                      INSERT INTO patient (PatientName, PatientEmail, PatientPassword, PatientPhone, PatientAddress, PatientStatusID, PatientFee, PatientDOB) 
                                      VALUES (?, ?, ?, ?, ?, ?, 0, ?);
                                      """);
            st.setString(1, patient.getName());
            st.setString(2, patient.getEmail());
            st.setString(3, patient.getPassword());
            st.setString(4, patient.getPhone());
            st.setString(5, patient.getAddress());
            st.setInt(6, statusId);
            st.setString(7, patient.getDob());

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(DoctorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean updatePatient(Patient patient) {
        try {
            st = con.prepareStatement("""
                                      UPDATE patient
                                         SET PatientName = ?
                                            ,PatientPhone = ?
                                            ,PatientAddress = ?
                                            ,PatientDOB = ?
                                            ,PatientEmail = ?
                                       WHERE PatientID=?
                                    """);
            st.setString(1, patient.getName());
            st.setString(2, patient.getPhone());
            st.setString(3, patient.getAddress());
            st.setString(4, patient.getDob());
            st.setString(5, patient.getEmail());
            st.setString(6, patient.getPatientID());

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(PatientServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean addDoctor(String patientId, String doctorId) {
        try {
            st = con.prepareStatement("""
                                      INSERT INTO patientdoctor (PatientID ,DoctorID) VALUES (?, ?);
                                    """);
            st.setString(1, patientId);
            st.setString(2, doctorId);

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(PatientServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean findByEmail(String email) {
        try {
            st = con.prepareStatement("select * from patient where PatientEmail=?");
            st.setString(1, email);

            rs = st.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean updatePassword(String password, String email) {
        try {
            st = con.prepareStatement("""
                                      UPDATE patient
                                         SET Patientpassword = ?
                                       WHERE PatientEmail=?
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
