package fr.epsi.mapappli;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class RayonActivity extends EpsiActivity{

    private ArrayList<Rayon> rayon;

    public static void displayActivity(HomeActivity activity, String name, String url){
        Intent intent = new Intent(activity, RayonActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("url", url);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rayon);
        setTitle("Rayon");
        showBack();
    }

}
