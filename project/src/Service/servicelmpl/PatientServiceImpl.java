package Service.servicelmpl;

import java.sql.Connection;
import java.util.List;

import context.DBConnUtils;
import Model.Doctor;
import Model.Patient;
import Model.Status;
import Service.PatientService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PatientServiceImpl implements PatientService {

    private Connection conn;
    StatusServiceImpl myStatusServiceImpl = new StatusServiceImpl();

    @Override
    public Patient findById(String patientID) {
        try {
            conn = DBConnUtils.getConnection();

            String sql = "Select * from Patient a where a.PatientID=?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, patientID);

            ResultSet rs = pstm.executeQuery();

            
            while (rs.next()) {
                String patientName = rs.getString("PatientName");
                String patientEmail = rs.getString("PatientEmail");
                String patientPassword = rs.getString("PatientPassword");
                String patientPhone = rs.getString("PatientPhone");
                String patientAddress = rs.getString("PatientAddress");
                String patientStatusID = rs.getString("PatientStatusID");
                Status status = myStatusServiceImpl.findById(patientStatusID);
                double patientFee = Double.parseDouble(rs.getString("PatientFee"));
                String patientDOB = rs.getString("PatientDOB");
                Patient newPatient = new Patient(patientName, patientEmail, patientPassword, patientPhone, patientAddress, patientID, status, 0, patientDOB, patientFee);
                return newPatient;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DBConnUtils.closeConnection(conn);
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
    public void deleteById(String patientID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public void savePatient(Patient patient) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'savePatient'");
    }

    @Override
    public Patient login(String email, String password) {
         try {
            conn = DBConnUtils.getConnection();

            String sql = "Select * from Patient a where a.PatientEmail=?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, email);

            ResultSet rs = pstm.executeQuery();
            if(!rs.getString("PatientEmail").equals(password)){
                return null;
            }
            
            while (rs.next()) {
                String patientID = rs.getString("PatientID");
                String patientName = rs.getString("PatientName");
                String patientEmail = rs.getString("PatientEmail");
                String patientPassword = rs.getString("PatientPassword");
                String patientPhone = rs.getString("PatientPhone");
                String patientAddress = rs.getString("PatientAddress");
                String patientStatusID = rs.getString("PatientStatusID");
                Status status = myStatusServiceImpl.findById(patientStatusID);
                double patientFee = Double.parseDouble(rs.getString("PatientFee"));
                String patientDOB = rs.getString("PatientDOB");
                Patient newPatient = new Patient(patientName, patientEmail,
                        patientPassword, patientPhone, patientAddress, patientID, status, 0, patientDOB, patientFee);
                return newPatient;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DBConnUtils.closeConnection(conn);
        }
        return null;
    }

}