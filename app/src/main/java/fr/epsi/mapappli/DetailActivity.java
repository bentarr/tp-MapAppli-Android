package fr.epsi.mapappli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends EpsiActivity {


    public static void displayActivity(EpsiActivity activity, Produit produit) {
        Intent intent = new Intent(activity, DetailActivity.class);
        intent.putExtra("name", produit.getNom());
        intent.putExtra("url", produit.getUrl());
        intent.putExtra("description", produit.getDescription());
        activity.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String Nom = getIntent().getExtras().getString("name","");
        String url = getIntent().getExtras().getString("url","");
        String title = getIntent().getExtras().getString("description","");

        showBack();
        setTitle(Nom);

        ImageView imageView = findViewById(R.id.imageProduit);
        Picasso.get().load(url).into(imageView);
    }
}