package fr.epsi.mapappli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    String urlNature= "https://www.slate.fr/sites/default/files/styles/1060x523/public/lukasz-szmigiel-jfcviyfycus-unsplash.jpg";
    String urlEspace= "https://www.entreprendre.fr/wp-content/uploads/AdobeStock_2015532431.jpg";

    public static void displayActivity(SplashActivity activity){
        Intent intent = new Intent(activity,HomeActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Home");
        findViewById(R.id.groupInfo).setOnClickListener(this);
        findViewById(R.id.categorieProduit).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

    }
}