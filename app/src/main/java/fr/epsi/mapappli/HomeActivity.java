package fr.epsi.mapappli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    public static void displayActivity(SplashActivity activity) {
        Intent intent = new Intent(activity, HomeActivity.class);
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
        switch (v.getId()) {
            case R.id.groupInfo:
                GroupActivity.displayActivity(this);
                break;
            case R.id.categorieProduit:
                RayonActivity.displayActivity(this, "name");
                break;
        }
    }
}