package model;

public class reference_model {

    private String teacher;
    private String contact;

    public reference_model(
            String teacher,
            String contact
    ) {
        this.teacher = teacher;
        this.contact = contact;
    }

    public String getTeacher() {
        return teacher;
    }
    public String getContact() {
        return contact;
    }
}