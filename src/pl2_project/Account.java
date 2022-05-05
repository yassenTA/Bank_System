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
public class Account implements Serializable{
     protected int AccountNumber;
    protected double Balance;

    public Account(){}
    public Account(int AccountNumber,double Balance){
    this.AccountNumber=AccountNumber;
    this.Balance=Balance;
    }
    //setter
    public void SetAccountNumber(int AccountNumber){
    this.AccountNumber=AccountNumber;
    }
    public void SetBalance(double Balance){
    this.Balance=Balance;
    }

    //getter
    public int getAccountNumber() {
        return this.AccountNumber;
    }
    public double getBalance() {
        return this.Balance;
    }
    
}
