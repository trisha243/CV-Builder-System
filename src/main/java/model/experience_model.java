package model;

public class experience_model {
    private String company;
    private String position;
    private String duration;
    private String responsibility;
    private String skill;

    public experience_model(
            String company,
            String position,
            String duration,
            String responsibility,
            String skill
    ) {

        this.company = company;
        this.position = position;
        this.duration = duration;
        this.responsibility = responsibility;
        this.skill = skill;
    }

    public String getCompany() {

        return company;
    }
    public String getPosition() {

        return position;
    }
    public String getDuration() {

        return duration;
    }
    public String getResponsibility() {

        return responsibility;
    }
    public String getSkill() {

        return skill;
    }
}