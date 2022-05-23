package com.example.ktbt4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.ktbt4.R;

import java.util.ArrayList;

public class Main1Activity extends AppCompatActivity {
    ListView listthongbao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("THÔNG BÁO");
        actionBar.setDisplayHomeAsUpEnabled(true);
        listthongbao=findViewById(R.id.list_thong_bao);
        ArrayList<ThongBao> thongBaos = new ArrayList<>();
        ThongBao thongbao1 = new ThongBao(R.drawable.img,"Solar Boat Challege 2022 - Khơi dậy niềm đam mê khoa học kỹ thuật","Ngày: 30-04-2022","Điểm đến của những cá nhân đam mê khoa học công nghệ, Trường CĐKT Cao Thắng với lịch sử hơn 116 năm trồng người, luôn đi đầu trong công tác giáo dục - đào tạo.");
        thongBaos.add(thongbao1);
        ThongBao thongbao2 = new ThongBao(R.drawable.img_1,"Nhiều cơ hội việc làm dành cho sinh viên tốt nghiệp Trường Cao đẳng Kỹ thuật Cao Thắng","Ngày: 29-04-2022 ","Sinh viên tốt nghiệp Trường Cao đẳng Kỹ thuật Cao Thắng được doanh nghiệp đánh giá vững chuyên môn, thành thạo kỹ năng, có tác phong chuyên nghiệp và được tuyển dụng ngay sau khi tốt nghiệp.");
        thongBaos.add(thongbao2);
        ThongBao thongbao3 = new ThongBao(R.drawable.img_2,"Hội thảo “Học Tiếng Nhật – Cơ hội làm việc tại các doanh nghiệp Nhật Bản”","Ngày: 20-04-2022","Ngày 16 tháng 04 năm 2022, trường Cao đẳng Kỹ thuật Cao Thắng đã tổ chức buổi hội thảo “Học tiếng Nhật - Cơ hội làm việc tại các doanh nghiệp Nhật Bản.");
        thongBaos.add(thongbao3);
        AdapterThongBao adapterThongBao=new AdapterThongBao(Main1Activity.this,R.layout.item_thongbao,thongBaos);
        listthongbao.setAdapter(adapterThongBao);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:break;
        }
        return super.onOptionsItemSelected(item);
    }
}