package fr.epsi.mapappli;

import java.io.Serializable;

public class Students implements Serializable {

    public String Name;
    public String Picture;
    public String Mail;
    public String Group;

    public Students(String Name, String Picture, String Mail, String Group){
        this.Name = Name;
        this.Picture = Picture;
        this.Mail = Mail;
        this.Group = Group;
    }

    public String getName () { return this.Name; }
    public String getPicture (){return this.Picture;}
    public String getMail (){return this.Mail;}
    public String getGroup(){return this.Group;}

}