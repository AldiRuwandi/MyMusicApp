package com.example.mymusicapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymusicapp.PlayMusikDuaActivity;
import com.example.mymusicapp.R;
import com.example.mymusicapp.model.MusikDuaModel;

import java.util.List;

public class MusikDuaAdapter extends RecyclerView.Adapter<MusikDuaAdapter.MusikDuaViewHolder> {

    Context context;
    List<MusikDuaModel> musikDuaModelList;

    public MusikDuaAdapter(Context context, List<MusikDuaModel> musikDuaModelList) {
        this.context = context;
        this.musikDuaModelList = musikDuaModelList;
    }

    @NonNull
    @Override
    public MusikDuaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.musik_dua_row_item, parent, false);
        return new MusikDuaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusikDuaViewHolder holder, int position) {

        holder.musik_dua_title.setText(musikDuaModelList.get(position).getMusikDuaName());
        holder.musik_durasi_dua.setText(musikDuaModelList.get(position).getMusikDuaDurasi());
        holder.musik_dua_image.setImageResource(musikDuaModelList.get(position).getImageDuaUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, PlayMusikDuaActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return musikDuaModelList.size();
    }

    public static class MusikDuaViewHolder extends RecyclerView.ViewHolder{

        ImageView musik_dua_image;
        TextView musik_dua_title, musik_durasi_dua;

        public MusikDuaViewHolder(@NonNull View itemView) {
            super(itemView);

            musik_dua_title=itemView.findViewById(R.id.musik_dua_title);
            musik_durasi_dua=itemView.findViewById(R.id.durasi_dua_musik);
            musik_dua_image=itemView.findViewById(R.id.musik_dua_image);
        }
    }
}
