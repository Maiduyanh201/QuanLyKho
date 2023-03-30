package quanlynhakho.com.controller;

import quanlynhakho.com.model.NhaKho;
import quanlynhakho.com.service.ServiceSanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    //gọi hàm service
    public ServiceSanPham serviceSanPham = new ServiceSanPham();
    Scanner scanner = new Scanner(System.in);
    public void themSanPham(){
        System.out.println("1.Nhập id sản phẩm");
        int id = scanner.nextInt();
        System.out.println("2.Nhập số lượng sản phẩm");
        int id1 = scanner.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("3.Nhập tên sản phẩm");
        String name = scanner.nextLine();
        NhaKho nhaKho = new NhaKho(id,id1,name);
        serviceSanPham.themSanPham(nhaKho);
    }
    public void suaSanPham(){
        try {
            System.out.println("1.Nhập id sản phẩm");
            int id = scanner.nextInt();
            System.out.println("2.Nhập số lượng sản phẩm");
            int id1 = scanner.nextInt();
            Scanner scanner = new Scanner(System.in);
            System.out.println("3.Nhập tên sản phẩm");
            String name = scanner.nextLine();
            NhaKho nhaKho = new NhaKho(id,id1,name);
            serviceSanPham.suaSanPham(nhaKho);
        }catch (Exception e){
            System.out.println("lỗi");
        }

    }
    public void xemSanPham(){
        ArrayList<NhaKho> listNhaKho;
        listNhaKho = serviceSanPham.getListSanPham();
        for (int i = 0; i < listNhaKho.size(); i++) {
            System.out.println(listNhaKho.get(i).toString());
        }
    }
    public void xoaSanPham(){
        try {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Nhập id cần xóa:");
            int id = scanner1.nextInt();
            serviceSanPham.xoaSanPham(id);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(),e.getCause());
            //throw: khai báo 1 ngoại lệ
        }finally {
            System.out.println("hẹn gặp lại");
            //finally: đi đến cuối chương trình
        }

    }
    public void timIdSanPham(){
        try {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Nhập id cần tìm:");
            int id1 = scanner.nextInt();
            serviceSanPham.timIdSanPham(id1);
        }catch (Exception e){
            System.out.println("Lỗi");
        }
    }
    public void timTenSanPham(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm:");
        String name = scanner.nextLine();
        serviceSanPham.timTenSanPham(name);
    }
    public void nhapKhau(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập id cần tìm:");
        int id = scanner1.nextInt();
        System.out.println("Nhập số lượng nhập kho:");
        int id1 = scanner1.nextInt();
        serviceSanPham.nhapKhau(id,id1);
    }
    public void xuatKhau(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập id cần tìm:");
        int id = scanner1.nextInt();
        System.out.println("Nhập số lượng xuất kho:");
        int id1 = scanner1.nextInt();
        serviceSanPham.nhapKhau(id,id1);
    }
}
