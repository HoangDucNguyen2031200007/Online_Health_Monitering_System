package Service.ServiceImpl;

import java.sql.Connection;
import java.util.List;

import context.DBConnUtils;
import entity.Doctor;
import entity.Patient;
import entity.Status;
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

}
