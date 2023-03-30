package quanlynhakho.com.service;

import quanlynhakho.com.model.NhaKho;

import java.util.ArrayList;

public class ServiceSanPham {
    ArrayList<NhaKho> listSanPham;
    public ArrayList<NhaKho> getListSanPham(){
        if (listSanPham == null){
            listSanPham = new ArrayList<>();
            NhaKho sanPham = new NhaKho(1,10,"dầu gội");
            NhaKho sanPham1 = new NhaKho(2,15,"sữa tắm");
            NhaKho sanPham2 = new NhaKho(3,40,"kem đánh răng");
            NhaKho sanPham3 = new NhaKho(4,25,"sữa rửa mặt");
            listSanPham.add(sanPham);
            listSanPham.add(sanPham1);
            listSanPham.add(sanPham2);
            listSanPham.add(sanPham3);
        }
        return listSanPham;
    }
    public void themSanPham(NhaKho sanPham){
        getListSanPham();
        listSanPham.add(sanPham);
    }
    public void suaSanPham(NhaKho sanPham) throws Exception{
        boolean condition = true;
        for (NhaKho sanPham1 : listSanPham){
            if (sanPham1.getIdSanPham() == sanPham.getIdSanPham()){
                sanPham1.setIdSanPham(sanPham.getIdSanPham());
                sanPham1.setTenSanPham(sanPham.getTenSanPham());
                sanPham1.setSoLuong(sanPham.getSoLuong());
                condition = false;
                break;
            }
            if (condition){
                System.out.println("không tồn tại id sản phẩm");
            }
        }
    }
    public void xoaSanPham(int idSanPham) {
        boolean condition = true;
        for (NhaKho sanPham1 : listSanPham) {
            if (sanPham1.getIdSanPham() == idSanPham) {
                listSanPham.remove(sanPham1);
                System.out.println("Xóa SP thành công");
                condition = false;
                break;
            }
            if (condition) {
                System.out.println("không tồn tại sản phẩm này");
            }
        }
    }
//        try {
//            for (int i = 0; i < listSanPham.size(); i++) {
//                if (idSanPham == listSanPham.get(i).getIdSanPham()){
//                    listSanPham.remove(i);
//                    break;
//                }
//            }
//        }catch (NullPointerException e){
//            System.out.println("lỗi");
//        }catch (ArithmeticException a){
//
//        }
//    }
    public void timIdSanPham(int idSanPham){
        boolean condition = true;
        for (NhaKho sanPham1 : listSanPham){
            if (sanPham1.getIdSanPham() == idSanPham){
                System.out.println(sanPham1.toString());
                condition = false;
                break;
            }
            if (condition){
                System.out.println("không tồn tại id này");
            }
        }
    }
    public void timTenSanPham(String name){
        boolean condition = true;
        for (NhaKho sanPham : listSanPham){
            if (sanPham.getTenSanPham().equals(name)){
                System.out.println(sanPham.toString());
                condition = false;
                break;
            }
            if (condition){
                System.out.println("không tồn tại sản phẩm này");
            }
        }
    }
    public void nhapKhau(int id, int soLuong){
        boolean condition = true;
        for (NhaKho sanPham : listSanPham){
            if (sanPham.getIdSanPham() == id){
                sanPham.setSoLuong(sanPham.getSoLuong()+soLuong);
                System.out.println("Nhập thành công");
                condition = false;
                break;
            }
            if (condition){
                System.out.println("không tồn tại id SP");
            }
        }
    }
    public void xuatKhau(int id, int soLuong){
        boolean condition = true;
        for (NhaKho sanPham : listSanPham){
            if (sanPham.getSoLuong() == id){
                if (sanPham.getSoLuong() >= soLuong){
                    sanPham.setSoLuong(sanPham.getSoLuong() - soLuong);
                    System.out.println("Xuất kho thành công");
                }else {
                    System.out.println("Vượt quá hàng trong kho");
                }
                condition = false;
                break;
            }
        }
        if (condition){
            System.out.println("không tồn tại id SP");
        }
    }
}
