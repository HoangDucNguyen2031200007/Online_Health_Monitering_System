package Service.ServiceImpl;

import java.sql.Connection;
import java.util.List;

import Connection.JDBCConnection;
import Model.Doctor;
import Model.Patient;
import Model.Status;
import Service.PatientService;

public class PatientServiceImpl implements PatientService {

    private Connection con = new JDBCConnection().getConnect();

    @Override
    public Patient findById(String patientID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
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
