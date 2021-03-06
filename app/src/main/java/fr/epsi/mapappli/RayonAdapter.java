package fr.epsi.mapappli;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;



public class RayonAdapter extends RecyclerView.Adapter<RayonAdapter.ViewHolder> {

    EpsiActivity epsiActivity;
    ArrayList<Rayon> rayons;

    public RayonAdapter(EpsiActivity activity, ArrayList<Rayon> rayons) {
        this.epsiActivity = activity;
        this.rayons = rayons;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView rayonTitle;
        private final View layoutCellCategorie;

        public ViewHolder(View view) {
            super(view);
            rayonTitle = view.findViewById(R.id.textViewTitle);
            layoutCellCategorie = view.findViewById(R.id.layoutCellCategorie);
        }

        public TextView getRayonTitle() {
            return rayonTitle;
        }

        public View getLayoutCellCategorie() {
            return layoutCellCategorie;
        }
    }

    @Override
    public RayonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_cardview_rayon, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RayonAdapter.ViewHolder holder, int position) {
        final Rayon rayon = rayons.get(position);
        final String url = rayon.getRayonUrl();
        holder.getRayonTitle().setText(rayon.getTitle());
            holder.getLayoutCellCategorie().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ProduitActivity.displayActivity(epsiActivity, rayon.getTitle(), url);
                }
            });
    }

    @Override
    public int getItemCount() {
        return rayons.size();
    }
}

