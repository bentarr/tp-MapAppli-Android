package fr.epsi.mapappli;

import java.io.Serializable;

public class Students implements Serializable {

    public String Picture;
    public String Name;
    public String Mail;
    public String Group;

    public Students(String Picture, String Name, String Mail, String Group){
        this.Picture = Picture;
        this.Name = Name;
        this.Mail = Mail;
        this.Group = Group;
    }

    public String getPicture (){return this.Picture;}
    public String getName (){return this.Name;}
    public String getMail (){return this.Mail;}
    public String getGroup(){return this.Group;}

}