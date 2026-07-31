package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.DBConnection;
import model.skill_model;

public class skill {

    public void saveSkill(
            skill_model skill
    ) {

        try {

            Connection conn =DBConnection.getConnection();

            String query ="INSERT INTO Skill"+ "(skill_name,skill_level)"+ " VALUES(?,?)";

            PreparedStatement p =conn.prepareStatement(query);

            p.setString(1,skill.getSkill_name());
            p.setString(2,skill.getLevel());
            p.executeUpdate();

            System.out.println("Saved!");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}