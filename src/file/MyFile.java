package file;

import exep.MyExeption;
import quanlynhakho.com.model.NhaKho;

import java.io.*;

public class MyFile {
    public static void main(String[] args) {
        outPut();
        inPut();

    }
    public void outPut(Object o,String nameFile){
    }
    public static void outPut(){
        try {
            //tạo file
            FileOutputStream file = new FileOutputStream("phone.txt");
            //ghi dữ liệu vào trong file
            ObjectOutputStream os = new ObjectOutputStream(file);
            NhaKho phone = new NhaKho(1,30,"IPX");
            os.writeObject(phone);
            //đóng file
            os.close();
        }catch (Exception e){}
    }
    public static void inPut(){
        try {
            FileInputStream file = new FileInputStream("phone.txt");
            ObjectInputStream ois = new ObjectInputStream(file);
            NhaKho phone = (NhaKho) ois.readObject();
            ois.close();
            System.out.println(phone.toString());
        }catch (Exception e){

        }
    }

    public void writeFile(Object o,String nameFile){
        try {
            FileOutputStream fos = new FileOutputStream(nameFile);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(o);
            os.close();
        }catch (Exception e){
        }
    }
    public Object readFile(String file){
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            ois.close();
            return o;
        }catch (Exception e){
            System.out.println("loi ghi ra file");
            throw new MyExeption(e.getMessage(),"404");
        }
    }
}
