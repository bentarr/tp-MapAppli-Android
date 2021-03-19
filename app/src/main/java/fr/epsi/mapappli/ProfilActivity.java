package fr.epsi.mapappli;

import android.os.Bundle;

public class ProfilActivity extends EpsiActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setTitle("Groupe d'étudiants");
        showBack();
    }
}
