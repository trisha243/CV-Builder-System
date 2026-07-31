package model;

public class project_model {

    private String title;

    private String tech_used;

    private String description;

    public project_model(
            String title,
            String tech_used,
            String description
    ) {
        this.title = title;

        this.tech_used = tech_used;

        this.description = description;
    }

    public String getTitle() {

        return title;
    }
    public String getTech_used() {

        return tech_used;
    }
    public String getDescription() {

        return description;
    }
}