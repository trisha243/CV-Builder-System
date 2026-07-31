package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.DBConnection;
import model.CV_model;

public class CV {
    public void saveCV(CV_model cv)          
    {
        try {
            Connection conn =DBConnection.getConnection();
            String query ="INSERT INTO CV" + "(template_type," + "language,"+ "created_date,"+ "completion_status)"  + " VALUES(?,?,?,?)";

            PreparedStatement p = conn.prepareStatement(query);
      
            p.setString(1, cv.getTemplate_type()  );
                   
            p.setString(2,cv.getLanguage());
 
            p.setString(3,  cv.getCreated_date());
            p.setInt(4, cv.getCompletion_status() );
            p.executeUpdate();


        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    public void previewCV() {

        System.out.println( "CV Preview" );              
    }

    public void downloadPDF() {
        System.out.println("PDF Downloaded" );
   
    }
}