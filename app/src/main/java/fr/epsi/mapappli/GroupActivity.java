package fr.epsi.mapappli;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GroupActivity extends EpsiActivity implements View.OnClickListener {


    public static void displayActivity(HomeActivity activity) {
        Intent intent = new Intent(activity, GroupActivity.class);
        activity.startActivity(intent);
    }


    public Students Tom = new Students("Tom Bazats", "photo1", "tom.bazats@epsi.fr", "Groupe 2");
    public Students Jordan = new Students("Jordan Leston", "dgtbdz", "jordan.leston@epsi.fr", "Groupe 2");
    public Students Paul = new Students("Paul Bénétier", "ddsdscez", "paul.benetier@epsi.fr", "Groupe 2");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        setTitle("Groupe d'étudiants");
        showBack();

        findViewById(R.id.bouttonTom).setOnClickListener(this);
        findViewById(R.id.bouttonJordan).setOnClickListener(this);
        findViewById(R.id.bouttonPaul).setOnClickListener(this);
    }


    public void onClick(View v) {
        Context activity = getApplicationContext();
        Intent intent = new Intent(activity, ProfilActivity.class);

        switch (v.getId()){
            case R.id.bouttonTom:
                intent.putExtra("Students", this.Tom);
                startActivity(intent);
                break;

            case R.id.bouttonJordan:
                intent.putExtra("Students", this.Jordan);
                startActivity(intent);
                break;

            case R.id.bouttonPaul:
                intent.putExtra("Students", this.Paul);
                startActivity(intent);
                break;
        }
    }
}