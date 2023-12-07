/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.ServiceImpl;

import ConcreteBuilder.StatusConcreteBuilder;
import Context.DBConnUtils;
import Service.StatusService;
import Entity.Status;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StatusServiceImpl implements StatusService {

    private Connection con = DBConnUtils.getConnection();
    private PreparedStatement st;
    private ResultSet rs;

    @Override
    public Status findById(int statusID) {
        Status status = null;
        try {
            st = con.prepareStatement("""
                                      select * from patientstatus where PatientStatusID=?;
                                      """);
            st.setInt(1, statusID);

            rs = st.executeQuery();

            if (rs.next()) {
                String statusId = rs.getString("PatientStatusID");
                String heartRate = rs.getString("HeartRate");
                String bloodPress = rs.getString("BloodPressure");

                status = new StatusConcreteBuilder()
                        .setStatusID(statusId)
                        .setHeartRate(heartRate)
                        .setBloodPressure(bloodPress)
                        .build();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StatusServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public boolean updateStatus(Status status) {
        try {
            st = con.prepareStatement("""
                                    UPDATE patientstatus
                                       SET HeartRate= ?
                                          ,BloodPressure = ?
                                     WHERE PatientStatusID=?
                                    """);
            st.setString(1, status.getHeartRate());
            st.setString(2, status.getBloodPressure());
            st.setString(3, status.getStatusID());

            return st.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(StatusServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public int addStatus() {
        try {
            st = con.prepareStatement("""
                                    INSERT INTO patientstatus (HeartRate ,BloodPressure)
                                    VALUES ('good','good')
                                    """, Statement.RETURN_GENERATED_KEYS);
            st.executeUpdate();

            rs = st.getGeneratedKeys();

            if (rs.next()) {
                return rs.getInt(1);
            } else {
                return -1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(StatusServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}
