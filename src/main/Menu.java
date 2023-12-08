/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Service.ServiceImpl.PatientServiceImpl;

/**
 *
 * @author ASUS ROG
 */
public class Menu {
    public static void main(String[] args) {
        PatientServiceImpl myPatientServiceImpl = new PatientServiceImpl();
        myPatientServiceImpl.findById("1");
    }
}
