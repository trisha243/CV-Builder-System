package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.DBConnection;
import model.experience_model;

public class experience{

    public void saveExperience(
            experience_model exp
    ) {
        try {
            Connection conn = DBConnection.getConnection();
            String query ="INSERT INTO Experience"+ "(company,position,"+ "duration,responsibility,"+ "skills)"+ " VALUES(?,?,?,?,?)";

            PreparedStatement p =conn.prepareStatement(query);
            p.setString(1, exp.getCompany());
            p.setString( 2,exp.getPosition());
            p.setString(3,exp.getDuration());
            p.setString( 4,exp.getResponsibility());
            p.setString(5,exp.getSkill());
            p.executeUpdate();

            System.out.println("Saved!");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}