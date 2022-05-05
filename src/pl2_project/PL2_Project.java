/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl2_project;

import GUI.Loginfrm;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author y_awn
 */
public class PL2_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
      
       Loginfrm f;
       f= new Loginfrm();
       f.setVisible(true);
       if(f.getFrame()==2){
       f.setVisible(false);
       }
       
   
    }
    
}
