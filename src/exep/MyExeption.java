package exep;

public class MyExeption extends RuntimeException{
    public MyExeption() {
    }

    public MyExeption(String message, String status) {
        System.out.println(message);
        System.out.println(status);
    }
}
