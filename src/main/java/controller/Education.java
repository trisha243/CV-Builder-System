package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.DBConnection;
import model.Education_model;

public class Education {

    public void saveEducation(Education_model edu) {

        try {

            Connection conn =DBConnection.getConnection();

            String query =
                    "INSERT INTO Education"
                    + "(university,department,"
                    + "semester,cgpa)"
                    + " VALUES(?,?,?,?)";

            PreparedStatement p =conn.prepareStatement(query);

            p.setString(1,edu.getUniversity());

            p.setString(2, edu.getDepartment());

            p.setInt(3,edu.getSemester());

            p.setDouble(4,edu.getCgpa());

            p.executeUpdate();

            System.out.println("Saved!");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
