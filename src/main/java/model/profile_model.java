package model;


public class profile_model {
    private String address;
    private String phone;
    private String language;
    
    public profile_model(String address, String phone, String language) {

        this.address = address;
        this.phone = phone;
        this.language = language;
    }
     public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getLanguage() {
        return language;
    }
       
}
