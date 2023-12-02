package Service.ServiceImpl;

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
    public Patient findByEmail(String patientID) {
//        try {
//            conn = DBConnUtils.getConnection();
//
//            String sql = "Select * from Patient a where a.PatientID=?";
//
//            PreparedStatement pstm = conn.prepareStatement(sql);
//            pstm.setString(1, patientID);
//
//            ResultSet rs = pstm.executeQuery();
//
//            
//            while (rs.next()) {
//                String patientName = rs.getString("PatientName");
//                String patientEmail = rs.getString("PatientEmail");
//                String patientPassword = rs.getString("PatientPassword");
//                String patientPhone = rs.getString("PatientPhone");
//                String patientAddress = rs.getString("PatientAddress");
//                String patientStatusID = rs.getString("PatientStatusID");
//                Status status = myStatusServiceImpl.findById(patientStatusID);
//                double patientFee = Double.parseDouble(rs.getString("PatientFee"));
//                String patientDOB = rs.getString("PatientDOB");
////                Patient newPatient = new Patient(patientName, patientEmail, patientPassword, patientPhone, patientAddress, patientID, status, 0, patientDOB, patientFee);
//                return null;
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            DBConnUtils.closeConnection(conn);
//        }
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
