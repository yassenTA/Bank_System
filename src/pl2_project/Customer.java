/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl2_project;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import static pl2_project.Employee.employee;

/**
 *
 * @author y_awn
 */
public class Customer extends Person implements Serializable{
    protected double balance;
    protected String maritalstatus; 
    protected int accountnumber;
    protected String FatherName;
    protected String MotherName;
    protected String email;
    protected String pathImage;
    Account A=new Account();
    public final String CustomerFileName="Customer.bin";
 public static ArrayList<Customer> customer= new ArrayList<Customer>();
 FileManger fileManager = new FileManger();
public Customer(){}
public Customer( String Name, int id,String FatherName,String MotherName,int accountnumber, String DateOfBirth,String email, int age, long phone, String address,double balance,String maritalstatus, String Gender,String pathImage){
 super(id,DateOfBirth,phone,address,Gender,age,Name);
 this.balance=balance;
 this.maritalstatus=maritalstatus;
 this.accountnumber=accountnumber;
 this.FatherName=FatherName;
 this.MotherName=MotherName;
 this.pathImage=pathImage;
 this.email=email;
}
public void Setbalance(double balance){
    this.balance=balance;
    }
public void Setemail(String email){
    this.email=email;
    }
public void Setaccountnumber(int accountnumber){
    this.accountnumber=accountnumber;
    }
public void Setmaritalstatus(String maritalstatus){
    this.maritalstatus=maritalstatus;
    }
     public void SetMotherName(String MotherName){
    this.MotherName=MotherName;
    }
      public void SetFatherName(String FatherName){
    this.FatherName=FatherName;
    }
     
    
      //getter
       public double getbalance() {
        return this.balance;
    }
        public int getaccountnumber() {
        return this.accountnumber;
    }
      public String getMotherName() {
        return this.MotherName;
    }
        public String getmaritalstatus() {
        return this.maritalstatus;
    }
       public String getemail() {
        return this.email;
    }
      public String getFatherName() {
        return this.FatherName;
    }
     
   public boolean addCustomer(){
    LoadFromFile();
    customer.add(this);
    return committofile();
    } 
    public boolean committofile(){
    return fileManager.write(CustomerFileName,customer);
    }
    public void LoadFromFile(){
        customer = (ArrayList<Customer>) fileManager.read(CustomerFileName);
    }
public int getCustomerIndex(int id) {
        int x=-1;
        LoadFromFile();
        for (int i = 0; i < customer.size(); i++) {
            if (customer.get(i).getId() == id) {
                x=i;
                break;
                
            }
        }

        return x;
    }
public int getCustomerIndex2(int AccountNumber) {
        int x=-1;
        LoadFromFile();
        for (int i = 0; i < customer.size(); i++) {
            if (customer.get(i).getaccountnumber() == AccountNumber) {
                x=i;
                break;
                
            }
        }

        return x;
    }
public boolean deleteCustomer(int id) {
          LoadFromFile();
        int index = getCustomerIndex(id);

        if (index != -1) {
            customer.remove(index);

            return committofile();
        }

        return false;
    }

   public boolean updateCustomer() {
        LoadFromFile();
        int index = getCustomerIndex(this.getId());

        if (index != -1) {
            customer.set(index, this);

            return committofile();
        }

        return false;
    }
   public int searchCustomerById(int id) {
        Customer temp = new Customer();
        LoadFromFile();
        int index = getCustomerIndex(id);
        if (index != -1) {
            return index;
        } else {
            return -1;
        }
    }  
    

 public ArrayList<Customer> listCustomer(){
            LoadFromFile();
            return customer;
        }
    
    
      

}

