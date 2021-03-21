package fr.epsi.mapappli;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RayonActivity extends EpsiActivity{

    private ArrayList<Rayon> rayon = new ArrayList();

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

        RecyclerView recyclerView = findViewById(R.id.recyclerViewRayon);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RayonAdapter rayonAdapter = new RayonAdapter(this, rayon);
    }

    String url = "https://djemam.com/epsi/categories.json";
    WSCall wsCall = new WSCall(url, new WSCall.Callback() {

        @Override
        public void onComplete(String result) {

        }

        @Override
        public void onError(Exception e) {

        }
    });
}