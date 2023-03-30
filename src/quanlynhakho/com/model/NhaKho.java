package quanlynhakho.com.model;

import java.io.Serializable;

public class NhaKho implements Serializable {
    private int idSanPham,soLuong;
    private String tenSanPham;

    public NhaKho() {
    }

    public NhaKho(int idSanPham, int soLuong, String tenSanPham) {
        this.idSanPham = idSanPham;
        this.soLuong = soLuong;
        this.tenSanPham = tenSanPham;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    @Override
    public String toString() {
        return "NhaKho{" +
                "idSanPham=" + idSanPham +
                ", soLuong=" + soLuong +
                ", tenSanPham='" + tenSanPham + '\'' +
                '}';
    }
}
