package Service.ServiceImpl;

import ConcreteBuilder.PatientConcreteBuilder;
import java.sql.Connection;
import java.util.List;

import Context.DBConnUtils;
import Entity.Doctor;
import Entity.Patient;
import Entity.Status;
import Service.PatientService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PatientServiceImpl implements PatientService {

    private Connection con = new DBConnUtils().getConnection();
    private PreparedStatement st;
    private ResultSet rs;

    @Override
    public Patient findByEmail(String email) {
        try {
            Patient patient = null;

            st = con.prepareCall("select * from patient where PatientEmail=?");
            st.setString(1, email);
            rs = st.executeQuery();

            while (rs.next()) {
                String id = rs.getString("PatientId");
                String Name = rs.getString("PatientName");
                String Password = rs.getString("PatientPassword");
                String Phone = rs.getString("PatientPhone");
                String Address = rs.getString("PatientAddress");
                int StatusID = rs.getInt("PatientStatusID");
                Status status = new StatusServiceImpl().findById(StatusID);
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
                        .setPatientStatus(status)
                        .setPatientFee(Fee)
                        .build();
            }
            return patient;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Doctor> getAllDoctorById(String patientID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllDoctorById'");
    }

    @Override
    public Status getStatusById(String patientID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStatusById'");
    }

    @Override
    public boolean deleteById(String patientID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public boolean savePatient(Patient patient) {
        try {
            st = con.prepareStatement("""
                                      INSERT INTO patient (PatientName, PatientEmail, PatientPassword, PatientPhone, PatientAddress, PatientStatusID, PatientFee, PatientDOB) 
                                      VALUES (?, ?, ?, ?, ?, null, 0, ?);
                                      """);
            st.setString(1, patient.getName());
            st.setString(2, patient.getEmail());
            st.setString(3, patient.getPassword());
            st.setString(4, patient.getPhone());
            st.setString(5, patient.getAddress());
            st.setString(6, patient.getDob());

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(DoctorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
