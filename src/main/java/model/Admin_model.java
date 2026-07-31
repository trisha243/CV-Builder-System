package model;

public class Admin_model {

    private int admin_id;
    private String name;
    private String email;

    public Admin_model(String name, String email)    
    {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}