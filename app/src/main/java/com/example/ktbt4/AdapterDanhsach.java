package com.example.ktbt4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.ktbt4.Danhsach;
import com.example.ktbt4.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterDanhsach extends ArrayAdapter<Danhsach> {

    Context context;
    int res;
    ArrayList<Danhsach> listdanhsach;
    public AdapterDanhsach(@NonNull Context context, int resource, @NonNull ArrayList<Danhsach> objects) {
        super(context, resource, objects);
        this.context = context;
        this.res = resource;
        this.listdanhsach = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
            convertView= LayoutInflater.from(context).inflate(res,parent,false);
        ImageView logo =convertView.findViewById(R.id.logo);
        TextView ten=convertView.findViewById(R.id.ten);
        TextView ca=convertView.findViewById(R.id.ca);
        ImageButton next=convertView.findViewById(R.id.next);
        Danhsach ds=listdanhsach.get(position);
        int iconlogo=ds.getLogo();
        logo.setImageResource(iconlogo);
        String tenlop=ds.getTen();
        ten.setText(tenlop);
        String tenca=ds.getCa();
        ca.setText(tenca);
        int iconnext=ds.getIcon();
        next.setImageResource(iconnext);
        return convertView;
    }
}
