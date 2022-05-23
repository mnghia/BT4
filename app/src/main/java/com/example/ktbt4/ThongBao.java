package com.example.ktbt4;

public class ThongBao {
    int logothongbao;
    String tintuc;
    String ngay;
    String thongbao;

    public ThongBao(int logothongbao, String tintuc, String ngay, String thongbao) {
        this.logothongbao = logothongbao;
        this.tintuc = tintuc;
        this.ngay = ngay;
        this.thongbao = thongbao;
    }

    public int getLogothongbao() {
        return logothongbao;
    }

    public void setLogothongbao(int logothongbao) {
        this.logothongbao = logothongbao;
    }

    public String getTintuc() {
        return tintuc;
    }

    public void setTintuc(String tintuc) {
        this.tintuc = tintuc;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getThongbao() {
        return thongbao;
    }

    public void setThongbao(String thongbao) {
        this.thongbao = thongbao;
    }
}
