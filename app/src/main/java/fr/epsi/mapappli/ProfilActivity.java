package fr.epsi.mapappli;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfilActivity extends EpsiActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Students students = (Students) getIntent().getSerializableExtra("Students");
        setTitle(students.getName());
        showBack();

        TextView Name = findViewById(R.id.Name);
        Name.setText(students.getName());

        TextView Mail = findViewById(R.id.Mail);
        Mail.setText(students.getMail());

        TextView Group = findViewById(R.id.Group);
        Group.setText(students.getGroup());
    }
}