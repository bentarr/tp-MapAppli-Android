package fr.epsi.mapappli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import fr.epsi.mapappli.EpsiActivity;

public class ProduitActivity extends EpsiActivity {

    private ArrayList<Produit> produits;

    public static void displayActivity(EpsiActivity activity, String name, String url) {
        Intent intent = new Intent(activity, ProduitActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("url", url);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produit);
        setTitle("Boissons");
        showBack();

        produits = new ArrayList<>();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ProduitAdapter produitAdapter = new ProduitAdapter(this, produits);
        recyclerView.setAdapter(produitAdapter);

        String wsUrl="https://djemam.com/epsi/drink.json";


        WSCall wsCall= new WSCall(wsUrl, new WSCall.Callback() {
            @Override
            public void onComplete(String result) {
                try {
                    JSONObject jsonObject=new JSONObject(result);
                    JSONArray jsonItems=jsonObject.getJSONArray("items");
                    for (int i=0;i<jsonItems.length();i++){
                        Produit produit = new Produit(jsonItems.getJSONObject(i));
                        produits.add(produit);
                    }
                    produitAdapter.notifyDataSetChanged();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(ProduitActivity.this,e.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
        wsCall.run();
    }
}