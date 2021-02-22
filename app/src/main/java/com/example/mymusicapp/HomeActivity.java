package com.example.mymusicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.mymusicapp.adapter.MusikAdapter;
import com.example.mymusicapp.adapter.MusikDuaAdapter;
import com.example.mymusicapp.model.MusikDuaModel;
import com.example.mymusicapp.model.MusikModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    RecyclerView musikRecycler, musikDuaRecycler;
    MusikAdapter musikAdapter;
    MusikDuaAdapter musikDuaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);

        List<MusikModel> musikModelList=new ArrayList<>();
        musikModelList.add(new MusikModel(1, "Ada apa denganmu", "4.41", R.drawable.peterpan));
        musikModelList.add(new MusikModel(2, "Dibalik Awan", "4.04", R.drawable.peterpan));
        musikModelList.add(new MusikModel(3, "Walau habis terang", "3.45", R.drawable.peterpan));
        musikModelList.add(new MusikModel(4, "Khayalan tingkat tinggi", "3.22", R.drawable.peterpan));

        List<MusikDuaModel> musikDuaModelList=new ArrayList<>();
        musikDuaModelList.add(new MusikDuaModel(1, "Pejantan Tangguh", "3.25", R.drawable.sheilaonseven));
        musikDuaModelList.add(new MusikDuaModel(2, "Anugrah Terindah", "3.43", R.drawable.sheilaonseven));
        musikDuaModelList.add(new MusikDuaModel(3, "Sahabat Sejati", "4.02", R.drawable.sheilaonseven));
        musikDuaModelList.add(new MusikDuaModel(4, "Melompat Lebih Tinggi", "3.20", R.drawable.sheilaonseven));

        setMusikRecycler(musikModelList);
        setMusikDuaRecycler(musikDuaModelList);
    }

    public void setMusikRecycler(List<MusikModel> musikModelList){
        musikRecycler=findViewById(R.id.musik_recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        musikRecycler.setLayoutManager(layoutManager);
        musikAdapter=new MusikAdapter(this, musikModelList);
        musikRecycler.setAdapter(musikAdapter);
    }

    public void setMusikDuaRecycler(List<MusikDuaModel> musikDuaModelList){
        musikDuaRecycler=findViewById(R.id.musik_dua_recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        musikDuaRecycler.setLayoutManager(layoutManager);
        musikDuaAdapter=new MusikDuaAdapter(this, musikDuaModelList);
        musikDuaRecycler.setAdapter(musikDuaAdapter);
    }
}
