package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.DBConnection;
import model.project_model;

public class project {

    public void saveProject(
            project_model project
    ) {
        try {

            Connection conn =DBConnection.getConnection();

            String query ="INSERT INTO Project"+ "(project_title,"+ "technologies,"+ "description)"+ " VALUES(?,?,?)";

            PreparedStatement p =conn.prepareStatement(query);
            p.setString(1,project.getTitle());
            p.setString(2,project.getTech_used());
            p.setString(3,project.getDescription() );
            p.executeUpdate();
            System.out.println("Saved!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
