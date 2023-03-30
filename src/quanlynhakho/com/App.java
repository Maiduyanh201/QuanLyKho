package quanlynhakho.com;

import quanlynhakho.com.controller.Controller;
import quanlynhakho.com.service.ServiceSanPham;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        ServiceSanPham serviceSanPham = new ServiceSanPham();
//        try{
//            int x = 1/0;
//        }
//        catch (Exception){
//            System.out.println("không chia được cho 0");
//        }
        do {
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Xem sản phẩm");
            System.out.println("3.Sửa sản phẩm");
            System.out.println("4.Xóa sản phẩm");
            System.out.println("5.Tìm sản phẩm");
            System.out.println("6.Xuất khẩu sản phẩm");
            System.out.println("7.Nhập khẩ sản phẩm");
            System.out.println("8.thoát chương trình");
            int i = scanner.nextInt();
            switch (i){
                case 1:controller.themSanPham();
                break;
                case 2:controller.xemSanPham();
                break;
                case 3:controller.suaSanPham();
                break;
                case 4:controller.xoaSanPham();
                break;
                case 5:
                    do {
                        System.out.println("1.Tìm sản phẩm theo id");
                        System.out.println("2.Tìm sản phẩm theo tên");
                        int i1 = scanner.nextInt();
                        switch (i1){
                            case 1:controller.timIdSanPham();
                            break;
                            case 2:controller.timTenSanPham();
                            break;
                            default:
                                break;
                        }
                    }while (true);
                case 6:controller.xuatKhau();
                break;
                case 7:controller.nhapKhau();
                break;
                case 8:return;
                    default:
                    break;
            }
        }while (true);
    }
}
