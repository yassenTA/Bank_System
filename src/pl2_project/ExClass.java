/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl2_project;

import javax.swing.JOptionPane;

/**
 *
 * @author y_awn
 */
public class ExClass {
    String UserName;
    String Password;
    String Email;
    String Number;
    String Name;
    String DOB;
    
    //methods
    public int ValidateUS(String UserName){
    
    if(UserName.matches("[A-Za-z0-9_]+")){
    return 1;
    }
    else 
        return 0;
    }
    public int ValidatePassword(String Password){
       
    if(Password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$")){
    return 1;
    }
    else
        return 0;
    }
    public int ValidateEmail(String Email){
          if(Email.matches("^[A-Za-z0-9+_.-]+@(.+)$")){
    return 1;
    }
    else
        return 0;
    }
    public int ValidateNumber(String Number){
      
    if(Number.matches("[0-9]+")){
    return 1;
    }
    else 
        return 0;
    
    }
    public int ValidtaeName(String Name){
     
    if(Name.matches("^[\\p{L} .'-]+$")){
    return 1;}
    else
        return 0;
    }
    public int ValidateDOB(String DOB){
     
    if(DOB.matches("yyyy/MM/dd")){
    return 1;
    }
    else 
        return 0;
    }
}
