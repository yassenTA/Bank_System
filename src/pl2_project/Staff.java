/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl2_project;

import java.io.Serializable;

/**
 *
 * @author y_awn
 */
public class Staff extends Person implements Serializable{
    protected String userName;
    protected String password;
    public Staff(){}
    public Staff(int id,String DateOfBirth,long phone ,String address,String Gender,int age,String Name,String username,String password){
        super(id,DateOfBirth,phone,address,Gender,age,Name);
        this.userName=username;
        this.password=password;
    }
    //setter
    public void SetUserName(String userName){
    this.userName=userName;
    }
      public void SetPassword(String password){
    this.password=password;
    }
      //getter
      public String getuserName() {
        return this.userName;
    }
      public String getpassword() {
        return this.password;
    }
}
