package fr.epsi.mapappli;

import org.json.JSONObject;

public class Rayon {
    private String title;
    private String rayon_url;

    public Rayon(JSONObject o){
        this.title = o.optString("title", "Erreur");
        this.rayon_url = o.optString("products_url", "Erreur");
    }

    public String getTitle() {
        return this.title;
    }

    public String getRayonUrl() {
        return this.rayon_url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRayonUrl(String productsUrl) {
        this.rayon_url = rayon_url;
    }
}
