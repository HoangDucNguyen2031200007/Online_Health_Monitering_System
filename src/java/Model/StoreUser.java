/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.io.*;
import java.util.*;
/**
 *
 * @author penta
 */
public class StoreUser extends User{
    private boolean isDoctor;
    private String id;
    private String email;   
    private String password;
    
    private List<StoreUser> listUser= new ArrayList<>();

    public StoreUser(boolean isDoctor, String id, String email, String password) {
        this.isDoctor = isDoctor;
        this.id = id;
        this.email = email;
        this.password = password;
    }

   
    public void addList(StoreUser a){
        this.listUser.add(a);
    }
    
    public boolean login(String email, String password,int index) {
        
        if(index>=0){
            return this.checkPassword(password, index);
        }
        return  false; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void loginSuccess(String email, String password){
        int index = findEmail(email);
        boolean login=this.login(email, password,index);
        if(login){
            if(this.listUser.get(index).isDoctor){
                //transfer to doctor page
            }else{
                //transfer to patient page
            }
        }
    }
    public int findEmail(String email){
        for(StoreUser user:listUser){
            if(user.email.equals(email)){
                return listUser.indexOf(user);
            }
        }
        return -1;
    }
    public boolean checkPassword(String password, int ind){
        if(listUser.get(ind).password.equals(password)){
            return true;
        }
        return false;
    }
}
