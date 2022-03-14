package BtapSection12.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap a va b :");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        try {
            phepChia(a,b);
        }catch (ZeroException zeroException) {
            zeroException.printStackTrace();
            System.out.println("Loi : " +zeroException.getErro());
        }
    }
    public static void phepChia(int a , int b) throws ZeroException {

        if (b == 0 ) {
            ZeroException zeroException = new ZeroException();
            zeroException.setErro("So chia bang 0 ! ");
            throw zeroException;
        }

        System.out.println("Thuong la : " +(float) (a/b));
    }
}
