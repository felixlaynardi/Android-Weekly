package umn.ac.week11_28641.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import umn.ac.week11_28641.Model.PostModel;
import umn.ac.week11_28641.R;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.AdapterHolder> {
    List<PostModel> mModels;

    public PostAdapter(List<PostModel> Models){
        mModels = Models;
    }

    @NonNull
    @Override
    public AdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_list, parent, false);

        return new AdapterHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHolder holder, int position) {
        holder.userId.setText(String.valueOf(mModels.get(position).getUserId()));
        holder.id.setText(String.valueOf(mModels.get(position).getId()));
        holder.title.setText(mModels.get(position).getTitle());
        holder.body.setText(mModels.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return mModels.size();
    }


    public class AdapterHolder extends RecyclerView.ViewHolder{
        public TextView userId;
        public TextView id;
        public TextView title;
        public TextView body;

        public AdapterHolder(@NonNull View itemView) {
            super(itemView);

            userId = itemView.findViewById(R.id.userId);
            id = itemView.findViewById(R.id.id);
            title = itemView.findViewById(R.id.title);
            body = itemView.findViewById(R.id.body);
        }

    }
}
