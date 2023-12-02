/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function.FuctionExecute;

import Function.LoginFunction;
import Model.Doctor;
import Model.Patient;
import Page.DoctorPage;
import Page.PatientPage;
import Service.servicelmpl.DoctorServiceImpl;
import Service.servicelmpl.PatientServiceImpl;

/**
 *
 * @author penta
 */
public class LoginExecute implements LoginFunction{
    DoctorServiceImpl dr ;
    PatientServiceImpl pt;
    @Override
    public boolean LoginSuccess(String email, String password) {
        Doctor drExc= dr.login(email, password);
        if(drExc!=null){
             DoctorPage dr= new DoctorPage(drExc);
                dr.setVisible(true);
                return true;
        }
        Patient ptExc = pt.login(email, password);
        if(ptExc!=null){
            PatientPage pt= new PatientPage(ptExc);
                pt.setVisible(true);
                return true;
        }
        return false;
    }
    
}
