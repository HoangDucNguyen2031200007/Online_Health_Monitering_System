package Service.servicelmpl;

import java.sql.Connection;
import java.util.List;

import Connection.JDBCConnection;
import Model.Doctor;
import Model.Patient;
import Service.DoctorService;
import context.DBConnUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DoctorServiceImpl implements DoctorService {
    private PatientServiceImpl ptService;
    private Connection con = new JDBCConnection().getConnect();

    @Override
    public Doctor findById(String doctorID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<String> getAllDoctorName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllDoctorName'");
    }

    @Override
    public List<Patient> getAllPatientById(String doctorID) {
        List<Patient> listPatient = new ArrayList<>();
        try {
            con= DBConnUtils.getConnection();
            String sql= "Select PatientID from PatientDoctor a where a.DoctorEmail=? ";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,doctorID);
            
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                String patientID = rs.getString("PatientID");
                Patient patient = ptService.findById(patientID);
                listPatient.add(patient);
            }
            return listPatient;
        } catch (Exception e) {
        } finally {
            DBConnUtils.closeConnection(con);
        }
        return null;
    }

    @Override
    public void deleteById(String doctorID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public void saveDoctor(Doctor doctor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveDoctor'");
    }

    @Override
    public Doctor login(String email, String password) {
        try {
            con= DBConnUtils.getConnection();
            String sql= "Select * from Doctor a where a.DoctorEmail=? ";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, email);
            
            ResultSet rs = pstm.executeQuery();
            if(!rs.getString("DoctorPassword").equals(password)){
                return null;
            }
            while(rs.next()){
                String DoctorID = rs.getString("DoctorID");
                String DoctorName = rs.getString("DoctorName");
                String DoctorEmail = rs.getString("DoctorEmail");
                String DoctorPassword = rs.getString("DoctorPassword");
                String DoctorPhone = rs.getString("DoctorPhone");
                String DoctorAddress = rs.getString("DoctorAddress");
                List<Patient> listPt= this.getAllPatientById(DoctorID);
                Doctor doctor = new Doctor(DoctorName,DoctorEmail,
                        DoctorPassword,DoctorPhone,DoctorAddress,DoctorID,listPt);
                return doctor;
            }
        } catch (Exception e) {
        } finally {
            DBConnUtils.closeConnection(con);
        }
        return null;
    }

}
