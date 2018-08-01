package com.ptp.phamtanphat.listviewnangcao1607;

public class Monan  {
    private String ten;
    private Integer gia;
    private Integer hinhanh;

    public Monan(String ten, Integer gia, Integer hinhanh) {
        this.ten = ten;
        this.gia = gia;
        this.hinhanh = hinhanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public Integer getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(Integer hinhanh) {
        this.hinhanh = hinhanh;
    }
}
