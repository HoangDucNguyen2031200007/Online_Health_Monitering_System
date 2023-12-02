package Service.ServiceImpl;

import ConcreteBuilder.DoctorConcreteBuilder;
import Context.DBConnUtils;
import java.sql.Connection;
import java.util.List;

import Entity.Doctor;
import Entity.Patient;
import Service.DoctorService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoctorServiceImpl implements DoctorService {

    private Connection con = new DBConnUtils().getConnection();
    private PreparedStatement st;
    private ResultSet rs;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPatientById'");
    }

    @Override
    public boolean deleteById(String doctorID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public boolean saveDoctor(Doctor doctor) {
        try {
            st = con.prepareStatement("""
                                      INSERT INTO doctor (DoctorName, DoctorEmail, DoctorPassword, DoctorPhone, DoctorAddress) 
                                      VALUES (?, ?, ?, ?, ?);
                                      """);
            st.setString(1, doctor.getName());
            st.setString(2, doctor.getEmail());
            st.setString(3, doctor.getPassword());
            st.setString(4, doctor.getPhone());
            st.setString(5, doctor.getAddress());

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(DoctorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Doctor findByEmail(String email) {
        try {
            Doctor doctor = null;
            st = con.prepareStatement("select * from doctor where DoctorEmail=?");
            st.setString(1, email);

            rs = st.executeQuery();

            while (rs.next()) {
                String id = rs.getString("DoctorID");
                String name = rs.getString("DoctorName");
                String password = rs.getString("DoctorPassword");
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

}
