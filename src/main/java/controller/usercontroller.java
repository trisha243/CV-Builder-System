package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.DBConnection;
import model.usermodel;


public class usercontroller {

   public boolean register(usermodel user) {

    try {

        Connection conn = DBConnection.getConnection();

        String query = "INSERT INTO user(name,email,password) VALUES(?,?,?)";

        PreparedStatement p = conn.prepareStatement(query);
        p.setString(1, user.getName());
        p.setString(2, user.getEmail());
        p.setString(3, user.getPassword());

        p.executeUpdate();

      
    } catch (Exception e) {
        e.printStackTrace();
    }

    return false;
}
}