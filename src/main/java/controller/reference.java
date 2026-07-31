package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.DBConnection;
import model.reference_model;

public class reference {

    public void saveReference(reference_model ref) {

        try {
            Connection conn = DBConnection.getConnection();
            String query = "INSERT INTO ReferenceInfo"+ "(teacher_name,contact)"+ " VALUES(?,?)";
            PreparedStatement p =conn.prepareStatement(query);
           
            p.setString( 1,ref.getTeacher() );
            p.setString(2,ref.getContact() );
   
            p.executeUpdate();
            System.out.println("Saved!");         
  
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
