package Service.ServiceImpl;

import ConcreteBuilder.DoctorConcreteBuilder;
import Context.DBConnUtils;
import java.sql.Connection;
import java.util.List;

import Entity.Doctor;
import Entity.Patient;
import Service.DoctorService;
import Service.PatientService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoctorServiceImpl implements DoctorService {

    private Connection con;
    private PatientService patientService = new PatientServiceImpl();

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
    public boolean deleteById(String doctorID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public boolean saveDoctor(Doctor doctor) {
        try {
            con = DBConnUtils.getConnection();

            String sql = """
                         INSERT INTO doctor (DoctorName ,DoctorEmail ,DoctorPassword ,DoctorPhone ,DoctorAddress)
                         VALUES (?,?,?,?,?)                         
                         """;

            PreparedStatement st = con.prepareStatement(sql);

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
    public Doctor login(String email, String password) {
        Doctor doctor = null;
        try {
            con = DBConnUtils.getConnection();

            PreparedStatement st = con.prepareStatement("select * from doctor where DoctorEmail=? and DoctorPassword=?");
            st.setString(1, email);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String id = rs.getString("DoctorID");
                String name = rs.getString("DoctorName");
                String phone = rs.getString("DoctorPhone");
                String address = rs.getString("DoctorAddress");
                List<Patient> patients = patientService.getAllByDoctorId(id);

                doctor = new DoctorConcreteBuilder()
                        .setDoctorId(id)
                        .setDoctorName(name)
                        .setDoctorEmail(email)
                        .setDoctorPassword(password)
                        .setDoctorPhone(phone)
                        .setDoctorAddress(address)
                        .setPatients(patients)
                        .build();
            }
            return doctor;
        } catch (SQLException ex) {
            Logger.getLogger(DoctorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
