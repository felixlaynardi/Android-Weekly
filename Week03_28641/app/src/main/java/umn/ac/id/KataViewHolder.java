package umn.ac.id;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KataViewHolder extends RecyclerView.ViewHolder{
    public final TextView kataItemView;
    final DaftarKataAdapter mAdapter;

    public KataViewHolder(@NonNull View itemView, DaftarKataAdapter adapter){
        super(itemView);
        kataItemView = itemView.findViewById(R.id.kata);
        this.mAdapter = adapter;
    }

}
