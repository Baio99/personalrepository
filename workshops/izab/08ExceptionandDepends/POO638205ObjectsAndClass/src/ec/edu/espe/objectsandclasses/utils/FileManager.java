/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.objectsandclasses.utils;

/**
 *
 * @author ADRIAN-PC
 */
public class FileManager {
    
    public boolean createFile(String fileName){
        
        try{
            System.out.println("creating file ->" + fileName);
            //code that runs our application
            
            return true;
        }
        catch(Exception ex){
            System.out.println("creating file ->" + fileName + "FAILED :(");
            //code to handle the runtime error
            //errors: file thast noy exist, permisions, open the file
            return false;
        }
    }
        
    public boolean writeString(String data, String fileName){

      try{

            System.out.println("Writing" + data +"in file :" + fileName);
             //code to write a string in a file
             return true;
}
             
            catch(Exception ex){
                 System.out.println("Writing" + data +"in file :" 
                 + ":" + fileName + "FAILED :(");
                 //code to handle this error
                 return false;
                 
            }

    }
    public String read(String fileName){
        String data;
        data = new String ("");
        try{
            System.out.println("reading data from" + fileName);
            //code to read the data from the file
            data = "1, Lucy, white, 2, false";
            return data;
            
        }
        catch(Exception ex){
            System.out.println("Failing to read from" + fileName);
            //code to handle this error
            return data;
        }
    }
}
