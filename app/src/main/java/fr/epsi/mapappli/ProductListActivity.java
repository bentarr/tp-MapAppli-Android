package fr.epsi.mapappli;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ProductListActivity extends EpsiActivity {
    private ArrayList<Produit> produits;

    public static void displayActivity(EpsiActivity activity)
    {
        Intent intent = new Intent(activity, ProductListActivity.class);
    }
}
