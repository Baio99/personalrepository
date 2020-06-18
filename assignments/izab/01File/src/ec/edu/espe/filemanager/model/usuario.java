/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanager.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author ADRIAN-PC
 */
public class usuario implements Serializable {
          
        private String name;
        private String surname;
        private String id;
        private String phone;

        public usuario(String name, String surname, String id, String phone) {
            this.name = name;
            this.surname = surname;
            this.id = id;
            this.phone = phone;
        }

   
        @Override
        public String toString() {
            
            return "name"+ ";" + "surname" + ";" + "id";
            
        }
        public void createBinarydata() throws IOException {

        usuario usersave = new usuario("user", "name", " surname","id");
        FileOutputStream archive = null;

        try {
            archive = new FileOutputStream("StudentsBin.txt");
            ObjectOutputStream writetoFileBinary = new ObjectOutputStream(archive);
            writetoFileBinary.writeObject(usersave);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    }

