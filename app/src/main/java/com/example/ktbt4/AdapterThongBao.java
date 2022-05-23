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

import java.util.ArrayList;
import java.util.List;

public class AdapterThongBao extends ArrayAdapter<ThongBao> {
    Context context;
    int res;
    ArrayList<ThongBao> listthongbao;
    public AdapterThongBao(@NonNull Context context, int resource, @NonNull ArrayList<ThongBao> objects) {
        super(context, resource, objects);
        this.context = context;
        this.res = resource;
        this.listthongbao = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
            convertView= LayoutInflater.from(context).inflate(res,parent,false);
        ImageView logo =convertView.findViewById(R.id.logothongbao);
        TextView ten=convertView.findViewById(R.id.tintuc);
        TextView ca=convertView.findViewById(R.id.ngay);
       TextView tbao=convertView.findViewById(R.id.thongbao);
        ThongBao thongbao=listthongbao.get(position);
        int iconlogo=thongbao.getLogothongbao();
        logo.setImageResource(iconlogo);
        String tintuc=thongbao.getTintuc();
        ten.setText(tintuc);
        String ngay=thongbao.getNgay();
        ca.setText(ngay);
        String bao=thongbao.getThongbao();
        tbao.setText(bao);
        return convertView;
    }
}
