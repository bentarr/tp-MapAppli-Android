package fr.epsi.mapappli;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class RayonActivity extends EpsiActivity{

    private ArrayList<Rayon> rayonActivity;

    public static void displayActivity(HomeActivity activity, String name){
        Intent intent = new Intent(activity, RayonActivity.class);
        intent.putExtra("title", name);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rayon);
        setTitle("Rayon de catégorie");
        showBack();

        rayonActivity = new ArrayList<>();
        RecyclerView recyclerView = findViewById(R.id.recyclerViewRayon);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RayonAdapter rayonAdapter = new RayonAdapter(this, rayonActivity);
        recyclerView.setAdapter(rayonAdapter);

        String url = "https://djemam.com/epsi/categories.json";
        WSCall wsCall = new WSCall(url, new WSCall.Callback() {

            @Override
            public void onComplete(String result) {
                try {
                    JSONObject jsonObject = new JSONObject(result);
                    JSONArray jsonArray = jsonObject.getJSONArray("items");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        Rayon rayon = new Rayon(jsonArray.getJSONObject(i));
                        rayonActivity.add(rayon);
                    }
                    rayonAdapter.notifyDataSetChanged();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(RayonActivity.this,e.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
        wsCall.run();
    }
}