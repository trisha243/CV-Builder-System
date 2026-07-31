package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.DBConnection;

public class Admin {

    public void manageUsers() {
        try {
            Connection conn =DBConnection.getConnection();
            String query = "SELECT * FROM user";
            PreparedStatement p =conn.prepareStatement(query);
            ResultSet rs =  p.executeQuery();  
            while(rs.next()) {
                System.out.println(  rs.getString("email") );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void manageTemplate() {
        System.out.println("Template Managed!"  );
                
      
    }
    public void postTips() {
        System.out.println( "Tips Posted!" );

    }
}
