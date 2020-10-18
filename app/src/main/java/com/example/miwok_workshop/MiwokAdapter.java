package com.example.miwok_workshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MiwokAdapter extends RecyclerView.Adapter<MiwokAdapter.MiwokViewHolder> {

    private Context context;
    private List<MiwokModel> list;
    int colorID;

    public MiwokAdapter(Context context, List<MiwokModel> list, int colorResourceID){
        this.context = context;
        this.list = list;
        this.colorID = colorResourceID;
    }

    @NonNull
    @Override
    public MiwokViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        MiwokViewHolder viewHolder = new MiwokViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MiwokViewHolder holder, int position) {
        holder.defaultTranslation.setText(list.get(position).getmDefaulttranslation());
        holder.miwokTranslation.setText(list.get(position).getmMiwoktranslation());
        int color = ContextCompat.getColor(context,colorID);
        holder.itemView.setBackgroundColor(color);
        if (list.get(position).hasImage()){
            holder.imageView.setImageResource(list.get(position).getmImageResourceId());
            holder.imageView.setVisibility(View.VISIBLE);
        }else{
            holder.imageView.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MiwokViewHolder extends RecyclerView.ViewHolder{

        TextView defaultTranslation, miwokTranslation;
        ImageView imageView;

        public MiwokViewHolder(@NonNull View itemView) {
            super(itemView);
            defaultTranslation = itemView.findViewById(R.id.tv1);
            miwokTranslation = itemView.findViewById(R.id.tv2);
            imageView = itemView.findViewById(R.id.list_item1);
        }
    }
}
