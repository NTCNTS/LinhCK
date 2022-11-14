package com.example.remember;

public class Singer {
    String ten,nghedanh,quocgia,sao;
    int hinh;

    public Singer(String ten, String nghedanh, String quocgia, String sao, int hinh) {
        this.ten = ten;
        this.nghedanh = nghedanh;
        this.quocgia = quocgia;
        this.sao = sao;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String name) {
        this.ten = ten;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getSao() {
        return sao;
    }

    public void setSao(String sao) {
        this.sao = sao;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}




