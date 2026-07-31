package model;

public class skill_model {

    private String skill_name;

    private String level;

    public skill_model(String skill_name,String level) {
        this.skill_name = skill_name;
        this.level = level;
    }
    public String getSkill_name() {

        return skill_name;
    }

    public String getLevel() {

        return level;
    }
}