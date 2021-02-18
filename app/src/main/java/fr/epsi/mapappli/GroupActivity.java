package fr.epsi.mapappli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GroupActivity extends EpsiActivity {

    public static void displayActivity(HomeActivity activity){
        Intent intent = new Intent(activity,GroupActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        setTitle("Groupe d'étudiants");

    }
}
