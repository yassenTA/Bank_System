/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl2_project;

/**
 *
 * @author Y-Tamer
 */
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import static pl2_project.Customer.customer;
public class Transactions extends Account implements Serializable{
    public static ArrayList<Transactions>transactions=new ArrayList<Transactions>();
FileManger filem= new FileManger();
public final String Trans="Transactions.bin";
    private double Money;
    private int TransactionNumber;
    private String Date;
    private String TranactionKind;
    int SAccountNumber;

    public Transactions()
    {}
    public Transactions(String Date,int AccountNumber,double Balance,int TransactionNumber,double Money,String TransactionKind,int SAccountNumber){
    super(AccountNumber,Balance);
        
    this.Money=Money;
    this.TransactionNumber=TransactionNumber;
    this.Date=Date;
    this.TranactionKind=TransactionKind;
    this.SAccountNumber=SAccountNumber;
    }
   //setter
    public void setMoney(double Money){
    this.Money=Money;
    }
    
    public void setTransactionKind(String TransactionKind){
    this.TranactionKind=TransactionKind;
    }
  
    public void setTransactionNumber(int TransactionNumber){
    this.TransactionNumber=TransactionNumber;
    }
    public void setDate(String Date){
    this.Date=Date;
    }
    //getter
    public double getMoney(){
    return this.Money;
    }
   
    public String getTransactionKind(){
    return this.TranactionKind;
    }
    
    public double getTransactionNumber(){
    return this.TransactionNumber;
    }
    public String getDate(){
    return this.Date;
    }
    
   public boolean addtransaction(){
    LoadFromFile();
    transactions.add(this);
    return committofile();
    } 
    public boolean committofile(){
    return filem.write(Trans,transactions);
    }
    public void LoadFromFile(){
        transactions=(ArrayList<Transactions>) filem.read(Trans);
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
 public int[] getCustomerIndex3(int AccountNumber) {
         int []n = null;
        int m=0;
        LoadFromFile();
           JOptionPane.showMessageDialog(null,"1");
        for (int i = 0; i < transactions.size(); i++) {
               JOptionPane.showMessageDialog(null,transactions.size());
               
               
            if (transactions.get(i).getAccountNumber() == AccountNumber) {
                  JOptionPane.showMessageDialog(null,"3");
                n[m] = i;
                m++;
               
               
                
            }
        }

        return n;
    }
       public ArrayList<Transactions> listTransaction(){
            LoadFromFile();
            return transactions;
        } 
}