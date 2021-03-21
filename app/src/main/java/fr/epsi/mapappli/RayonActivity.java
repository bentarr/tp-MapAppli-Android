package fr.epsi.mapappli;

import android.content.Intent;

import java.util.ArrayList;

public class RayonActivity extends MainActivity{
    private ArrayList<Rayon> rayon;

    public static void displayActivity(MainActivity activity, String name, String url){
        Intent intent = new Intent(activity, RayonActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("url", url);
        activity.startActivity(intent);
    }

}
