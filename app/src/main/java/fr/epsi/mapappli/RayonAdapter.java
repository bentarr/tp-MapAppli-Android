package fr.epsi.mapappli;

import android.view.View;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RayonAdapter extends RecyclerView.Adapter<RayonAdapter.ViewHolder> {

    EpsiActivity epsiActivity;
    ArrayList<Rayon> rayon = new ArrayList();

    public RayonAdapter(EpsiActivity activity, ArrayList<Rayon> rayon)
    {
        this.epsiActivity = activity;
        this.rayon = rayon;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewTitle;
        private final View layoutCellCategorie;

        public ViewHolder(View view) {
            super(view);
            textViewTitle = view.findViewById(R.id.textViewTitle);
            layoutCellCategorie = view.findViewById(R.id.layoutCellCategorie);
        }
}
