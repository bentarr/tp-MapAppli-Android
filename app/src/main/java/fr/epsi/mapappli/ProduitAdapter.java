package fr.epsi.mapappli;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.ArrayList;

import fr.epsi.mapappli.EpsiActivity;
import fr.epsi.mapappli.Produit;
import fr.epsi.mapappli.R;

public class ProduitAdapter extends RecyclerView.Adapter<ProduitAdapter.ViewHolder> implements Serializable {
    EpsiActivity activity;
    ArrayList<Produit> produit;

    public ProduitAdapter(EpsiActivity activity, ArrayList<Produit> produit) {
        this.activity = activity;
        this.produit = produit;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_cardview_produit, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Produit produits = produit.get(position);
        holder.getTextViewName().setText(produits.getNom());
        holder.getViewDes().setText(produits.getDescription());
        Picasso.get().load(produits.getUrl()).into(holder.getImage());
        holder.getLayoutCell().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailActivity.displayActivity(activity, produits);
            }
        });
    }

    @Override
    public int getItemCount() {
        return produit.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewName;
        private final View layoutCell;
        private final TextView description;
        private final ImageView image;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            textViewName = view.findViewById(R.id.textViewName);
            layoutCell = view.findViewById(R.id.layoutCell);
            description = view.findViewById(R.id.textViewDescription);
            image = view.findViewById(R.id.imageViewProduit);
        }

        public View getLayoutCell() {
            return layoutCell;
        }
        public TextView getTextViewName() {
            return textViewName;
        }
        public TextView getViewDes() {return description;}
        public ImageView getImage() {return image;}
    }


}
