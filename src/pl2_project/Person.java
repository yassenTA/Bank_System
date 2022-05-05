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
public class Person  implements Serializable{
    protected int id;
    protected String DateOfBirth;
     protected long phone;
    protected String address;
    protected String Gender;
    protected int age;
    protected String Name;
    public Person(){}
    public Person(int id,String DateOfBirth,long phone ,String address,String Gender,int age,String Name){
        this.id=id;
        this.DateOfBirth=DateOfBirth;
        this.phone=phone;
        this.address=address;
        this.Gender=Gender;
        this.age=age;
        this.Name=Name;
        
    }
     // setter
    public void SetId(int id){
    this.id=id;
    }
     
      public void SetDateOfBirth(String DateOfBirth){
    this.DateOfBirth=DateOfBirth;
    }
      public void SetPhone(long phone){
    this.phone=phone;
    }
      public void SetAddress(String address){
    this.address=address;
    }
      public void SetGender(String Gender){
    this.Gender=Gender;
    }
      public void SetAge(int age){
    this.age=age;
    }
      public void SetName(String name){
    this.Name=name;
    }
      //getter
      
      public String getDateOfBirth() {
        return this.DateOfBirth;
    }
      public long getphone (){
        return this.phone;
    }
      public String getaddress() {
        return this.address;
    }
      public String getGender() {
        return this.Gender;
    }
      public int getage() {
        return this.age;
    }
      public String getName() {
        return this.Name;
    }
      public int getId(){
      return this.id;
      }
      
}
