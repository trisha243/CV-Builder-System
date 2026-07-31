package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.DBConnection;
import model.achievement_model;

public class achievement{

    public void saveAchievement( achievement_model achievement) {
        try {
            Connection conn =DBConnection.getConnection();

            String query = "INSERT INTO Achievement"+ "(title,year)"+ " VALUES(?,?)";
            PreparedStatement p =conn.prepareStatement(query);
            p.setString(1,achievement.getTitle());
            p.setInt(2,achievement.getYear());
            p.executeUpdate();
            System.out.println("Saved!");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
