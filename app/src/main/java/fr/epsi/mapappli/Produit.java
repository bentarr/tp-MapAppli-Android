package fr.epsi.mapappli;

import org.json.JSONObject;

public class Produit {
    private String url;
    private String nom;
    private String description;

    public Produit(JSONObject o)
    {
        this.nom = o.optString("nom", "Erreur");
        this.description = o.optString("description", "Erreur");
        this.url = o.optString("url", "Erreur");
    }

    public String getUrl()
    {
        return this.url;
    }
    public String getNom()
    {
        return this.nom;
    }
    public String getDescription()
    {
        return this.description;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }


}
