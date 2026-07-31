package model;

public class Education_model {
    private String university;
    private String department;
    private int semester;
    private double cgpa;

    public Education_model(
            String university,
            String department,
            int semester,
            double cgpa
    ) {

        this.university = university;
        this.department = department;
        this.semester = semester;
        this.cgpa = cgpa;
    }

    public String getUniversity() {
        return university;
    }

    public String getDepartment() {
        return department;
    }

    public int getSemester() {
        return semester;
    }

    public double getCgpa() {
        return cgpa;
    }
    

}
