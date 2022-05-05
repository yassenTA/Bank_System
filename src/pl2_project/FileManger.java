/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl2_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author y_awn
 */
public class FileManger implements Serializable {
    public boolean write(String filepath ,Object data){
        try{
        ObjectOutputStream writter=new ObjectOutputStream(new FileOutputStream(filepath));
        writter.writeObject(data);
        return true;
        }
        catch(IOException e){
        System.out.println(e);
        return false;
        }
    }  
    public Object read(String filepath){
        Object result=null;
      try{
          ObjectInputStream Reader=new ObjectInputStream(new FileInputStream(filepath));
          result = Reader.readObject();
      }
      catch(IOException | ClassNotFoundException e){
      System.out .println(e);
      }
      return result;
    }
    
}

        
