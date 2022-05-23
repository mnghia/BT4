package com.example.ktbt4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ktbt4.Danhsach;
import com.example.ktbt4.Main1Activity;
import com.example.ktbt4.Main2Activity;
import com.example.ktbt4.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    ListView listdanhsach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("LỊCH HỌC");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
        listdanhsach=findViewById(R.id.list_danh_sach);
        ArrayList<Danhsach> danhsach =new ArrayList<>();
        Danhsach danhsach1 = new Danhsach(R.drawable.logo,"CĐ ĐTTT 20A","CA 1",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach1);
        Danhsach danhsach2 = new Danhsach(R.drawable.logo,"CĐ ĐTTT 20B","CA 2",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach2);
        Danhsach danhsach3 = new Danhsach(R.drawable.logo,"CĐ ĐTTT 21A","CA 1",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach3);
        Danhsach danhsach4 = new Danhsach(R.drawable.logo,"CĐ ĐTTT 21B","CA 2",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach4);
        Danhsach danhsach5 = new Danhsach(R.drawable.logo,"CĐ ĐTTT 22A","CA 1",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach5);
        Danhsach danhsach6 = new Danhsach(R.drawable.logo,"CĐ ĐTTT 22B","CA 2",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach6);
        Danhsach danhsach7 = new Danhsach(R.drawable.logo,"CĐ ĐTTT 23A","CA 1",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach7);
        Danhsach danhsach8 = new Danhsach(R.drawable.logo,"CĐ ĐTTT 23B","CA 2",R.drawable.ic_baseline_navigate_next_24);
        danhsach.add(danhsach8);
        AdapterDanhsach adapterDanhSach=new AdapterDanhsach(MainActivity.this,R.layout.item_danhsach,danhsach);
        listdanhsach.setAdapter(adapterDanhSach);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                //onBackPressed();
                Toast.makeText(this, "Bạn vừa bấm menu", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu1:
                //code xử lý khi bấm menu1
                openActivity1();
                break;
            case R.id.menu2:
                //code xử lý khi bấm menu2
                openActivity2();
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
    private void openActivity1() {
        intent = new Intent(this, Main1Activity.class);
        startActivity(intent);
    }

    private void openActivity2() {
        intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}