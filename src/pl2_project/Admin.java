/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl2_project;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author y_awn
 */
public class Admin extends Staff implements Serializable{
    public Admin(){}
    public Admin(int id,String DateOfBirth,long phone ,String address,String Gender,int age,String Name,String username,String password){
        super(id,DateOfBirth,phone,address,Gender,age,Name,username,password);
    }
 public void addNewEmployee(String userName,String password,String Name,int id,String DateOfBirth,String doj,int age,long phone,String address,double Salary, String qulaifications,String Gender){
 Employee e=new Employee(userName,password,Name,id,DateOfBirth,doj,age,phone,address,Salary ,qulaifications,Gender);
 if (e.addEmployee()){
 JOptionPane.showMessageDialog(null,"Added Successfully....!" );
 }
 else{
 JOptionPane.showMessageDialog(null,"Faildto insert");
 }
 }
}
