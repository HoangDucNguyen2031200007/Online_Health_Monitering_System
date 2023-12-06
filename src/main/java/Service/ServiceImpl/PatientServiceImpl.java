package Service.ServiceImpl;

import ConcreteBuilder.PatientConcreteBuilder;
import java.sql.Connection;
import java.util.List;

import Context.DBConnUtils;
import Entity.Patient;
import Entity.Status;
import Service.PatientService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PatientServiceImpl implements PatientService {

    private Connection con;
    private PreparedStatement st;
    private ResultSet rs;

    @Override
    public Patient login(String email, String password) {
        Patient patient = null;
        try {
            con = DBConnUtils.getConnection();

            st = con.prepareStatement("select * from patient where PatientEmail=?");
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
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return patient;
    }

    @Override
    public List<Patient> getAllByDoctorId(String doctorId) {
        List<Patient> patients = new ArrayList<>();

        try {
            con = DBConnUtils.getConnection();

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

                Patient patient = new PatientConcreteBuilder()
                        .setPatientId(id)
                        .setPatientName(name)
                        .setPatientPhone(phone)
                        .setPatientAddress(address)
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
