/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanager.controller;

import ec.edu.espe.filemanager.model.usuario;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADRIAN-PC
 */
public class Students {
     public static void mainStudents() throws IOException {
        File archive = null;
        FileWriter insertData;
        PrintWriter line;
        String name;
        String surname;
        String id;
        String phone;
        usuario usuario1 = new usuario("Hola","Chao","Como","Estas");
        usuario1.createBinarydata();
        
        
        
        archive = new File("StudentData.txt");

        if (!archive.exists()) {
            try {
                archive.createNewFile();

                name = JOptionPane.showInputDialog(null, "type the student's name");
                surname = JOptionPane.showInputDialog(null, "Type the students last name");
                id = JOptionPane.showInputDialog(null, "type your ID");
                phone = JOptionPane.showInputDialog(null, "type your phone");

                insertData = new FileWriter(archive, true);
                line = new PrintWriter(insertData);

                line.print(name + " ; ");
                line.print(surname + " ; ");
                line.print(phone + " ; ");
                line.print(id);
                line.println();

                line.close();
                insertData.close();

            } catch (IOException ex) {
                Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {

                name = JOptionPane.showInputDialog(null, "type the student's name");
                surname = JOptionPane.showInputDialog(null, "Type the students last name");
                id = JOptionPane.showInputDialog(null, "type your ID");
                phone = JOptionPane.showInputDialog(null, "type your phone");

                insertData = new FileWriter(archive, true);
                line = new PrintWriter(insertData);

                line.print(name + " ; ");
                line.print(surname + " ; ");
                line.print(phone + " ; ");
                line.print(id);
                line.println();

                line.close();
                insertData.close();

            } catch (IOException ex) {
                Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    

}
