package com.example.mymusicapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymusicapp.HomeActivity;
import com.example.mymusicapp.PlayMusikActivity;
import com.example.mymusicapp.R;
import com.example.mymusicapp.model.MusikModel;

import java.util.List;

public class MusikAdapter extends RecyclerView.Adapter<MusikAdapter.MusikViewHolder> {

    Context context;
    List<MusikModel> musikModelList;

    public MusikAdapter(Context context, List<MusikModel> musikModelList) {
        this.context = context;
        this.musikModelList = musikModelList;
    }

    @NonNull
    @Override
    public MusikViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.musik_row_item, parent, false);
        return new MusikViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MusikViewHolder holder, final int position) {

        holder.musik_title.setText(musikModelList.get(position).getMusikName());
        holder.musik_durasi.setText(musikModelList.get(position).getMusikDurasi());
        holder.musik_image.setImageResource(musikModelList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, PlayMusikActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return musikModelList.size();
    }

    public static class MusikViewHolder extends RecyclerView.ViewHolder{

        TextView musik_title, musik_durasi;
        ImageView musik_image;

        public MusikViewHolder(@NonNull View itemView) {
            super(itemView);

            musik_title=itemView.findViewById(R.id.musik_title);
            musik_durasi=itemView.findViewById(R.id.durasi_musik);
            musik_image=itemView.findViewById(R.id.musik_image);
        }
    }
}
