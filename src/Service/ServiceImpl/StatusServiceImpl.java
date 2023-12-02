/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.ServiceImpl;


import Service.StatusService;
import entity.Status;
import java.sql.Connection;
/**
 *
 * @author ASUS ROG
 */
public class StatusServiceImpl implements StatusService{
    private Connection conn;

    @Override
    public Status findById(String statusID) {
        return null;
    }
}
