/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl2_project;
import java.io.Serializable;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author y_awn
 */
public class Employee extends Staff implements Serializable {
    protected String qulaifications;
    protected double salary;
    protected String doj;
 public final String EmployeeFileName="Employee.bin";
 public static ArrayList<Employee> employee= new ArrayList<Employee>();
 FileManger fileManager = new FileManger();
 public Employee(){}
public Employee(String userName, String password, String Name, int id, String DateOfBirth, String doj, int age, long phone, String address,double Salary, String qulaifications, String Gender) {
    super(id,DateOfBirth,phone,address,Gender,age,Name,userName,password);
    this.qulaifications = qulaifications;
    this.salary=Salary;
    this.doj=doj;
    
}

   
    //setter
    public void Setqulaifications(String qulaifications){
        this.qulaifications=qulaifications;
    }
    public void Setsalary(double salary){
        this.salary=salary;
    }  
    public void Setdoj(String doj){
        this.doj=doj;
    }
    
    //getter
    public String getqulaifications(){
        return this.qulaifications;
    } 
    public double getsalary(){
        return this.salary;
    }
    public String getdoj(){
        return this.doj;
    }
    
    public boolean addEmployee(){
    employee=(ArrayList<Employee>) fileManager.read(EmployeeFileName);
    employee.add(this);
    return committofile();
    } 
    public boolean committofile(){
    return fileManager.write(EmployeeFileName,employee);
    }
    public void LoadFromFile(){
        employee = (ArrayList<Employee>) fileManager.read(EmployeeFileName);
    }
public int getEmployeeIndex(int id) {
        int x=-1;
        LoadFromFile();
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i).getId() == id) {
                x=i;
                break;
                
            }
        }

        return x;
    }
public boolean deleteEmployee(int id) {
          LoadFromFile();
        int index = getEmployeeIndex(id);

        if (index != -1) {
            employee.remove(index);

            return committofile();
        }

        return false;
    }

   public boolean updateEmployee() {
        LoadFromFile();
        int index = getEmployeeIndex(this.getId());

        if (index != -1) {
            employee.set(index, this);

            return committofile();
        }

        return false;
    }

    
    
    

   public int searchEmployeeById(int id) {
        Employee temp = new Employee();
        LoadFromFile();
        int index = getEmployeeIndex(id);
        if (index != -1) {
            return index;
        } else {
            return -1;
        }
    } 
  public void addNewCustomer(String Name, int id,String FatherName,String MotherName,int accountnumber, String DateOfBirth,String email, int age, long phone, String address,double balance,String maritalstatus, String Gender,String pathImage){
       Customer c=new Customer(Name,id,FatherName,MotherName,accountnumber,DateOfBirth,email,age,phone,address,balance,maritalstatus,Gender,pathImage);
        if (c.addCustomer()){
        JOptionPane.showMessageDialog(null,"Added Successfully....!" );
        }
        else{
        JOptionPane.showMessageDialog(null,"Faildto insert");
        }
 }
    public void addnewTransaction(String Date,int AccountNumber,double Balance,int TransactionNumber,double Money,String Transactionkind,int SAccountNumber){
    Transactions t= new Transactions ();
    if(t.addtransaction()){
    JOptionPane.showMessageDialog(null,"Added Successfully....!" );
    }
     else{
        JOptionPane.showMessageDialog(null,"Faild to insert");
        }
    
    }
public ArrayList<Employee> listEmployee(){
            LoadFromFile();
            return employee;
        }
    
}