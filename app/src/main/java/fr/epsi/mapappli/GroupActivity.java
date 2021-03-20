package fr.epsi.mapappli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GroupActivity extends EpsiActivity implements View.OnClickListener {


    public static void displayActivity(HomeActivity activity) {
        Intent intent = new Intent(activity, GroupActivity.class);
        activity.startActivity(intent);
    }


    public Students Tom = new Students("photo1", "Tom Bazats", "tom.bazats@epsi.fr", "Groupe 2");
    public Students Jordan = new Students("photo2", "Jordan Leston", "jordan.leston@epsi.fr", "Groupe 2");
    public Students Paul = new Students("photo3", "Paul Bénétier", "paul.benetier@epsi.fr", "Groupe 2");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        setTitle("Groupe d'étudiants");
        showBack();

        findViewById(R.id.bouttonTom).setOnClickListener(this);
        findViewById(R.id.bouttonPaul).setOnClickListener(this);
    }


    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bouttonJordan:
                getIntent().putExtra("Students", this.Jordan);
                startActivity(getIntent());
                break;

            case R.id.bouttonTom:
                getIntent().putExtra("Students", this.Tom);
                startActivity(getIntent());
                break;

            case R.id.bouttonPaul:
                getIntent().putExtra("Students", this.Paul);
                startActivity(getIntent());
                break;
        }
    }

}