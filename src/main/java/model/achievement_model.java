package model;

public class achievement_model {
    private String title;
    private int year;

    public achievement_model(
            String title,
            int year
    ) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
}