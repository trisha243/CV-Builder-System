package model;
public class CV_model {
    private int cv_id;
    private String template_type;
    private String language;
    private String created_date;
    private int completion_status;

    public CV_model(String template_type, String language, String created_date,int completion_status)
{
        this.template_type =template_type;            
        this.language = language;              
        this.created_date =created_date;              
        this.completion_status = completion_status;
               
    }

    public String getTemplate_type() {
        return template_type;
    }
    public String getLanguage() {
        return language;
    }
    public String getCreated_date() {
        return created_date;
    }
    public int getCompletion_status() {
        return completion_status;
    }
}