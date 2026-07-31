package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.DBConnection;
import model.profile_model;

public class profile {
     public void saveProfile(profile_model profile){
          try{

            Connection conn = DBConnection.getConnection();

            String query = "INSERT INTO Profile(address, phone, language) VALUES(?,?,?)";

            PreparedStatement p = conn.prepareStatement(query);

            p.setString(1, profile.getAddress());
            p.setString(2, profile.getPhone());
            p.setString(3, profile.getLanguage());

            p.executeUpdate();

            System.out.println("Profile Saved!");

        }catch(Exception e){

            e.printStackTrace();
        }
    }
         
}
